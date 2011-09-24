/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.example.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class XTestCase_71 extends org.jooq.impl.UpdatableTableImpl<org.jooq.util.maven.example.tables.records.XTestCase_71Record> {

	private static final long serialVersionUID = 637196111;

	/**
	 * The singleton instance of x_test_case_71
	 */
	public static final org.jooq.util.maven.example.tables.XTestCase_71 X_TEST_CASE_71 = new org.jooq.util.maven.example.tables.XTestCase_71();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.maven.example.tables.records.XTestCase_71Record> __RECORD_TYPE = org.jooq.util.maven.example.tables.records.XTestCase_71Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.maven.example.tables.records.XTestCase_71Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.util.maven.example.tables.records.XTestCase_71Record, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.maven.example.tables.records.XTestCase_71Record, java.lang.Integer>("id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_71);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.x_test_case_71.test_case_64_69_id]
	 * REFERENCES x_test_case_64_69 [public.x_test_case_64_69.id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.util.maven.example.tables.records.XTestCase_71Record, java.lang.Short> TEST_CASE_64_69_ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.maven.example.tables.records.XTestCase_71Record, java.lang.Short>("test_case_64_69_id", org.jooq.impl.SQLDataType.SMALLINT, X_TEST_CASE_71);

	/**
	 * No further instances allowed
	 */
	private XTestCase_71() {
		super("x_test_case_71", org.jooq.util.maven.example.Public.PUBLIC);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.util.maven.example.tables.records.XTestCase_71Record> getMainKey() {
		return org.jooq.util.maven.example.Keys.pk_x_test_case_71;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.util.maven.example.tables.records.XTestCase_71Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.util.maven.example.tables.records.XTestCase_71Record>>asList(org.jooq.util.maven.example.Keys.pk_x_test_case_71);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.util.maven.example.tables.records.XTestCase_71Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.util.maven.example.tables.records.XTestCase_71Record, ?>>asList(org.jooq.util.maven.example.Keys.fk_x_test_case_71);
	}
}