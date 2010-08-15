/**
 * Copyright (c) 2009, Lukas Eder, lukas.eder@gmail.com
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
import java.util.List;

import org.jooq.Field;

/**
 * @author Lukas Eder
 */
class FunctionImpl<T> extends AbstractNamedQueryPart implements Field<T> {

	private static final long serialVersionUID = 347252741712134044L;

	private final Class<T> type;
	private final List<Field<?>> fields;

	FunctionImpl(String name, Class<T> type, Field<?>... fields) {
		super (name);

		this.type = type;
		this.fields = Arrays.asList(fields);
	}

	@Override
	public final Class<T> getType() {
		return type;
	}

	@Override
	public final String toSQLReference(boolean inlineParameters) {
		StringBuilder sb = new StringBuilder();

		sb.append(getName());
		sb.append("(");

		String separator = "";
		if (fields.isEmpty()) {
			sb.append(toSQLEmptyFields(inlineParameters));
		} else {
			for (Field<?> field : fields) {
				sb.append(separator);
				sb.append(toSQLField(field, inlineParameters));

				separator = ", ";
			}
		}

		sb.append(")");

		return sb.toString();
	}

	protected String toSQLField(Field<?> field, boolean inlineParameters) {
		return field.toSQLReference(inlineParameters);
	}

	protected String toSQLEmptyFields(boolean inlineParameters) {
		return "";
	}

	@Override
	public int bind(PreparedStatement stmt, int initialIndex) throws SQLException {
		int result = initialIndex;
		
		for (Field<?> field : getFields()) {
			result = field.bind(stmt, result);
		}
		
		return result;
	}

	protected final List<Field<?>> getFields() {
		return fields;
	}

	@Override
	public Field<T> alias(String alias) {
		return new FieldAlias<T>(this, alias);
	}
}