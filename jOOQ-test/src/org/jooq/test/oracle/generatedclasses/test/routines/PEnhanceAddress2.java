/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
public class PEnhanceAddress2 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -441980941;


	/**
	 * The procedure parameter <code>TEST.P_ENHANCE_ADDRESS2.ADDRESS</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> ADDRESS = createParameter("ADDRESS", org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.U_ADDRESS_TYPE.getDataType());

	/**
	 * Create a new routine call instance
	 */
	public PEnhanceAddress2() {
		super("P_ENHANCE_ADDRESS2", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		addOutParameter(ADDRESS);
	}

	/**
	 * Get the <code>ADDRESS</code> parameter OUT value from the routine
	 */
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord getAddress() {
		return getValue(ADDRESS);
	}
}
