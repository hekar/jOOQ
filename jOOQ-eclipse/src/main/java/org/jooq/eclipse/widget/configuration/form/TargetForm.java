package org.jooq.eclipse.widget.configuration.form;

import net.miginfocom.swt.MigLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.jooq.eclipse.config.JooqConfiguration;
import org.jooq.eclipse.config.JooqConfigurationable;
import org.jooq.eclipse.widget.util.MigLayoutFormUtils;

public class TargetForm extends Composite implements JooqConfigurationable {
	private Composite client;
	private Text packageName;
	private Text sourceDirectory;

	public TargetForm(Composite parent) {
		super(parent, SWT.None);
		setLayout(new MigLayout("fill"));
		setupContents();
	}

	private void setupContents() {
		client = MigLayoutFormUtils.createSection(this, "Target");
		client.setLayout(new MigLayout("fillx", "[pref!][left]", ""));

		packageName = MigLayoutFormUtils.createField(client, "Package *", "");
		// TODO: Make this a directory selection field
		sourceDirectory = MigLayoutFormUtils.createField(client, "Source Directory *", "");
	}

	@Override
	public void merge(JooqConfiguration configuration) {
		configuration.setPackageName(packageName.getText());
		configuration.setSourceDirectory(sourceDirectory.getText());
	}

	@Override
	public void populateFields(JooqConfiguration configuration) {
		packageName.setText(configuration.getPackageName());
		sourceDirectory.setText(configuration.getSourceDirectory());
	}

}
