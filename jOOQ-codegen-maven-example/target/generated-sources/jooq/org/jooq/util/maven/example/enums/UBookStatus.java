/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.example.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public enum UBookStatus implements org.jooq.EnumType {
	ORDERED("ORDERED"),

	ON_STOCK("ON STOCK"),

	SOLD_OUT("SOLD OUT"),

	;

	private final java.lang.String literal;

	private UBookStatus(java.lang.String literal) {
		this.literal = literal;
	}

	@Override
	public java.lang.String getName() {
		return "u_book_status";
	}

	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}