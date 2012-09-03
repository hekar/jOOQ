package org.jooq.eclipse.widget.configuration.form;

import net.miginfocom.swt.MigLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.Section;
import org.jooq.eclipse.config.JooqConfiguration;
import org.jooq.eclipse.config.JooqConfigurationable;
import org.jooq.eclipse.widget.StringList;
import org.jooq.eclipse.widget.configuration.Messages;
import org.jooq.eclipse.widget.util.MigLayoutFormUtils;

public class IncludeExcludeForm extends Composite implements JooqConfigurationable {

	private Composite client;
	
	private StringList includeList;
	private StringList excludeList;


	public IncludeExcludeForm(Composite parent) {
		super(parent, SWT.NONE);
		setLayout(new MigLayout("fill"));
		setupContents();
	}

	private void setupContents() {
		client = MigLayoutFormUtils.createSection(this, "Include/Exclude Table(s)"); //$NON-NLS-1$
		client.setLayout(new MigLayout("fillx", "[pref!][100%!][pref!]", "")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		Label includeLabel = MigLayoutFormUtils.createLabel(client, "Includes", "");
		includeLabel.setLayoutData("growx, wrap");
		includeList = new StringList(client);
		includeList.setToolTipText(Messages.IncludeListTooltip);
		includeList.setLayoutData("growx, wrap 15");

		Label excludeLabel = MigLayoutFormUtils.createLabel(client, "Excludes", "");
		excludeLabel.setLayoutData("growx, wrap");
		excludeList = new StringList(client);
		excludeList.setToolTipText("");
		excludeList.setLayoutData("growx, wrap 15");
	}

	public void populateFields(JooqConfiguration configuration) {
		String[] includes = configuration.getIncludes().split(",");
		includeList.setItems(includes);

		String[] excludes = configuration.getExcludes().split(",");
		excludeList.setItems(excludes);
	}

	@Override
	public void merge(JooqConfiguration configuration) {
	}

}
