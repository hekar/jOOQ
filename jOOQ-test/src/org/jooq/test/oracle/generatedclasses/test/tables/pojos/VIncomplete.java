/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "V_INCOMPLETE", schema = "TEST")
public class VIncomplete implements java.io.Serializable {

	private static final long serialVersionUID = 1342907548;

	private java.lang.Object id;
	private java.lang.Object authorId;
	private java.lang.Object coAuthorId;
	private java.lang.Object detailsId;
	private java.lang.Object title;
	private java.lang.Object publishedIn;
	private java.lang.Object languageId;
	private java.lang.Object contentText;
	private java.lang.Object contentPdf;

	@javax.persistence.Column(name = "ID")
	public java.lang.Object getId() {
		return this.id;
	}

	public void setId(java.lang.Object id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "AUTHOR_ID")
	public java.lang.Object getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(java.lang.Object authorId) {
		this.authorId = authorId;
	}

	@javax.persistence.Column(name = "CO_AUTHOR_ID")
	public java.lang.Object getCoAuthorId() {
		return this.coAuthorId;
	}

	public void setCoAuthorId(java.lang.Object coAuthorId) {
		this.coAuthorId = coAuthorId;
	}

	@javax.persistence.Column(name = "DETAILS_ID")
	public java.lang.Object getDetailsId() {
		return this.detailsId;
	}

	public void setDetailsId(java.lang.Object detailsId) {
		this.detailsId = detailsId;
	}

	@javax.persistence.Column(name = "TITLE")
	public java.lang.Object getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.Object title) {
		this.title = title;
	}

	@javax.persistence.Column(name = "PUBLISHED_IN")
	public java.lang.Object getPublishedIn() {
		return this.publishedIn;
	}

	public void setPublishedIn(java.lang.Object publishedIn) {
		this.publishedIn = publishedIn;
	}

	@javax.persistence.Column(name = "LANGUAGE_ID")
	public java.lang.Object getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(java.lang.Object languageId) {
		this.languageId = languageId;
	}

	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.Object getContentText() {
		return this.contentText;
	}

	public void setContentText(java.lang.Object contentText) {
		this.contentText = contentText;
	}

	@javax.persistence.Column(name = "CONTENT_PDF")
	public java.lang.Object getContentPdf() {
		return this.contentPdf;
	}

	public void setContentPdf(java.lang.Object contentPdf) {
		this.contentPdf = contentPdf;
	}
}
