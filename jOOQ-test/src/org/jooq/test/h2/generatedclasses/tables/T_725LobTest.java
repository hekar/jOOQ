/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_725LobTest extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.h2.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = -1592471675;

	/**
	 * The singleton instance of PUBLIC.T_725_LOB_TEST
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.h2.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * The table column <code>PUBLIC.T_725_LOB_TEST.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_725_LOB_TEST);

	/**
	 * The table column <code>PUBLIC.T_725_LOB_TEST.LOB</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.BLOB, T_725_LOB_TEST);

	/**
	 * No further instances allowed
	 */
	private T_725LobTest() {
		super("T_725_LOB_TEST", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.T_725LobTestRecord> getMainKey() {
		return org.jooq.test.h2.generatedclasses.Keys.PK_T_725_LOB_TEST;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.h2.generatedclasses.Keys.PK_T_725_LOB_TEST);
	}
}
