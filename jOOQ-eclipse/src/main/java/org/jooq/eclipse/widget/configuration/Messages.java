package org.jooq.eclipse.widget.configuration;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.jooq.eclipse.widget.messages"; //$NON-NLS-1$
	public static String IncludeListTooltip;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
