/**
 * This class is generated by jOOQ
 */
package org.jooq.util.cubrid.dba.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class DbIndex extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -468760794;

	/**
	 * The singleton instance of DBA.db_index
	 */
	public static final org.jooq.util.cubrid.dba.tables.DbIndex DB_INDEX = new org.jooq.util.cubrid.dba.tables.DbIndex();

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
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INDEX_NAME = createField("index_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_UNIQUE = createField("is_unique", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_REVERSE = createField("is_reverse", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CLASS_NAME = createField("class_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> KEY_COUNT = createField("key_count", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_PRIMARY_KEY = createField("is_primary_key", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_FOREIGN_KEY = createField("is_foreign_key", org.jooq.impl.SQLDataType.VARCHAR, this);

	public DbIndex() {
		super("db_index", org.jooq.util.cubrid.dba.Dba.DBA);
	}

	public DbIndex(java.lang.String alias) {
		super(alias, org.jooq.util.cubrid.dba.Dba.DBA, org.jooq.util.cubrid.dba.tables.DbIndex.DB_INDEX);
	}

	@Override
	public org.jooq.util.cubrid.dba.tables.DbIndex as(java.lang.String alias) {
		return new org.jooq.util.cubrid.dba.tables.DbIndex(alias);
	}
}
