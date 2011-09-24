/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.example.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class T_658_11Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.util.maven.example.tables.records.T_658_11Record> {

	private static final long serialVersionUID = 1593527944;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.String value) {
		setValue(org.jooq.util.maven.example.tables.T_658_11.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.String getId() {
		return getValue(org.jooq.util.maven.example.tables.T_658_11.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.util.maven.example.tables.records.T_658RefRecord> fetchT_658RefList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.util.maven.example.tables.T_658Ref.T_658_REF)
			.where(org.jooq.util.maven.example.tables.T_658Ref.REF_11.equal(getValue(org.jooq.util.maven.example.tables.T_658_11.ID)))
			.fetch();
	}

	/**
	 * Create a detached T_658_11Record
	 */
	public T_658_11Record() {
		super(org.jooq.util.maven.example.tables.T_658_11.T_658_11);
	}
}