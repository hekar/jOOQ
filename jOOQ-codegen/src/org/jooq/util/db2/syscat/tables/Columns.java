/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.db2.DB2DataType;
import org.jooq.util.db2.syscat.Syscat;
import org.jooq.util.db2.syscat.tables.records.ColumnsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Columns extends TableImpl<ColumnsRecord> {

	private static final long serialVersionUID = -847648451;

	/**
	 * The singleton instance of COLUMNS
	 */
	public static final Columns COLUMNS = new Columns();

	/**
	 * The class holding records for this type
	 */
	private static final Class<ColumnsRecord> __RECORD_TYPE = ColumnsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ColumnsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TABSCHEMA = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "TABSCHEMA", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TABNAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "TABNAME", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLNAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "COLNAME", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Short> COLNO = new TableFieldImpl<ColumnsRecord, Short>(SQLDialect.DB2, "COLNO", DB2DataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TYPESCHEMA = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "TYPESCHEMA", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TYPENAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "TYPENAME", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> LENGTH = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.DB2, "LENGTH", DB2DataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Short> SCALE = new TableFieldImpl<ColumnsRecord, Short>(SQLDialect.DB2, "SCALE", DB2DataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> DEFAULT = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "DEFAULT", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> NULLS = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "NULLS", DB2DataType.CHARACTER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Short> CODEPAGE = new TableFieldImpl<ColumnsRecord, Short>(SQLDialect.DB2, "CODEPAGE", DB2DataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLLATIONSCHEMA = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "COLLATIONSCHEMA", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COLLATIONNAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "COLLATIONNAME", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> LOGGED = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "LOGGED", DB2DataType.CHARACTER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COMPACT = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "COMPACT", DB2DataType.CHARACTER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Long> COLCARD = new TableFieldImpl<ColumnsRecord, Long>(SQLDialect.DB2, "COLCARD", DB2DataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> HIGH2KEY = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "HIGH2KEY", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> LOW2KEY = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "LOW2KEY", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> AVGCOLLEN = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.DB2, "AVGCOLLEN", DB2DataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Short> KEYSEQ = new TableFieldImpl<ColumnsRecord, Short>(SQLDialect.DB2, "KEYSEQ", DB2DataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Short> PARTKEYSEQ = new TableFieldImpl<ColumnsRecord, Short>(SQLDialect.DB2, "PARTKEYSEQ", DB2DataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Short> NQUANTILES = new TableFieldImpl<ColumnsRecord, Short>(SQLDialect.DB2, "NQUANTILES", DB2DataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Short> NMOSTFREQ = new TableFieldImpl<ColumnsRecord, Short>(SQLDialect.DB2, "NMOSTFREQ", DB2DataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Long> NUMNULLS = new TableFieldImpl<ColumnsRecord, Long>(SQLDialect.DB2, "NUMNULLS", DB2DataType.BIGINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TARGET_TYPESCHEMA = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "TARGET_TYPESCHEMA", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TARGET_TYPENAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "TARGET_TYPENAME", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> SCOPE_TABSCHEMA = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "SCOPE_TABSCHEMA", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> SCOPE_TABNAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "SCOPE_TABNAME", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> SOURCE_TABSCHEMA = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "SOURCE_TABSCHEMA", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> SOURCE_TABNAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "SOURCE_TABNAME", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> DL_FEATURES = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "DL_FEATURES", DB2DataType.CHARACTER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> SPECIAL_PROPS = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "SPECIAL_PROPS", DB2DataType.CHARACTER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> HIDDEN = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "HIDDEN", DB2DataType.CHARACTER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> INLINE_LENGTH = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.DB2, "INLINE_LENGTH", DB2DataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Short> PCTINLINED = new TableFieldImpl<ColumnsRecord, Short>(SQLDialect.DB2, "PCTINLINED", DB2DataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> IDENTITY = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "IDENTITY", DB2DataType.CHARACTER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> ROWCHANGETIMESTAMP = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "ROWCHANGETIMESTAMP", DB2DataType.CHARACTER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> GENERATED = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "GENERATED", DB2DataType.CHARACTER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> TEXT = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "TEXT", DB2DataType.CLOB, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> COMPRESS = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "COMPRESS", DB2DataType.CHARACTER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Double> AVGDISTINCTPERPAGE = new TableFieldImpl<ColumnsRecord, Double>(SQLDialect.DB2, "AVGDISTINCTPERPAGE", DB2DataType.DOUBLE, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Double> PAGEVARIANCERATIO = new TableFieldImpl<ColumnsRecord, Double>(SQLDialect.DB2, "PAGEVARIANCERATIO", DB2DataType.DOUBLE, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Short> SUB_COUNT = new TableFieldImpl<ColumnsRecord, Short>(SQLDialect.DB2, "SUB_COUNT", DB2DataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Short> SUB_DELIM_LENGTH = new TableFieldImpl<ColumnsRecord, Short>(SQLDialect.DB2, "SUB_DELIM_LENGTH", DB2DataType.SMALLINT, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, Integer> AVGCOLLENCHAR = new TableFieldImpl<ColumnsRecord, Integer>(SQLDialect.DB2, "AVGCOLLENCHAR", DB2DataType.INTEGER, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> IMPLICITVALUE = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "IMPLICITVALUE", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> SECLABELNAME = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "SECLABELNAME", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ColumnsRecord, String> REMARKS = new TableFieldImpl<ColumnsRecord, String>(SQLDialect.DB2, "REMARKS", DB2DataType.VARCHAR, COLUMNS);

	/**
	 * No further instances allowed
	 */
	private Columns() {
		super(SQLDialect.DB2, "COLUMNS", Syscat.SYSCAT);
	}
}
