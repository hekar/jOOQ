/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class Sysidxcol extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 2135002612;

	/**
	 * The singleton instance of SYS.SYSIDXCOL
	 */
	public static final org.jooq.util.sybase.sys.tables.Sysidxcol SYSIDXCOL = new org.jooq.util.sybase.sys.tables.Sysidxcol();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_ID = createField("table_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> INDEX_ID = createField("index_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> SEQUENCE = createField("sequence", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> COLUMN_ID = createField("column_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ORDER = createField("order", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> PRIMARY_COLUMN_ID = createField("primary_column_id", org.jooq.impl.SQLDataType.INTEGER, this);

	public Sysidxcol() {
		super("SYSIDXCOL", org.jooq.util.sybase.sys.Sys.SYS);
	}

	public Sysidxcol(java.lang.String alias) {
		super(alias, org.jooq.util.sybase.sys.Sys.SYS, org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL);
	}

	@Override
	public org.jooq.util.sybase.sys.tables.Sysidxcol as(java.lang.String alias) {
		return new org.jooq.util.sybase.sys.tables.Sysidxcol(alias);
	}
}
