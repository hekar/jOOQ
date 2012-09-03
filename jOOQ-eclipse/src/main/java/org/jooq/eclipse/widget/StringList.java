package org.jooq.eclipse.widget;

import net.miginfocom.swt.MigLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;

public class StringList extends Composite {

	private List list;
	private Button add;
	private Button edit;
	private Button remove;

	public StringList(Composite parent) {
		super(parent, SWT.NONE);

		setLayout(new MigLayout("fill", "", ""));

		list = new List(this, SWT.BORDER | SWT.MULTI |  SWT.V_SCROLL);
		list.setLayoutData("grow, cell 1 1 1 3");

		add = new Button(this, SWT.PUSH);
		add.setLayoutData("cell 2 1");
		add.setText("&Add");
		edit = new Button(this, SWT.PUSH);
		edit.setLayoutData("cell 2 2");
		edit.setText("&Edit");
		remove = new Button(this, SWT.PUSH);
		remove.setLayoutData("cell 2 3");
		remove.setText("&Remove");

		addListeners();
	}

	private void addListeners() {
		add.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {

			}
		});

		edit.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {

			}
		});

		remove.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {

			}
		});
	}

	public void setItems(String[] items) {
		list.setItems(items);
	}

}
