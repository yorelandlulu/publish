package com.kun.flow.constants;


public class Constants {
	private Constants() {
	}

	public static final String USER_INFO = "SK_LoginControl_login_userInfo";

	// 系统分隔符
	public static final String SYSTEM_SEPARATOR = System.getProperty("file.separator");

    public static final Integer NEWS_STATUS_NONAUDIT = 4;
    public static final String NEWS_STATUS_NONAUDIT_DISPLAY = "未审核";
    public static final Integer NEWS_STATUS_ALREADY_AUDIT = 5;
    public static final String NEWS_STATUS_ALREADY_AUDIT_DISPLAY = "已审核";

}