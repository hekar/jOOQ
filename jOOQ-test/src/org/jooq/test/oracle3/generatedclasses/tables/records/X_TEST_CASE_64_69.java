/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_64_69", schema = "TEST")
public class X_TEST_CASE_64_69 extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69> implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_64_69_INTERFACE {

	private static final long serialVersionUID = 454031387;

	/**
	 * The table column <code>TEST.X_TEST_CASE_64_69.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.ID, value);
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_64_69.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.ID);
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_64_69.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> fetchX_TEST_CASE_71List() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71)
			.where(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.TEST_CASE_64_69_ID.equal(getValueAsShort(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.ID)))
			.fetch();
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_64_69.UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_64_69A
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES TEST.X_UNUSED (ID)
	 * </pre></code>
	 */
	@Override
	public void setUNUSED_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID, value);
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_64_69.UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_64_69A
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES TEST.X_UNUSED (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "UNUSED_ID", precision = 7)
	@Override
	public java.lang.Integer getUNUSED_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED 
	 * X_UNUSED}
	 */
	public void setUNUSED_ID(org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED value) {
		if (value == null) {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID, value.getValue(org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED.ID));
		}
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_64_69.UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_64_69A
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES TEST.X_UNUSED (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED fetchX_UNUSED() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED)
			.where(org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED.ID.equal(getValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached X_TEST_CASE_64_69
	 */
	public X_TEST_CASE_64_69() {
		super(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69);
	}
}
