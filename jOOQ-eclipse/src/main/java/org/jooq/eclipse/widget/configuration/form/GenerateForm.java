package org.jooq.eclipse.widget.configuration.form;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.jooq.eclipse.config.JooqConfiguration;
import org.jooq.eclipse.config.JooqConfigurationable;

public class GenerateForm extends Composite implements JooqConfigurationable {

	public GenerateForm(Composite parent) {
		super(parent, SWT.None);
		
		setupForm();
		setupContents();
	}

	private void setupForm() {
	}

	private void setupContents() {
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
