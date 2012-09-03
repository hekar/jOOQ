package org.jooq.eclipse.config;

import static org.joox.JOOX.$;

import java.io.File;
import java.io.Serializable;

import org.joox.Match;
import org.w3c.dom.Document;

public class JooqConfiguration implements Serializable {
	private static final long serialVersionUID = -3022156606566326047L;

	private String user = "";
	private String password = "";
	private String url = "";
	private String driver = "";
	private String inputSchema = "";
	private String databaseUtil = "";
	private String includes = ".*,";
	private String excludes = "";
	private String packageName = "";
	private String sourceDirectory = "";

	/*
	 * Codegen advanced fields
	 */
	private Boolean relations = false;
	private Boolean navigationMethods = false;
	private Boolean deprecated = false;
	private Boolean instanceFields = false;
	private Boolean generatedAnnotation = false;
	private Boolean records = false;
	private Boolean pojos = false;
	private Boolean interfaces = false;
	private Boolean daos = false;
	private Boolean jpaAnnotations = false;
	private Boolean validationAnnotation = false;

	public static JooqConfiguration fromFile(File file) {
		try {
			JooqConfiguration c = new JooqConfiguration();
			Document document = $(file).document();

			Match jdbc = $(document).find("jdbc").first();
			c.setDriver(jdbc.find("driver").content());
			c.setUrl(jdbc.find("url").content());
			c.setUser(jdbc.find("user").content());
			c.setPassword(jdbc.find("password").content());

			Match database = $(document).find("database").first();
			c.setDatabaseUtil(database.find("name").content());
			c.setIncludes(database.find("includes").content());
			c.setExcludes(database.find("exclude").content());
			c.setInputSchema(database.find("inputSchema").content());

			//Match generate = $(document).find("generate").first();

			Match target = $(document).find("target").first();
			c.setPackageName(target.find("packageName").content());
			c.setSourceDirectory(target.find("directory").content());

			return c;
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public JooqConfiguration() {
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getInputSchema() {
		return inputSchema;
	}

	public void setInputSchema(String inputSchema) {
		this.inputSchema = inputSchema;
	}

	public String getIncludes() {
		return includes;
	}

	public void setIncludes(String includes) {
		this.includes = includes;
	}

	public String getExcludes() {
		return excludes;
	}

	public void setExcludes(String excludes) {
		this.excludes = excludes;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getSourceDirectory() {
		return sourceDirectory;
	}

	public void setSourceDirectory(String sourceDirectory) {
		this.sourceDirectory = sourceDirectory;
	}

	public String getDatabaseUtil() {
		return databaseUtil;
	}

	public void setDatabaseUtil(String databaseUtil) {
		this.databaseUtil = databaseUtil;
	}

	public Boolean getRelations() {
		return relations;
	}

	public void setRelations(Boolean relations) {
		this.relations = relations;
	}

	public Boolean getNavigationMethods() {
		return navigationMethods;
	}

	public void setNavigationMethods(Boolean navigationMethods) {
		this.navigationMethods = navigationMethods;
	}

	public Boolean getDeprecated() {
		return deprecated;
	}

	public void setDeprecated(Boolean deprecated) {
		this.deprecated = deprecated;
	}

	public Boolean getInstanceFields() {
		return instanceFields;
	}

	public void setInstanceFields(Boolean instanceFields) {
		this.instanceFields = instanceFields;
	}

	public Boolean getGeneratedAnnotation() {
		return generatedAnnotation;
	}

	public void setGeneratedAnnotation(Boolean generatedAnnotation) {
		this.generatedAnnotation = generatedAnnotation;
	}

	public Boolean getRecords() {
		return records;
	}

	public void setRecords(Boolean records) {
		this.records = records;
	}

	public Boolean getPojos() {
		return pojos;
	}

	public void setPojos(Boolean pojos) {
		this.pojos = pojos;
	}

	public Boolean getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(Boolean interfaces) {
		this.interfaces = interfaces;
	}

	public Boolean getDaos() {
		return daos;
	}

	public void setDaos(Boolean daos) {
		this.daos = daos;
	}

	public Boolean getJpaAnnotations() {
		return jpaAnnotations;
	}

	public void setJpaAnnotations(Boolean jpaAnnotations) {
		this.jpaAnnotations = jpaAnnotations;
	}

	public Boolean getValidationAnnotation() {
		return validationAnnotation;
	}

	public void setValidationAnnotation(Boolean validationAnnotation) {
		this.validationAnnotation = validationAnnotation;
	}

}
