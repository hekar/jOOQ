/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PgCatalog extends SchemaImpl {

	private static final long serialVersionUID = -2052410073;

	/**
	 * The singleton instance of pg_catalog
	 */
	public static final PgCatalog PG_CATALOG = new PgCatalog();

	/**
	 * No further instances allowed
	 */
	private PgCatalog() {
		super(SQLDialect.POSTGRES, "pg_catalog");
	}
}