package jinhao.tk.oneshot.app;

import android.app.Application;
import android.content.Context;

import jinhao.tk.commonutils.common.CrashHandler;

/**
 * Created by shanks on 2016/12/22.
 */

public class App extends Application {

    public static Context ctx;

    @Override
    public void onCreate() {
        super.onCreate();
        ctx = getApplicationContext();
        CrashHandler.getInstance().init(getApplicationContext());


    }

    public static Context getInstance() {
        return ctx;
    }
}
