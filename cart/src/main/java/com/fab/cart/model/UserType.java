/**
 * 
 */
package com.fab.cart.model;

/**
 * @author akhilajay
 *
 */
public enum UserType {

	EMPLOYEE(450, "Employee"), AFFILIATE(500, "Affiliate"), PRIVILEGED_CUSTOMER(550, "Privileged Customer");

	private int typeCode;
	private String typeName;

	UserType(int statusCode, String status) {
		this.typeCode = statusCode;
		this.typeName = status;

	}

	/**
	 * @return the typeCode
	 */
	public int getTypeCode() {
		return typeCode;
	}

	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}

}
