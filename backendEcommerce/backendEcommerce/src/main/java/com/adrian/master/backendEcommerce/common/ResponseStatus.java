package com.adrian.master.backendEcommerce.common;

public enum ResponseStatus {
	OK,
	INCOMPATIBLE_VERSION,
	VALIDATION_FAILED,
	RUNTIME_EXCEPTION;
	
	public static ResponseStatus byOrdinal(int ordinal) {
		switch (ordinal) {
		case 0:
			return OK;
		case 1:
			return INCOMPATIBLE_VERSION;
		case 2:
			return VALIDATION_FAILED;
		case 3:
			return RUNTIME_EXCEPTION;
		}
		return null;
	}
}
