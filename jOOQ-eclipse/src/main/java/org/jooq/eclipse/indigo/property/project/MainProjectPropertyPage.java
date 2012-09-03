package org.jooq.eclipse.indigo.property.project;

import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.PropertyPage;

public class MainProjectPropertyPage extends PropertyPage {

	private static final String PATH_TITLE = "Path:";

	/**
	 * Constructor for SamplePropertyPage.
	 */
	public MainProjectPropertyPage() {
		super();
	}

	private void addFirstSection(Composite parent) {
		Composite composite = createDefaultComposite(parent);

		// Label for path field
		Label pathLabel = new Label(composite, SWT.NONE);
		pathLabel.setText(PATH_TITLE);

		// Path text field
		// Text pathValueText = new Text(composite, SWT.WRAP | SWT.READ_ONLY);
		//
		// IAdaptable element = getElement();
		// if (element instanceof IResource) {
		// IResource resource = (IResource) element;
		// } else if (element instanceof IProjectNature) {
		// IProjectNature resource = (IProjectNature) element;
		// }
	}

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);

		addFirstSection(composite);
		return composite;
	}

	private Composite createDefaultComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);

		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		composite.setLayoutData(data);

		return composite;
	}

	protected void performDefaults() {
		super.performDefaults();
	}

	public boolean performOk() {
		// setup the jOOQ xml file
		
		// IAdaptable element = getElement();
		// IProjectNature projectNature = (IProjectNature) element;
		// IProject project = projectNature.getProject();

		return true;
	}

}