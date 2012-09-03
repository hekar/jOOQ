package org.jooq.eclipse.widget.configuration.form;

import net.miginfocom.swt.MigLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.jooq.eclipse.config.JooqConfiguration;
import org.jooq.eclipse.config.JooqConfigurationable;
import org.jooq.eclipse.widget.configuration.DatabaseCombobox;
import org.jooq.eclipse.widget.util.MigLayoutFormUtils;

public class DatabaseForm extends Composite implements JooqConfigurationable {

	private Composite client;
	private DatabaseCombobox combo;

	public DatabaseForm(Composite parent) {
		super(parent, SWT.NONE);
		setLayout(new MigLayout("fill"));
		setupContents();
	}

	private void setupContents() {
		client = MigLayoutFormUtils.createSection(this, "jOOQ Generation");
		client.setLayout(new MigLayout("fillx", "[pref!][left]", ""));

		MigLayoutFormUtils.createLabel(client, "Database *", "");
		combo = new DatabaseCombobox(client);
		combo.getCombo().setLayoutData("growx, wrap");
	}

	@Override
	public void merge(JooqConfiguration configuration) {
		configuration.setDatabaseUtil(combo.getSelectedDatabaseClassname());
	}

	@Override
	public void populateFields(JooqConfiguration configuration) {
		combo.setSelectedByClassname(configuration.getDatabaseUtil());
	}
}
