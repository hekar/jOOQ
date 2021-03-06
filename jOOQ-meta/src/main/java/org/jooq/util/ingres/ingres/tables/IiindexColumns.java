/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class IiindexColumns extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1151911432;

	/**
	 * The singleton instance of $ingres.iiindex_columns
	 */
	public static final org.jooq.util.ingres.ingres.tables.IiindexColumns IIINDEX_COLUMNS = new org.jooq.util.ingres.ingres.tables.IiindexColumns();

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
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> INDEX_NAME = createField("index_name", org.jooq.impl.SQLDataType.CHAR, IIINDEX_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> INDEX_OWNER = createField("index_owner", org.jooq.impl.SQLDataType.CHAR, IIINDEX_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("column_name", org.jooq.impl.SQLDataType.CHAR, IIINDEX_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> KEY_SEQUENCE = createField("key_sequence", org.jooq.impl.SQLDataType.SMALLINT, IIINDEX_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SORT_DIRECTION = createField("sort_direction", org.jooq.impl.SQLDataType.CHAR, IIINDEX_COLUMNS);

	/**
	 * No further instances allowed
	 */
	private IiindexColumns() {
		super("iiindex_columns", org.jooq.util.ingres.ingres.$ingres.$INGRES);
	}
}
