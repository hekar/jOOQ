package org.jooq.eclipse.widget.util;

import net.miginfocom.swt.MigLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Section;

public class MigLayoutFormUtils {
	public static Button createBooleanField(Composite client, String labelText, String tooltip) {
		assert (client.getLayout() instanceof MigLayout);

		Button checkBox = new Button(client, SWT.CHECK);
		checkBox.setText(labelText);
		checkBox.setToolTipText(tooltip);
		checkBox.setLayoutData("wrap 15");
		
		return checkBox;
	}
	
	/**
	 * Create a label + text field + button.
	 * 
	 * Only works with Miglayout
	 * 
	 * @param client
	 *            Parent
	 * @param labelText
	 *            Text for label
	 * @param tooltip
	 *            Tooltip for both label and text field
	 * @param buttonText
	 *            Text for the push button
	 * @return Textfield
	 */
	public static Button createButtonField(Composite client, String labelText, String tooltip, String buttonText) {

		assert (client.getLayout() instanceof MigLayout);

		createLabel(client, labelText, tooltip);

		Text text = new Text(client, SWT.BORDER | SWT.SINGLE);
		text.setToolTipText(tooltip);
		text.setLayoutData("growx");

		Button button = new Button(client, SWT.PUSH);
		button.setText(buttonText);
		button.setLayoutData("wrap 15");

		return button;
	}

	/**
	 * Create a label + text field.
	 * 
	 * Only works with Miglayout
	 * 
	 * @param client
	 *            Parent
	 * @param labelText
	 *            Text for label
	 * @param tooltip
	 *            Tooltip for both label and text field
	 * @return Textfield
	 */
	public static Text createField(Composite client, String labelText, String tooltip) {

		assert (client.getLayout() instanceof MigLayout);

		createLabel(client, labelText, tooltip);

		Text text = new Text(client, SWT.BORDER | SWT.SINGLE);
		text.setToolTipText(tooltip);
		text.setLayoutData("growx, wrap 15");

		return text;
	}

	/**
	 * Create a form label
	 * 
	 * @param client
	 * @param labelText
	 * @param tooltip
	 */
	public static Label createLabel(Composite client, String labelText, String tooltip) {
		Label label = new Label(client, SWT.NONE);
		label.setText(labelText);
		label.setToolTipText(tooltip);
		label.setLayoutData("gapright 15px");

		return label;
	}

	
	/**
	 * Create a section and return a composite to add children
	 * @param parent
	 * @return
	 */
	public static Composite createSection(Composite parent, String title) {
		Section section = new Section(parent, Section.TITLE_BAR);
		section.setLayoutData("grow, wrap");
		section.setText(title);

		Composite sectionClient = new Composite(section, SWT.NONE);
		section.setClient(sectionClient);

		return sectionClient;
	}
}
