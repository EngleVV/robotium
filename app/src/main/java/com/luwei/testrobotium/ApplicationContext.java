package com.luwei.testrobotium;

import android.app.Application;
import android.content.Context;

/**
 * Created by luwei on 16-8-17.
 */
public class ApplicationContext extends Application {

    public static Context mContext;

    public ApplicationContext() {
        this.mContext = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
