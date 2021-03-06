/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_64_69", schema = "TEST")
public interface X_TEST_CASE_64_69_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * The table column <code>TEST.X_TEST_CASE_64_69.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setID(java.lang.Integer value);

	/**
	 * The table column <code>TEST.X_TEST_CASE_64_69.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * The table column <code>TEST.X_TEST_CASE_64_69.UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_64_69A
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES TEST.X_UNUSED (ID)
	 * </pre></code>
	 */
	public void setUNUSED_ID(java.lang.Integer value);

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
	public java.lang.Integer getUNUSED_ID();
}
