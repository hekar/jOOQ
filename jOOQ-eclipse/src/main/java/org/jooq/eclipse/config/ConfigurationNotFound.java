package org.jooq.eclipse.config;

/**
 * Failure to find a jOOQ configuration file
 */
public class ConfigurationNotFound extends RuntimeException {

	private static final long serialVersionUID = 5199831793541221059L;

	public ConfigurationNotFound() {
		super();
	}

	public ConfigurationNotFound(String message, Throwable cause) {
		super(message, cause);
	}

	public ConfigurationNotFound(String message) {
		super(message);
	}

	public ConfigurationNotFound(Throwable cause) {
		super(cause);
	}

}
