/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class TTriggersDao extends org.jooq.impl.DAOImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TTriggersRecord, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TTriggers, java.lang.Integer> {

	/**
	 * Create a new TTriggersDao without any factory
	 */
	public TTriggersDao() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TTriggers.class);
	}

	/**
	 * Create a new TTriggersDao with an attached factory
	 */
	public TTriggersDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TTriggers.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.oracle.generatedclasses.test.tables.pojos.TTriggers object) {
		return object.getIdGenerated();
	}

	/**
	 * Fetch records that have <code>ID_GENERATED IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TTriggers> fetchByIdGenerated(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS.ID_GENERATED, values);
	}

	/**
	 * Fetch a unique that has <code>ID_GENERATED = value</code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.pojos.TTriggers fetchOneByIdGenerated(java.lang.Integer value) {
		return fetchOne(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS.ID_GENERATED, value);
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TTriggers> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS.ID, values);
	}

	/**
	 * Fetch records that have <code>COUNTER IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.TTriggers> fetchByCounter(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS.COUNTER, values);
	}
}
