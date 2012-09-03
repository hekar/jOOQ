package org.jooq.eclipse.indigo.editor.configuration;

import java.io.File;
import java.util.ArrayList;

import net.miginfocom.swt.MigLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.jooq.eclipse.config.JooqConfiguration;
import org.jooq.eclipse.config.JooqConfigurationable;
import org.jooq.eclipse.indigo.wizard.configuration.DatabaseForm;
import org.jooq.eclipse.widget.configuration.form.CodegenForm;
import org.jooq.eclipse.widget.configuration.form.IncludeExcludeForm;
import org.jooq.eclipse.widget.configuration.form.JdbcDriverForm;
import org.jooq.eclipse.widget.configuration.form.TargetForm;

public class ConfigurationPropertiesPage extends ScrolledComposite {

	private JdbcDriverForm jdbcDriverForm;
	private IncludeExcludeForm includeExcludeForm;
	private DatabaseForm databaseForm;
	private TargetForm targetForm;
	private CodegenForm codegenForm;

	public ConfigurationPropertiesPage(Composite parent) {
		super(parent, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);

		Composite content = new Composite(this, SWT.None);
		content.setLayout(new MigLayout("fill", "[70%!]"));

		jdbcDriverForm = new JdbcDriverForm(content);
		jdbcDriverForm.setLayoutData("growx, wrap");

		databaseForm = new DatabaseForm(content);
		databaseForm.setLayoutData("growx, wrap");

		targetForm = new TargetForm(content);
		targetForm.setLayoutData("growx, wrap");

		includeExcludeForm = new IncludeExcludeForm(content);
		includeExcludeForm.setLayoutData("growx, wrap");

		codegenForm = new CodegenForm(content);
		codegenForm.setLayoutData("growx, wrap");

		setLayout(new FillLayout());
		setMinSize(content.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		setContent(content);
		setExpandVertical(true);
		setExpandHorizontal(true);
		setAlwaysShowScrollBars(true);
	}

	public void reloadConfig(File file) {
		ArrayList<JooqConfigurationable> forms = new ArrayList<JooqConfigurationable>();
		forms.add(jdbcDriverForm);
		forms.add(databaseForm);
		forms.add(targetForm);
		forms.add(includeExcludeForm);
		forms.add(codegenForm);

		JooqConfiguration configuration = JooqConfiguration.fromFile(file);
		for (JooqConfigurationable form : forms) {
			form.populateFields(configuration);
		}
	}

}
