/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.example.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class T_658_21Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.util.maven.example.tables.records.T_658_21Record> {

	private static final long serialVersionUID = -1589365776;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.util.maven.example.tables.T_658_21.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.util.maven.example.tables.T_658_21.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.util.maven.example.tables.records.T_658RefRecord> fetchT_658RefList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.util.maven.example.tables.T_658Ref.T_658_REF)
			.where(org.jooq.util.maven.example.tables.T_658Ref.REF_21.equal(getValue(org.jooq.util.maven.example.tables.T_658_21.ID)))
			.fetch();
	}

	/**
	 * Create a detached T_658_21Record
	 */
	public T_658_21Record() {
		super(org.jooq.util.maven.example.tables.T_658_21.T_658_21);
	}
}