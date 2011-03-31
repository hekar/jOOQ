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

package org.jooq.util.oracle;

import static org.jooq.util.oracle.sys.tables.AllColComments.ALL_COL_COMMENTS;
import static org.jooq.util.oracle.sys.tables.AllTabCols.ALL_TAB_COLS;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jooq.Record;
import org.jooq.util.AbstractTableDefinition;
import org.jooq.util.ColumnDefinition;
import org.jooq.util.DataTypeDefinition;
import org.jooq.util.Database;
import org.jooq.util.DefaultColumnDefinition;
import org.jooq.util.DefaultDataTypeDefinition;
import org.jooq.util.oracle.sys.tables.AllColComments;
import org.jooq.util.oracle.sys.tables.AllTabCols;

/**
 * @author Lukas Eder
 */
public class OracleTableDefinition extends AbstractTableDefinition {

	public OracleTableDefinition(Database database, String name, String comment) {
		super(database, name, comment);
	}

	@Override
	public List<ColumnDefinition> getColumns0() throws SQLException {
		List<ColumnDefinition> result = new ArrayList<ColumnDefinition>();

		for (Record record : create().select(
		        AllTabCols.DATA_TYPE,
		        AllTabCols.DATA_PRECISION,
		        AllTabCols.DATA_SCALE,
		        AllTabCols.COLUMN_NAME,
		        AllTabCols.COLUMN_ID,
		        AllColComments.COMMENTS)
		    .from(ALL_TAB_COLS)
		    .join(ALL_COL_COMMENTS)
		    .on(AllTabCols.OWNER.equal(AllColComments.OWNER),
		        AllTabCols.TABLE_NAME.equal(AllColComments.TABLE_NAME),
		        AllTabCols.COLUMN_NAME.equal(AllColComments.COLUMN_NAME))
	        .where(AllTabCols.OWNER.equal(getSchemaName()))
	        .and(AllTabCols.TABLE_NAME.equal(getName()))
	        .orderBy(AllTabCols.COLUMN_ID)
	        .fetch()) {

            DataTypeDefinition type = new DefaultDataTypeDefinition(getDatabase(),
                record.getValue(AllTabCols.DATA_TYPE),
                record.getValueAsInteger(AllTabCols.DATA_PRECISION, 0),
                record.getValueAsInteger(AllTabCols.DATA_SCALE, 0));

			DefaultColumnDefinition column = new DefaultColumnDefinition(
			    getDatabase(),
			    getName(),
			    record.getValue(AllTabCols.COLUMN_NAME),
			    record.getValueAsInteger(AllTabCols.COLUMN_ID),
			    type,
			    record.getValue(AllColComments.COMMENTS));

			result.add(column);
		}

		return result;
	}
}
