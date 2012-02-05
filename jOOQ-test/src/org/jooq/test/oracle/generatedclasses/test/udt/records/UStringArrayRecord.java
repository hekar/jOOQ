/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.records;

/**
 * This class is generated by jOOQ.
 */
public class UStringArrayRecord extends org.jooq.impl.ArrayRecordImpl<java.lang.String> {

	private static final long serialVersionUID = -1823125927;

	public UStringArrayRecord(org.jooq.Configuration configuration) {
		super("TEST.U_STRING_ARRAY", org.jooq.impl.SQLDataType.VARCHAR, configuration);
	}

	public UStringArrayRecord(org.jooq.Configuration configuration, java.lang.String... array) {
		this(configuration);
		set(array);
	}

	public UStringArrayRecord(org.jooq.Configuration configuration, java.util.List<? extends java.lang.String> list) {
		this(configuration);
		setList(list);
	}
}