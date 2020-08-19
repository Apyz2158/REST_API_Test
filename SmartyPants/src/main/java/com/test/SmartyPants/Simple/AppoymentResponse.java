package com.test.SmartyPants.Simple;

public class AppoymentResponse {

	/*
	 * private String message; private boolean success; private int code; private
	 * Date timestamp;
	 */

	private Body body;
	private  int code;
	private String message;
	private boolean success;
	private String timestamp;

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean succes) {
		this.success = succes;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

//	private String companyId;
//	private List<SlotList> slotsList;
//
//	public String getCompanyId() {
//		return companyId;
//	}
//
//	public void setCompanyId(String companyId) {
//		this.companyId = companyId;
//	}
//
//	public List<SlotList> getSlotsList() {
//		return slotsList;
//	}
//
//	public void setSlotsList(List<SlotList> slotsList) {
//		this.slotsList = slotsList;
//	}

}
