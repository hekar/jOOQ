/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.example.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class T_658_31 extends org.jooq.impl.UpdatableTableImpl<org.jooq.util.maven.example.tables.records.T_658_31Record> {

	private static final long serialVersionUID = -141769915;

	/**
	 * The singleton instance of t_658_31
	 */
	public static final org.jooq.util.maven.example.tables.T_658_31 T_658_31 = new org.jooq.util.maven.example.tables.T_658_31();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.maven.example.tables.records.T_658_31Record> __RECORD_TYPE = org.jooq.util.maven.example.tables.records.T_658_31Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.maven.example.tables.records.T_658_31Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.util.maven.example.tables.records.T_658_31Record, java.lang.Long> ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.maven.example.tables.records.T_658_31Record, java.lang.Long>("id", org.jooq.impl.SQLDataType.BIGINT, T_658_31);

	/**
	 * No further instances allowed
	 */
	private T_658_31() {
		super("t_658_31", org.jooq.util.maven.example.Public.PUBLIC);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.util.maven.example.tables.records.T_658_31Record> getMainKey() {
		return org.jooq.util.maven.example.Keys.pk_t_658_31;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.util.maven.example.tables.records.T_658_31Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.util.maven.example.tables.records.T_658_31Record>>asList(org.jooq.util.maven.example.Keys.pk_t_658_31);
	}
}