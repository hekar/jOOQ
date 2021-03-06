/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * Information about accessible columns in constraint definitions
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class AllConsColumns extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -235970741;

	/**
	 * The singleton instance of SYS.ALL_CONS_COLUMNS
	 */
	public static final org.jooq.util.oracle.sys.tables.AllConsColumns ALL_CONS_COLUMNS = new org.jooq.util.oracle.sys.tables.AllConsColumns();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * Owner of the constraint definition
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name associated with the constraint definition
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name associated with table with constraint definition
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name associated with column or attribute of object column specified in the constraint definition
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Original position of column or attribute in definition
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> POSITION = createField("POSITION", org.jooq.impl.SQLDataType.NUMERIC, this);

	public AllConsColumns() {
		super("ALL_CONS_COLUMNS", org.jooq.util.oracle.sys.Sys.SYS);
	}

	public AllConsColumns(java.lang.String alias) {
		super(alias, org.jooq.util.oracle.sys.Sys.SYS, org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS);
	}

	@Override
	public org.jooq.util.oracle.sys.tables.AllConsColumns as(java.lang.String alias) {
		return new org.jooq.util.oracle.sys.tables.AllConsColumns(alias);
	}
}
