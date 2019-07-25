package com.adrian.master.backendEcommerce.common;

public class JsonResponse {

	protected String responseId;
	protected ResponseStatus responseStatus;
	protected String responseMessage;
	protected String responseSlack;
	
	public String toString() {
		String _log = " responseStatus="+this.responseStatus;
		if (this.responseMessage != null)
			_log += " responseMessage="+this.responseMessage;
		_log += "\n";
    	return _log;
    }
	
	public String getResponseId() {
		return responseId;
	}
	
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getResponseSlack() {
		return responseSlack;
	}

	public void setResponseSlack(String responseSlack) {
		this.responseSlack = responseSlack;
	}
}
