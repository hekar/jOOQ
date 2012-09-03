package org.jooq.eclipse.widget.configuration.form;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.jooq.eclipse.config.JooqConfiguration;
import org.jooq.eclipse.config.JooqConfigurationable;

public class MetaForm extends Composite implements JooqConfigurationable {
	/*
	 * TODO: <!-- These properties can be added to the database element: -->
	 * <database> <!-- Generate java.sql.Timestamp fields for DATE columns. This
	 * is particularly useful for Oracle databases. Defaults to false -->
	 * <dateAsTimestamp>false</dateAsTimestamp>
	 * 
	 * <!-- Generate jOOU data types for your unsigned data types, which are not
	 * natively supported in Java. Defaults to true -->
	 * <unsignedTypes>true</unsignedTypes>
	 * 
	 * <!-- The schema that is used in generated source code. This will be the
	 * production schema. Use this to override your local development schema
	 * name for source code generation. If not specified, this will be the same
	 * as the input-schema. --> <outputSchema>[your database schema / owner /
	 * name]</outputSchema>
	 * 
	 * <!-- A configuration element to configure several input and/or output
	 * schemata for jooq-meta, in case you're using jooq-meta in a multi- schema
	 * environment. This cannot be combined with the above inputSchema /
	 * outputSchema --> <schemata> <schema> <inputSchema>...</inputSchema>
	 * <outputSchema>...</outputSchema> </schema> [ <schema>...</schema> ... ]
	 * </schemata>
	 * 
	 * <!-- A configuration element to configure master data table enum classes
	 * --> <masterDataTables>...</masterDataTables>
	 * 
	 * <!-- A configuration element to configure custom data types -->
	 * <customTypes>...</customTypes>
	 * 
	 * <!-- A configuration element to configure type overrides for generated
	 * artefacts (e.g. in combination with customTypes) -->
	 * <forcedTypes>...</forcedTypes> </database>
	 */

	public MetaForm(Composite parent) {
		super(parent, SWT.None);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void merge(JooqConfiguration configuration) {
		// TODO Auto-generated method stub

	}

	@Override
	public void populateFields(JooqConfiguration configuration) {
		// TODO Auto-generated method stub

	}

}
