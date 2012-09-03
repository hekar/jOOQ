package org.jooq.eclipse.config;

public interface JooqConfigurationable {

	/**
	 * Create a jOOQ configuration based on fields
	 * 
	 * @return
	 */
	void merge(JooqConfiguration configuration);

	/**
	 * Populate fields based on a jOOQ configuration
	 * 
	 * @param configuration
	 */
	void populateFields(JooqConfiguration configuration);
}
