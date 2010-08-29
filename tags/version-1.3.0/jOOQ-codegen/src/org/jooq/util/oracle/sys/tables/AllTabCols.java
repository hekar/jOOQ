/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

import java.math.BigDecimal;
import java.sql.Date;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.oracle.sys.Sys;


/**
 * This class is generated by jOOQ.
 *
 * Columns of user's tables, views and clusters
 */
public class AllTabCols extends TableImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of ALL_TAB_COLS
	 */
	public static final AllTabCols ALL_TAB_COLS = new AllTabCols();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> OWNER = new TableFieldImpl<String>("OWNER", String.class, ALL_TAB_COLS);

	/**
	 * Table, view or cluster name
	 */
	public static final TableField<String> TABLE_NAME = new TableFieldImpl<String>("TABLE_NAME", String.class, ALL_TAB_COLS);

	/**
	 * Column name
	 */
	public static final TableField<String> COLUMN_NAME = new TableFieldImpl<String>("COLUMN_NAME", String.class, ALL_TAB_COLS);

	/**
	 * Datatype of the column
	 */
	public static final TableField<String> DATA_TYPE = new TableFieldImpl<String>("DATA_TYPE", String.class, ALL_TAB_COLS);

	/**
	 * Datatype modifier of the column
	 */
	public static final TableField<String> DATA_TYPE_MOD = new TableFieldImpl<String>("DATA_TYPE_MOD", String.class, ALL_TAB_COLS);

	/**
	 * Owner of the datatype of the column
	 */
	public static final TableField<String> DATA_TYPE_OWNER = new TableFieldImpl<String>("DATA_TYPE_OWNER", String.class, ALL_TAB_COLS);

	/**
	 * Length of the column in bytes
	 */
	public static final TableField<BigDecimal> DATA_LENGTH = new TableFieldImpl<BigDecimal>("DATA_LENGTH", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Length: decimal digits (NUMBER) or binary digits (FLOAT)
	 */
	public static final TableField<BigDecimal> DATA_PRECISION = new TableFieldImpl<BigDecimal>("DATA_PRECISION", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Digits to right of decimal point in a number
	 */
	public static final TableField<BigDecimal> DATA_SCALE = new TableFieldImpl<BigDecimal>("DATA_SCALE", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Does column allow NULL values?
	 */
	public static final TableField<String> NULLABLE = new TableFieldImpl<String>("NULLABLE", String.class, ALL_TAB_COLS);

	/**
	 * Sequence number of the column as created
	 */
	public static final TableField<BigDecimal> COLUMN_ID = new TableFieldImpl<BigDecimal>("COLUMN_ID", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Length of default value for the column
	 */
	public static final TableField<BigDecimal> DEFAULT_LENGTH = new TableFieldImpl<BigDecimal>("DEFAULT_LENGTH", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Default value for the column
	 */
	public static final TableField<String> DATA_DEFAULT = new TableFieldImpl<String>("DATA_DEFAULT", String.class, ALL_TAB_COLS);

	/**
	 * The number of distinct values in the column
	 */
	public static final TableField<BigDecimal> NUM_DISTINCT = new TableFieldImpl<BigDecimal>("NUM_DISTINCT", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * The low value in the column
	 */
	public static final TableField<byte[]> LOW_VALUE = new TableFieldImpl<byte[]>("LOW_VALUE", byte[].class, ALL_TAB_COLS);

	/**
	 * The high value in the column
	 */
	public static final TableField<byte[]> HIGH_VALUE = new TableFieldImpl<byte[]>("HIGH_VALUE", byte[].class, ALL_TAB_COLS);

	/**
	 * The density of the column
	 */
	public static final TableField<BigDecimal> DENSITY = new TableFieldImpl<BigDecimal>("DENSITY", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * The number of nulls in the column
	 */
	public static final TableField<BigDecimal> NUM_NULLS = new TableFieldImpl<BigDecimal>("NUM_NULLS", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * The number of buckets in histogram for the column
	 */
	public static final TableField<BigDecimal> NUM_BUCKETS = new TableFieldImpl<BigDecimal>("NUM_BUCKETS", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * The date of the most recent time this column was analyzed
	 */
	public static final TableField<Date> LAST_ANALYZED = new TableFieldImpl<Date>("LAST_ANALYZED", Date.class, ALL_TAB_COLS);

	/**
	 * The sample size used in analyzing this column
	 */
	public static final TableField<BigDecimal> SAMPLE_SIZE = new TableFieldImpl<BigDecimal>("SAMPLE_SIZE", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Character set name
	 */
	public static final TableField<String> CHARACTER_SET_NAME = new TableFieldImpl<String>("CHARACTER_SET_NAME", String.class, ALL_TAB_COLS);

	/**
	 * Declaration length of character type column
	 */
	public static final TableField<BigDecimal> CHAR_COL_DECL_LENGTH = new TableFieldImpl<BigDecimal>("CHAR_COL_DECL_LENGTH", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Are the statistics calculated without merging underlying partitions?
	 */
	public static final TableField<String> GLOBAL_STATS = new TableFieldImpl<String>("GLOBAL_STATS", String.class, ALL_TAB_COLS);

	/**
	 * Were the statistics entered directly by the user?
	 */
	public static final TableField<String> USER_STATS = new TableFieldImpl<String>("USER_STATS", String.class, ALL_TAB_COLS);

	/**
	 * The average length of the column in bytes
	 */
	public static final TableField<BigDecimal> AVG_COL_LEN = new TableFieldImpl<BigDecimal>("AVG_COL_LEN", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * The maximum length of the column in characters
	 */
	public static final TableField<BigDecimal> CHAR_LENGTH = new TableFieldImpl<BigDecimal>("CHAR_LENGTH", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * C if maximum length is specified in characters, B if in bytes
	 */
	public static final TableField<String> CHAR_USED = new TableFieldImpl<String>("CHAR_USED", String.class, ALL_TAB_COLS);

	/**
	 * Is column data in 8.0 image format?
	 */
	public static final TableField<String> V80_FMT_IMAGE = new TableFieldImpl<String>("V80_FMT_IMAGE", String.class, ALL_TAB_COLS);

	/**
	 * Has column data been upgraded to the latest type version format?
	 */
	public static final TableField<String> DATA_UPGRADED = new TableFieldImpl<String>("DATA_UPGRADED", String.class, ALL_TAB_COLS);

	/**
	 * Is this a hidden column?
	 */
	public static final TableField<String> HIDDEN_COLUMN = new TableFieldImpl<String>("HIDDEN_COLUMN", String.class, ALL_TAB_COLS);

	/**
	 * Is this a virtual column?
	 */
	public static final TableField<String> VIRTUAL_COLUMN = new TableFieldImpl<String>("VIRTUAL_COLUMN", String.class, ALL_TAB_COLS);

	/**
	 * Sequence number of the column in the segment
	 */
	public static final TableField<BigDecimal> SEGMENT_COLUMN_ID = new TableFieldImpl<BigDecimal>("SEGMENT_COLUMN_ID", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * Internal sequence number of the column
	 */
	public static final TableField<BigDecimal> INTERNAL_COLUMN_ID = new TableFieldImpl<BigDecimal>("INTERNAL_COLUMN_ID", BigDecimal.class, ALL_TAB_COLS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> HISTOGRAM = new TableFieldImpl<String>("HISTOGRAM", String.class, ALL_TAB_COLS);

	/**
	 * Qualified column name
	 */
	public static final TableField<String> QUALIFIED_COL_NAME = new TableFieldImpl<String>("QUALIFIED_COL_NAME", String.class, ALL_TAB_COLS);

	/**
	 * No further instances allowed
	 */
	private AllTabCols() {
		super("ALL_TAB_COLS", Sys.SYS);
	}
}