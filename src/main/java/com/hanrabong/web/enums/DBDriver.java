package com.hanrabong.web.enums;

public enum DBDriver {
	ORACLE_DRIVER,
	MARIA_DRIVER,
	H2_DRIVER;
	
	@Override
	public String toString() {
		String driver = "";
		switch (this) {
		case ORACLE_DRIVER:
			driver = "oracle.jdbc.OracleDriver";
			break;
		case MARIA_DRIVER :
			driver = "org.mariadb.jdbc.Driver";
			break;
		case H2_DRIVER :
			driver = "org.h2.Driver";
			break;
		default:
			break;
		}
		return driver;
	}
}