package com.luwei.testrobotium;

import android.widget.Toast;

public final class ToastUtil {

	private ToastUtil() {

	}

	public static final void showToast(String content) {
		Toast.makeText(ApplicationContext.mContext, content, Toast.LENGTH_SHORT).show();
	}

}
