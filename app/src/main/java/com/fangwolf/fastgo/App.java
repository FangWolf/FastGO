package com.fangwolf.fastgo;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.squareup.leakcanary.LeakCanary;

import butterknife.ButterKnife;

/**
 * @Auther 獠牙血狼
 * @Date 2019/1/29
 * @Desc 代替默认Application
 */
public class App extends Application {


    @Override
    public void onCreate() {
        initLogger();
        initLeakCanary();
        super.onCreate();
    }

    /**
     * 日志库
     */
    private void initLogger() {
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    /**
     * 内存泄漏
     */
    private void initLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }

}
