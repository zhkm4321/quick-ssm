package com.wx.server.exception;

/**
 * 验证码错误异常类
 * 
 * @author zhenghang E-mail: zhenghang@unitedstone.net
 * @version 创建时间：2016年11月28日 上午12:41:50
 */
public class IncorrectCaptchaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8566093024182482202L;

	public IncorrectCaptchaException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IncorrectCaptchaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IncorrectCaptchaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IncorrectCaptchaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IncorrectCaptchaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
