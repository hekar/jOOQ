/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.derby.sys.tables.Sysconglomerates;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class SysconglomeratesRecord extends TableRecordImpl<SysconglomeratesRecord> {

	private static final long serialVersionUID = -930582123;

	/**
	 * An uncommented item
	 */
	public void setSchemaid(String value) {
		setValue(Sysconglomerates.SCHEMAID, value);
	}

	/**
	 * An uncommented item
	 */
	public String getSchemaid() {
		return getValue(Sysconglomerates.SCHEMAID);
	}

	/**
	 * An uncommented item
	 */
	public void setTableid(String value) {
		setValue(Sysconglomerates.TABLEID, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableid() {
		return getValue(Sysconglomerates.TABLEID);
	}

	/**
	 * An uncommented item
	 */
	public void setConglomeratenumber(Long value) {
		setValue(Sysconglomerates.CONGLOMERATENUMBER, value);
	}

	/**
	 * An uncommented item
	 */
	public Long getConglomeratenumber() {
		return getValue(Sysconglomerates.CONGLOMERATENUMBER);
	}

	/**
	 * An uncommented item
	 */
	public void setConglomeratename(String value) {
		setValue(Sysconglomerates.CONGLOMERATENAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConglomeratename() {
		return getValue(Sysconglomerates.CONGLOMERATENAME);
	}

	/**
	 * An uncommented item
	 */
	public void setIsindex(Boolean value) {
		setValue(Sysconglomerates.ISINDEX, value);
	}

	/**
	 * An uncommented item
	 */
	public Boolean getIsindex() {
		return getValue(Sysconglomerates.ISINDEX);
	}

	/**
	 * An uncommented item
	 */
	public void setDescriptor(String value) {
		setValue(Sysconglomerates.DESCRIPTOR, value);
	}

	/**
	 * An uncommented item
	 */
	public String getDescriptor() {
		return getValue(Sysconglomerates.DESCRIPTOR);
	}

	/**
	 * An uncommented item
	 */
	public void setIsconstraint(Boolean value) {
		setValue(Sysconglomerates.ISCONSTRAINT, value);
	}

	/**
	 * An uncommented item
	 */
	public Boolean getIsconstraint() {
		return getValue(Sysconglomerates.ISCONSTRAINT);
	}

	/**
	 * An uncommented item
	 */
	public void setConglomerateid(String value) {
		setValue(Sysconglomerates.CONGLOMERATEID, value);
	}

	/**
	 * An uncommented item
	 */
	public String getConglomerateid() {
		return getValue(Sysconglomerates.CONGLOMERATEID);
	}

	public SysconglomeratesRecord(Configuration configuration) {
		super(configuration, Sysconglomerates.SYSCONGLOMERATES);
	}
}