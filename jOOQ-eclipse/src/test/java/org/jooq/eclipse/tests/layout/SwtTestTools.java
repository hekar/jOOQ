package org.jooq.eclipse.tests.layout;

import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SwtTestTools {
	public static void blockTillQuit(ApplicationWindow dialog) {

		Shell shell = dialog.getShell();
		if (shell == null || !shell.isVisible()) {
			dialog.open();
		}

		shell = dialog.getShell();
		if (shell != null) {
			Display display = shell.getDisplay();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
			display.dispose();
		}
	}
	
	
	public static String dumpChildren(Composite control) {
		StringBuilder sb = new StringBuilder();
		return dumpChildren(sb, control, 0);
	}
	
	private static String dumpChildren(StringBuilder sb, Composite control, int tab) {
		for (int i = 0; i < tab; i++) {
			System.out.println("\t");
		}
		
		System.out.println(control.toString());
		
		for (Control child : control.getChildren()) {
			tab++;
			if (child instanceof Composite) {
				Composite composite = (Composite) child;
				sb.append(dumpChildren(sb, composite, tab));
			}
		}
		
		return sb.toString();
	}
}
