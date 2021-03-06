/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductModelProductDescriptionCulture", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ProductModelID", "ProductDescriptionID", "CultureID"})
})
public class ProductModelProductDescriptionCulture extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelProductDescriptionCulture> {

	private static final long serialVersionUID = 1083735221;

	/**
	 * The table column <code>Production.ProductModelProductDescriptionCulture.ProductModelID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_ProductModel_ProductModelID
	 * FOREIGN KEY (ProductModelID)
	 * REFERENCES Production.ProductModel (ProductModelID)
	 * </pre></code>
	 */
	public void setProductModelID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture.ProductModelProductDescriptionCulture.ProductModelID, value);
	}

	/**
	 * The table column <code>Production.ProductModelProductDescriptionCulture.ProductModelID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_ProductModel_ProductModelID
	 * FOREIGN KEY (ProductModelID)
	 * REFERENCES Production.ProductModel (ProductModelID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductModelID", nullable = false, precision = 10)
	public java.lang.Integer getProductModelID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture.ProductModelProductDescriptionCulture.ProductModelID);
	}

	/**
	 * The table column <code>Production.ProductModelProductDescriptionCulture.ProductDescriptionID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_ProductDescription_ProductDescriptionID
	 * FOREIGN KEY (ProductDescriptionID)
	 * REFERENCES Production.ProductDescription (ProductDescriptionID)
	 * </pre></code>
	 */
	public void setProductDescriptionID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture.ProductModelProductDescriptionCulture.ProductDescriptionID, value);
	}

	/**
	 * The table column <code>Production.ProductModelProductDescriptionCulture.ProductDescriptionID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_ProductDescription_ProductDescriptionID
	 * FOREIGN KEY (ProductDescriptionID)
	 * REFERENCES Production.ProductDescription (ProductDescriptionID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductDescriptionID", nullable = false, precision = 10)
	public java.lang.Integer getProductDescriptionID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture.ProductModelProductDescriptionCulture.ProductDescriptionID);
	}

	/**
	 * The table column <code>Production.ProductModelProductDescriptionCulture.CultureID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_Culture_CultureID
	 * FOREIGN KEY (CultureID)
	 * REFERENCES Production.Culture (CultureID)
	 * </pre></code>
	 */
	public void setCultureID(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture.ProductModelProductDescriptionCulture.CultureID, value);
	}

	/**
	 * The table column <code>Production.ProductModelProductDescriptionCulture.CultureID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_ProductModelProductDescriptionCulture_Culture_CultureID
	 * FOREIGN KEY (CultureID)
	 * REFERENCES Production.Culture (CultureID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "CultureID", nullable = false, length = 6)
	public java.lang.String getCultureID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture.ProductModelProductDescriptionCulture.CultureID);
	}

	/**
	 * The table column <code>Production.ProductModelProductDescriptionCulture.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture.ProductModelProductDescriptionCulture.ModifiedDate, value);
	}

	/**
	 * The table column <code>Production.ProductModelProductDescriptionCulture.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture.ProductModelProductDescriptionCulture.ModifiedDate);
	}

	/**
	 * Create a detached ProductModelProductDescriptionCulture
	 */
	public ProductModelProductDescriptionCulture() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture.ProductModelProductDescriptionCulture);
	}
}
