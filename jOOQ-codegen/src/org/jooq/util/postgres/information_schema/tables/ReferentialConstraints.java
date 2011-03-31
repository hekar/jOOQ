/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.PostgresDataType;
import org.jooq.util.postgres.information_schema.InformationSchema;
import org.jooq.util.postgres.information_schema.tables.records.ReferentialConstraintsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class ReferentialConstraints extends TableImpl<ReferentialConstraintsRecord> {

	private static final long serialVersionUID = -1638291449;

	/**
	 * The singleton instance of referential_constraints
	 */
	public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = new ReferentialConstraints();

	/**
	 * The class holding records for this type
	 */
	private static final Class<ReferentialConstraintsRecord> __RECORD_TYPE = ReferentialConstraintsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ReferentialConstraintsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> CONSTRAINT_CATALOG = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.POSTGRES, "constraint_catalog", PostgresDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> CONSTRAINT_SCHEMA = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.POSTGRES, "constraint_schema", PostgresDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> CONSTRAINT_NAME = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.POSTGRES, "constraint_name", PostgresDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> UNIQUE_CONSTRAINT_CATALOG = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.POSTGRES, "unique_constraint_catalog", PostgresDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> UNIQUE_CONSTRAINT_SCHEMA = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.POSTGRES, "unique_constraint_schema", PostgresDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> UNIQUE_CONSTRAINT_NAME = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.POSTGRES, "unique_constraint_name", PostgresDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> MATCH_OPTION = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.POSTGRES, "match_option", PostgresDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> UPDATE_RULE = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.POSTGRES, "update_rule", PostgresDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferentialConstraintsRecord, String> DELETE_RULE = new TableFieldImpl<ReferentialConstraintsRecord, String>(SQLDialect.POSTGRES, "delete_rule", PostgresDataType.CHARACTERVARYING, REFERENTIAL_CONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private ReferentialConstraints() {
		super(SQLDialect.POSTGRES, "referential_constraints", InformationSchema.INFORMATION_SCHEMA);
	}
}