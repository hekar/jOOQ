/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables.records;


import java.sql.SQLException;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.db2.generatedclasses.enums.TLanguage;
import org.jooq.test.db2.generatedclasses.tables.TAuthor;
import org.jooq.test.db2.generatedclasses.tables.TBook;
import org.jooq.test.db2.generatedclasses.tables.TBookToBookStore;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBookRecord extends UpdatableRecordImpl<TBookRecord> {

	private static final long serialVersionUID = -1028064611;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(TBook.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(TBook.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public List<TBookToBookStoreRecord> getTBookToBookStoreList() throws SQLException {
		return create()
			.selectFrom(TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(TBookToBookStore.BOOK_ID.equal(getValue(TBook.ID)))
			.fetch()
			.getRecords();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.AUTHOR_ID]
	 * REFERENCES T_AUTHOR [LUKAS.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public void setAuthorId(Integer value) {
		setValue(TBook.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.AUTHOR_ID]
	 * REFERENCES T_AUTHOR [LUKAS.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public Integer getAuthorId() {
		return getValue(TBook.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.AUTHOR_ID]
	 * REFERENCES T_AUTHOR [LUKAS.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public TAuthorRecord getTAuthorByAuthorId() throws SQLException {
		return create()
			.selectFrom(TAuthor.T_AUTHOR)
			.where(TAuthor.ID.equal(getValue(TBook.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.CO_AUTHOR_ID]
	 * REFERENCES T_AUTHOR [LUKAS.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public void setCoAuthorId(Integer value) {
		setValue(TBook.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.CO_AUTHOR_ID]
	 * REFERENCES T_AUTHOR [LUKAS.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public Integer getCoAuthorId() {
		return getValue(TBook.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.CO_AUTHOR_ID]
	 * REFERENCES T_AUTHOR [LUKAS.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public TAuthorRecord getTAuthorByCoAuthorId() throws SQLException {
		return create()
			.selectFrom(TAuthor.T_AUTHOR)
			.where(TAuthor.ID.equal(getValue(TBook.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(Integer value) {
		setValue(TBook.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getDetailsId() {
		return getValue(TBook.DETAILS_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(String value) {
		setValue(TBook.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTitle() {
		return getValue(TBook.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(Integer value) {
		setValue(TBook.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getPublishedIn() {
		return getValue(TBook.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.LANGUAGE_ID]
	 * REFERENCES T_LANGUAGE [LUKAS.T_LANGUAGE.ID]
	 * </pre></code>
	 */
	public void setLanguageId(TLanguage value) {
		setValue(TBook.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK.LANGUAGE_ID]
	 * REFERENCES T_LANGUAGE [LUKAS.T_LANGUAGE.ID]
	 * </pre></code>
	 */
	public TLanguage getLanguageId() {
		return getValue(TBook.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(String value) {
		setValue(TBook.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public String getContentText() {
		return getValue(TBook.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(TBook.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getContentPdf() {
		return getValue(TBook.CONTENT_PDF);
	}

	public TBookRecord(Configuration configuration) {
		super(configuration, TBook.T_BOOK);
	}
}