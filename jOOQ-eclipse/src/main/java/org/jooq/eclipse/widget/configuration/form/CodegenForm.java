package org.jooq.eclipse.widget.configuration.form;

import net.miginfocom.swt.MigLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.jooq.eclipse.config.JooqConfiguration;
import org.jooq.eclipse.config.JooqConfigurationable;
import org.jooq.eclipse.widget.util.MigLayoutFormUtils;

public class CodegenForm extends Composite implements JooqConfigurationable {

	private Composite client;
	private Button relations;
	private Button navigationMethods;
	private Button deprecated;
	private Button instanceFields;
	private Button generateAnnotation;
	private Button records;
	private Button pojos;
	private Button interfaces;
	private Button daos;
	private Button jpaAnnotations;
	private Button validationAnnotations;

	public CodegenForm(Composite parent) {
		super(parent, SWT.None);
		setLayout(new MigLayout("fill"));
		setupContent();
	}

	private void setupContent() {
		client = MigLayoutFormUtils.createSection(this, "Codegen - Advanced");
		client.setLayout(new MigLayout("fillx", "", ""));

		relations = MigLayoutFormUtils.createBooleanField(client, "Relations", "");
		navigationMethods = MigLayoutFormUtils.createBooleanField(client, "Navigation Methods", "");
		deprecated = MigLayoutFormUtils.createBooleanField(client, "Deprecated", "");
		instanceFields = MigLayoutFormUtils.createBooleanField(client, "Instance Fields", "");
		generateAnnotation = MigLayoutFormUtils.createBooleanField(client, "Generated Annotation", "");
		records = MigLayoutFormUtils.createBooleanField(client, "Generate Record(s)", "");
		pojos = MigLayoutFormUtils.createBooleanField(client, "Generate Pojo(s)", "");
		interfaces = MigLayoutFormUtils.createBooleanField(client, "Generate Interface(s)", "");
		daos = MigLayoutFormUtils.createBooleanField(client, "Generate DAO(s)", "");
		jpaAnnotations = MigLayoutFormUtils.createBooleanField(client, "JPA Annotations", "");
		validationAnnotations = MigLayoutFormUtils.createBooleanField(client, "Validation Annotations", "");
	}

	@Override
	public void merge(JooqConfiguration configuration) {
		configuration.setRelations(relations.getSelection());
		configuration.setNavigationMethods(navigationMethods.getSelection());
		configuration.setDeprecated(deprecated.getSelection());
		configuration.setInstanceFields(instanceFields.getSelection());
		configuration.setGeneratedAnnotation(generateAnnotation.getSelection());
		configuration.setRecords(records.getSelection());
		configuration.setPojos(pojos.getSelection());
		configuration.setInterfaces(interfaces.getSelection());
		configuration.setDaos(daos.getSelection());
		configuration.setJpaAnnotations(jpaAnnotations.getSelection());
		configuration.setValidationAnnotation(validationAnnotations.getSelection());
	}

	@Override
	public void populateFields(JooqConfiguration configuration) {
		relations.setSelection(configuration.getRelations());
		navigationMethods.setSelection(configuration.getNavigationMethods());
		deprecated.setSelection(configuration.getDeprecated());
		instanceFields.setSelection(configuration.getInstanceFields());
		generateAnnotation.setSelection(configuration.getGeneratedAnnotation());
		records.setSelection(configuration.getRecords());
		pojos.setSelection(configuration.getPojos());
		interfaces.setSelection(configuration.getInterfaces());
		daos.setSelection(configuration.getDaos());
		jpaAnnotations.setSelection(configuration.getJpaAnnotations());
		validationAnnotations.setSelection(configuration.getValidationAnnotation());
	}

}
