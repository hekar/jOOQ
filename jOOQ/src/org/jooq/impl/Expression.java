/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import org.jooq.Configuration;
import org.jooq.Field;

class Expression<T> extends AbstractField<T> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -5522799070693019771L;
    private final Field<T> lhs;
    private final FieldList rhs;
    private final ExpressionOperator operator;

    Expression(Configuration configuration, ExpressionOperator operator, Field<T> lhs, Field<?> rhs, Field<?>... rhs0) {
        super(configuration, operator.toSQL(), lhs.getDataType());

        this.operator = operator;
        this.lhs = lhs;
        this.rhs = new FieldList(configuration);
        this.rhs.add(rhs);
        this.rhs.addAll(Arrays.asList(rhs0));
    }

    @Override
    public final Field<T> add(Field<? extends Number> value) {
        if (operator == ExpressionOperator.ADD) {
            rhs.add(value);
            return this;
        }

        return super.add(value);
    }

    @Override
    public final Field<T> multiply(Field<? extends Number> value) {
        if (operator == ExpressionOperator.MULTIPLY) {
            rhs.add(value);
            return this;
        }

        return super.multiply(value);
    }

    @SuppressWarnings("unchecked")
    @Override
    public Field<String> concatenate(Field<String> field, Field<String>... fields) {
        if (operator == ExpressionOperator.CONCAT) {
            rhs.add(field);
            rhs.addAll(Arrays.asList(fields));
            return (Field<String>) this;
        }

        return super.concatenate(field, fields);
    }

    @Override
    public final String toSQLReference(Configuration configuration, boolean inlineParameters) {
        StringBuilder sb = new StringBuilder();

        sb.append("(");
        sb.append(lhs.getQueryPart().toSQLReference(configuration, inlineParameters));

        for (Field<?> field : rhs) {
            sb.append(" ");
            sb.append(operator.toSQL());
            sb.append(" ");
            sb.append(field.getQueryPart().toSQLReference(configuration, inlineParameters));
        }

        sb.append(")");
        return sb.toString();
    }

    @Override
    public final int bind(Configuration configuration, PreparedStatement stmt, int initialIndex) throws SQLException {
        int result = initialIndex;

        result = lhs.getQueryPart().bind(configuration, stmt, result);
        result = rhs.getQueryPart().bind(configuration, stmt, result);

        return result;
    }

    @Override
    public final boolean isNullLiteral() {
        return false;
    }
}