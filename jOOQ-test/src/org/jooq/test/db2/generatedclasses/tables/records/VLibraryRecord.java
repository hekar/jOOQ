/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class VLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.db2.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 512770714;

	/**
	 * The table column <code>LUKAS.V_LIBRARY.AUTHOR</code>
	 */
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.VLibrary.AUTHOR, value);
	}

	/**
	 * The table column <code>LUKAS.V_LIBRARY.AUTHOR</code>
	 */
	public java.lang.String getAuthor() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.VLibrary.AUTHOR);
	}

	/**
	 * The table column <code>LUKAS.V_LIBRARY.TITLE</code>
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.VLibrary.TITLE, value);
	}

	/**
	 * The table column <code>LUKAS.V_LIBRARY.TITLE</code>
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.VLibrary.TITLE);
	}

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.test.db2.generatedclasses.tables.VLibrary.V_LIBRARY);
	}
}
