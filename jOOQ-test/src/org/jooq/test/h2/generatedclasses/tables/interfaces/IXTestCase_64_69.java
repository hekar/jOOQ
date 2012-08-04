/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
public interface IXTestCase_64_69 extends java.io.Serializable {

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_64_69.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_64_69.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId();

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_64_69.UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_64_69A
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES PUBLIC.X_UNUSED (ID)
	 * </pre></code>
	 */
	public void setUnusedId(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.X_TEST_CASE_64_69.UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_64_69A
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES PUBLIC.X_UNUSED (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getUnusedId();
}