/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.example.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.util.maven.example.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 313657669;

	/**
	 * The singleton instance of v_library
	 */
	public static final org.jooq.util.maven.example.tables.VLibrary V_LIBRARY = new org.jooq.util.maven.example.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.maven.example.tables.records.VLibraryRecord> __RECORD_TYPE = org.jooq.util.maven.example.tables.records.VLibraryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.maven.example.tables.records.VLibraryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.maven.example.tables.records.VLibraryRecord, java.lang.String> AUTHOR = new org.jooq.impl.TableFieldImpl<org.jooq.util.maven.example.tables.records.VLibraryRecord, java.lang.String>("author", org.jooq.impl.SQLDataType.CLOB, V_LIBRARY);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.maven.example.tables.records.VLibraryRecord, java.lang.String> TITLE = new org.jooq.impl.TableFieldImpl<org.jooq.util.maven.example.tables.records.VLibraryRecord, java.lang.String>("title", org.jooq.impl.SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("v_library", org.jooq.util.maven.example.Public.PUBLIC);
	}
}