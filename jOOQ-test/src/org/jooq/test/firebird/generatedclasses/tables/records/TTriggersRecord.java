/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TTriggersRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.firebird.generatedclasses.tables.records.TTriggersRecord> implements org.jooq.test.firebird.generatedclasses.tables.interfaces.ITTriggers {

	private static final long serialVersionUID = -876332023;

	/**
	 * The table column <code>T_TRIGGERS.ID_GENERATED</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setIdGenerated(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED, value);
	}

	/**
	 * The table column <code>T_TRIGGERS.ID_GENERATED</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getIdGenerated() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED);
	}

	/**
	 * The table column <code>T_TRIGGERS.ID</code>
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TTriggers.T_TRIGGERS.ID, value);
	}

	/**
	 * The table column <code>T_TRIGGERS.ID</code>
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TTriggers.T_TRIGGERS.ID);
	}

	/**
	 * The table column <code>T_TRIGGERS.COUNTER</code>
	 */
	@Override
	public void setCounter(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TTriggers.T_TRIGGERS.COUNTER, value);
	}

	/**
	 * The table column <code>T_TRIGGERS.COUNTER</code>
	 */
	@Override
	public java.lang.Integer getCounter() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TTriggers.T_TRIGGERS.COUNTER);
	}

	/**
	 * Create a detached TTriggersRecord
	 */
	public TTriggersRecord() {
		super(org.jooq.test.firebird.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}
}
