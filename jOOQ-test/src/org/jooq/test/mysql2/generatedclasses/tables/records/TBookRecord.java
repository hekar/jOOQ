/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -1813104346;

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.ID, value);
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.ID);
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID.equal(getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.ID)))
			.fetch();
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.AUTHOR_ID]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID, value);
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.AUTHOR_ID]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID);
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.AUTHOR_ID]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.mysql2.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.mysql2.generatedclasses.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.co_author_id]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.co_author_id]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.co_author_id]
	 * REFERENCES t_author [test.t_author.ID]
	 * </pre></code>
	 */
	public org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.mysql2.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.mysql2.generatedclasses.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * Some more details about the book
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.DETAILS_ID, value);
	}

	/**
	 * Some more details about the book
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.DETAILS_ID);
	}

	/**
	 * The book's title
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.TITLE, value);
	}

	/**
	 * The book's title
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.TITLE);
	}

	/**
	 * The year the book was published in
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * The year the book was published in
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.PUBLISHED_IN);
	}

	/**
	 * The language of the book
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.LANGUAGE_ID]
	 * REFERENCES t_language [test.t_language.ID]
	 * </pre></code>
	 */
	public void setLanguageId(org.jooq.test.mysql2.generatedclasses.enums.TLanguage value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * The language of the book
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.t_book.LANGUAGE_ID]
	 * REFERENCES t_language [test.t_language.ID]
	 * </pre></code>
	 */
	public org.jooq.test.mysql2.generatedclasses.enums.TLanguage getLanguageId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID);
	}

	/**
	 * Some textual content of the book
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * Some textual content of the book
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.CONTENT_TEXT);
	}

	/**
	 * Some binary content of the book
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.CONTENT_PDF, value);
	}

	/**
	 * Some binary content of the book
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.CONTENT_PDF);
	}

	/**
	 * The book's stock status
	 */
	public void setStatus(org.jooq.test.mysql2.generatedclasses.enums.TBookStatus value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.STATUS, value);
	}

	/**
	 * The book's stock status
	 */
	public org.jooq.test.mysql2.generatedclasses.enums.TBookStatus getStatus() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.STATUS);
	}

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK);
	}
}