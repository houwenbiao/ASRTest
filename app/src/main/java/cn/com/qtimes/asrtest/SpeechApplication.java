package cn.com.qtimes.asrtest;

import android.app.Application;

import com.iflytek.cloud.SpeechUtility;

/**
 * Author: JackHou
 * Date: 2017/9/30.
 */

public class SpeechApplication extends Application {
    private final String APP_ID = "59ce08b7";
    @Override
    public void onCreate() {
        SpeechUtility.createUtility(this, "appid=" + APP_ID);
        super.onCreate();
    }
}
