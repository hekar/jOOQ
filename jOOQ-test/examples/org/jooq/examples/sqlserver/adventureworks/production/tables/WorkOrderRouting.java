/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class WorkOrderRouting extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting> {

	private static final long serialVersionUID = 1958935510;

	/**
	 * The singleton instance of Production.WorkOrderRouting
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting WorkOrderRouting = new org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting.class;
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.WorkOrderID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_WorkOrderRouting_WorkOrder_WorkOrderID
	 * FOREIGN KEY (WorkOrderID)
	 * REFERENCES Production.WorkOrder (WorkOrderID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.lang.Integer> WorkOrderID = createField("WorkOrderID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Production.WorkOrderRouting.ProductID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.lang.Integer> ProductID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Production.WorkOrderRouting.OperationSequence</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.lang.Short> OperationSequence = createField("OperationSequence", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>Production.WorkOrderRouting.LocationID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_WorkOrderRouting_Location_LocationID
	 * FOREIGN KEY (LocationID)
	 * REFERENCES Production.Location (LocationID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.lang.Short> LocationID = createField("LocationID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>Production.WorkOrderRouting.ScheduledStartDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.sql.Timestamp> ScheduledStartDate = createField("ScheduledStartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>Production.WorkOrderRouting.ScheduledEndDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.sql.Timestamp> ScheduledEndDate = createField("ScheduledEndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>Production.WorkOrderRouting.ActualStartDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.sql.Timestamp> ActualStartDate = createField("ActualStartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>Production.WorkOrderRouting.ActualEndDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.sql.Timestamp> ActualEndDate = createField("ActualEndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>Production.WorkOrderRouting.ActualResourceHrs</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.math.BigDecimal> ActualResourceHrs = createField("ActualResourceHrs", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The table column <code>Production.WorkOrderRouting.PlannedCost</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.math.BigDecimal> PlannedCost = createField("PlannedCost", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The table column <code>Production.WorkOrderRouting.ActualCost</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.math.BigDecimal> ActualCost = createField("ActualCost", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The table column <code>Production.WorkOrderRouting.ModifiedDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public WorkOrderRouting() {
		super("WorkOrderRouting", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	public WorkOrderRouting(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_WorkOrderRouting_WorkOrderID_ProductID_OperationSequence;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_WorkOrderRouting_WorkOrderID_ProductID_OperationSequence);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_WorkOrderRouting_WorkOrder_WorkOrderID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_WorkOrderRouting_Location_LocationID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting(alias);
	}
}
