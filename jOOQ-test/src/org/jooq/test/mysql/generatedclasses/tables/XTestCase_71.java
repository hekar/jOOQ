/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
public class XTestCase_71 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_71Record> {

	private static final long serialVersionUID = 1126898170;

	/**
	 * The singleton instance of test.x_test_case_71
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.XTestCase_71 X_TEST_CASE_71 = new org.jooq.test.mysql.generatedclasses.tables.XTestCase_71();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_71Record> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_71Record.class;
	}

	/**
	 * The table column <code>test.x_test_case_71.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_71Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_71);

	/**
	 * The table column <code>test.x_test_case_71.TEST_CASE_64_69_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_test_case_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES test.x_test_case_64_69 (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_71Record, java.lang.Integer> TEST_CASE_64_69_ID = createField("TEST_CASE_64_69_ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_71);

	/**
	 * No further instances allowed
	 */
	private XTestCase_71() {
		super("x_test_case_71", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_71Record> getMainKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_X_TEST_CASE_71_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_71Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_71Record>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_X_TEST_CASE_71_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_71Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_71Record, ?>>asList(org.jooq.test.mysql.generatedclasses.Keys.FK_X_TEST_CASE_71);
	}
}
