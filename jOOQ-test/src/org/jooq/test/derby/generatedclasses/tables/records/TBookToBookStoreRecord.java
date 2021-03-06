/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TBookToBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = -160148057;

	/**
	 * The table column <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_BS_NAME
	 * FOREIGN KEY (BOOK_STORE_NAME)
	 * REFERENCES TEST.T_BOOK_STORE (NAME)
	 * </pre></code>
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_BS_NAME
	 * FOREIGN KEY (BOOK_STORE_NAME)
	 * REFERENCES TEST.T_BOOK_STORE (NAME)
	 * </pre></code>
	 */
	public java.lang.String getBookStoreName() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord 
	 * TBookStoreRecord}
	 */
	public void setBookStoreName(org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord value) {
		if (value == null) {
			setValue(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, null);
		}
		else {
			setValue(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, value.getValue(org.jooq.test.derby.generatedclasses.tables.TBookStore.NAME));
		}
	}

	/**
	 * The table column <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_BS_NAME
	 * FOREIGN KEY (BOOK_STORE_NAME)
	 * REFERENCES TEST.T_BOOK_STORE (NAME)
	 * </pre></code>
	 */
	public org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord fetchTBookStore() {
		return create()
			.selectFrom(org.jooq.test.derby.generatedclasses.tables.TBookStore.T_BOOK_STORE)
			.where(org.jooq.test.derby.generatedclasses.tables.TBookStore.NAME.equal(getValue(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME)))
			.fetchOne();
	}

	/**
	 * The table column <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_B_ID
	 * FOREIGN KEY (BOOK_ID)
	 * REFERENCES TEST.T_BOOK (ID)
	 * </pre></code>
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_ID, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_B_ID
	 * FOREIGN KEY (BOOK_ID)
	 * REFERENCES TEST.T_BOOK (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getBookId() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.derby.generatedclasses.tables.records.TBookRecord 
	 * TBookRecord}
	 */
	public void setBookId(org.jooq.test.derby.generatedclasses.tables.records.TBookRecord value) {
		if (value == null) {
			setValue(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_ID, null);
		}
		else {
			setValue(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_ID, value.getValue(org.jooq.test.derby.generatedclasses.tables.TBook.ID));
		}
	}

	/**
	 * The table column <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_B_ID
	 * FOREIGN KEY (BOOK_ID)
	 * REFERENCES TEST.T_BOOK (ID)
	 * </pre></code>
	 */
	public org.jooq.test.derby.generatedclasses.tables.records.TBookRecord fetchTBook() {
		return create()
			.selectFrom(org.jooq.test.derby.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.derby.generatedclasses.tables.TBook.ID.equal(getValue(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>TEST.T_BOOK_TO_BOOK_STORE.STOCK</code>
	 */
	public void setStock(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.STOCK, value);
	}

	/**
	 * The table column <code>TEST.T_BOOK_TO_BOOK_STORE.STOCK</code>
	 */
	public java.lang.Integer getStock() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.STOCK);
	}

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}
}
