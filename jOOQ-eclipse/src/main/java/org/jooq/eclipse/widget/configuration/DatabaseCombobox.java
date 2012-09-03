package org.jooq.eclipse.widget.configuration;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.widgets.Composite;

public class DatabaseCombobox extends ComboViewer {

	/**
	 * Label to database names
	 */
	private static final Map<String, String> databases = new LinkedHashMap<String, String>();
	static {
		databases.put("ASE", "org.jooq.util.ase.ASEDatabase");
		databases.put("Cubrid", "org.jooq.util.cubrid.CUBRIDDatabase");
		databases.put("DB2", "org.jooq.util.db2.DB2Database");
		databases.put("Derby", "org.jooq.util.derby.DerbyDatabase");
		databases.put("H2", "org.jooq.util.h2.H2Database");
		databases.put("HSQLDB", "org.jooq.util.hsqldb.HSQLDBDatabase");
		databases.put("Ingres", "org.jooq.util.ingres.IngresDatabase");
		databases.put("MySQL", "org.jooq.util.mysql.MySQLDatabase");
		databases.put("Oracle", "org.jooq.util.oracle.OracleDatabase");
		databases.put("Postgres", "org.jooq.util.postgres.PostgresDatabase");
		databases.put("SQLite", "org.jooq.util.sqlite.SQLiteDatabaes");
		databases.put("SQL Server", "org.jooq.util.sqlserver.SQLServerDatabase");
		databases.put("Sybase", "org.jooq.util.sybase.SybaseDatabase");
	}

	public DatabaseCombobox(Composite parent) {
		super(parent);

		listSetItems(databases.keySet().toArray(new String[] {}));
		listSetSelection(new int[] {0});
	}

	/**
	 * Get the name of the selected database classname
	 * 
	 * @return Returns blank string if no database is selected
	 */
	public String getSelectedDatabaseClassname() {
		String databaseName = getSelectedDatabaseName();
		return databases.get(databaseName);
	}

	/**
	 * Get the name of the selected database name
	 * 
	 * @return Returns blank string if no database is selected
	 */
	public String getSelectedDatabaseName() {
		int[] indices = listGetSelectionIndices();
		int index = indices[0];
		if (indices.length > 0) {
			List<String> keys = new ArrayList<String>(databases.keySet());
			String databaseName = keys.get(index);
			return (databaseName == null) ? "" : databaseName;
		} else {
			return "";
		}
	}

	/**
	 * Set the selected database by classname
	 * 
	 * @param classname
	 */
	public void setSelectedByClassname(String classname) {
		int selection = 0;
		for (Entry<String, String> database : databases.entrySet()) {
			if (database.getValue().equals(classname)) {
				listSetSelection(new int[] {selection});
			}
			selection++;
		}
	}

}
