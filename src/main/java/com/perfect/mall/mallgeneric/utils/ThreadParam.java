package com.perfect.mall.mallgeneric.utils;

public class ThreadParam {

	private static final ThreadLocal<Watch> param = new ThreadLocal<Watch>();

	public static void set(Watch w) {
		param.set(w);
	}

	public static Watch get() {
		return param.get();
	}

	public static void remove() {
		param.remove();
	}

	public static String logMsg(String msg) {
		Watch w = get();
		if (w != null) {
			msg = w.logMsg(msg);
		}
		return msg;
	}

}
