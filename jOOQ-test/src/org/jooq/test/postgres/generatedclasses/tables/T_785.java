/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_785 extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_785Record> {

	private static final long serialVersionUID = 1083185838;

	/**
	 * The singleton instance of public.t_785
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.T_785 T_785 = new org.jooq.test.postgres.generatedclasses.tables.T_785();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.T_785Record> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.T_785Record.class;
	}

	/**
	 * The table column <code>public.t_785.id</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_785Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.t_785.name</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_785Record, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>public.t_785.value</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_785Record, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR, this);

	public T_785() {
		super("t_785", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	public T_785(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.T_785.T_785);
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.T_785 as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.T_785(alias);
	}
}
