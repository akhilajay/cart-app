/**
 * 
 */
package com.fab.cart.model;

import java.io.Serializable;

/**
 * @author akhilajay
 *
 */
public class Response<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3975915454229264575L;
	private T response;
	private String message;
	private int status;

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the response
	 */
	public T getResponse() {
		return response;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(T response) {
		this.response = response;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @param response
	 * @param message
	 * @param status
	 */
	public Response(T response, String message, int status) {
		super();
		this.response = response;
		this.message = message;
		this.status = status;
	}

	/**
	 * 
	 */
	public Response() {
		super();
	}

}
