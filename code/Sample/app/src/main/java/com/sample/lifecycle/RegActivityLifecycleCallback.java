package com.sample.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import com.sample.App;

public class RegActivityLifecycleCallback {

    private final static String TAG = "RegActivityLifeCallback";

    static public void regLifeCycleCallBack()
    {
        Log.d(TAG, "regLifeCycleCallBack");

        final Application app = (Application) App.getContext();
        app.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Log.d(TAG, "onActivityCreated, " + activity);
            }

            @Override
            public void onActivityStarted(Activity activity) {
                Log.d(TAG, "onActivityStarted, " + activity);
            }

            @Override
            public void onActivityResumed(Activity activity) {
                Log.d(TAG, "onActivityResumed, " + activity);
            }

            @Override
            public void onActivityPaused(Activity activity) {
                Log.d(TAG, "onActivityPaused, " + activity);
            }

            @Override
            public void onActivityStopped(Activity activity) {
                Log.d(TAG, "onActivityStopped, " + activity);
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Log.d(TAG, "onActivitySaveInstanceState, " + activity);
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                Log.d(TAG, "onActivityDestroyed, " + activity);
            }
        });
    }
}


