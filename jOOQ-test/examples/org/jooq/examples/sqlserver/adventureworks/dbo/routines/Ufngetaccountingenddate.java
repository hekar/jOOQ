/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
public class Ufngetaccountingenddate extends org.jooq.impl.AbstractRoutine<java.sql.Timestamp> {

	private static final long serialVersionUID = 1822719901;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public Ufngetaccountingenddate() {
		super(org.jooq.SQLDialect.SQLSERVER, "ufnGetAccountingEndDate", org.jooq.examples.sqlserver.adventureworks.dbo.Dbo.DBO, org.jooq.impl.SQLDataType.TIMESTAMP);

		setReturnParameter(RETURN_VALUE);
	}
}