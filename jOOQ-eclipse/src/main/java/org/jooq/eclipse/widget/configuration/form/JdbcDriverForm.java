package org.jooq.eclipse.widget.configuration.form;

import net.miginfocom.swt.MigLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.jooq.eclipse.config.JooqConfiguration;
import org.jooq.eclipse.config.JooqConfigurationable;
import org.jooq.eclipse.widget.util.MigLayoutFormUtils;

public class JdbcDriverForm extends Composite implements JooqConfigurationable {

	private Composite client;
	
	private Text driver;
	private Text url;
	private Text user;
	private Text password;
	private Text inputSchema;

	public JdbcDriverForm(Composite parent) {
		super(parent, SWT.NULL);
		setLayout(new MigLayout("fill"));
		client = MigLayoutFormUtils.createSection(this, "JDBC Connection");
		setupContents();
	}

	private void setupContents() {

		client.setLayout(new MigLayout("fillx", "[pref!][left]", ""));

		driver = MigLayoutFormUtils.createField(client, "JDBC Driver *", "Example: ");
		url = MigLayoutFormUtils.createField(client, "JDBC URL *", "");
		user = MigLayoutFormUtils.createField(client, "User *", "");
		password = MigLayoutFormUtils.createField(client, "Password", "");


		inputSchema = MigLayoutFormUtils.createField(client, "InputSchema", "");
	}

	public void populateFields(JooqConfiguration configuration) {
		driver.setText(configuration.getDriver());
		url.setText(configuration.getUrl());
		user.setText(configuration.getUser());
		password.setText(configuration.getPassword());
		inputSchema.setText(configuration.getInputSchema());
	}

	@Override
	public void merge(JooqConfiguration configuration) {
		configuration.setDriver(driver.getText());
		configuration.setUrl(url.getText());
		configuration.setUser(user.getText());
		configuration.setPassword(password.getText());
		configuration.setInputSchema(inputSchema.getText());
	}


}
