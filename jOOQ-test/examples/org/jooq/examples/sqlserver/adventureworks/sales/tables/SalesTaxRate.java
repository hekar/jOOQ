/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class SalesTaxRate extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate> {

	private static final long serialVersionUID = 2038208331;

	/**
	 * The singleton instance of Sales.SalesTaxRate
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTaxRate SalesTaxRate = new org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTaxRate();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate.class;
	}

	/**
	 * The table column <code>Sales.SalesTaxRate.SalesTaxRateID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate, java.lang.Integer> SalesTaxRateID = createField("SalesTaxRateID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Sales.SalesTaxRate.StateProvinceID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesTaxRate_StateProvince_StateProvinceID
	 * FOREIGN KEY (StateProvinceID)
	 * REFERENCES Person.StateProvince (StateProvinceID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate, java.lang.Integer> StateProvinceID = createField("StateProvinceID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Sales.SalesTaxRate.TaxType</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate, java.lang.Byte> TaxType = createField("TaxType", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The table column <code>Sales.SalesTaxRate.TaxRate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate, java.math.BigDecimal> TaxRate = createField("TaxRate", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The table column <code>Sales.SalesTaxRate.Name</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Sales.SalesTaxRate.rowguid</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>Sales.SalesTaxRate.ModifiedDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public SalesTaxRate() {
		super("SalesTaxRate", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	public SalesTaxRate(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTaxRate.SalesTaxRate);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.IDENTITY_SalesTaxRate;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SalesTaxRate_SalesTaxRateID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SalesTaxRate_SalesTaxRateID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_SalesTaxRate_StateProvince_StateProvinceID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTaxRate as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTaxRate(alias);
	}
}
