package com.example.lenovo.content_obs;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;

/**
 * Created by LENOVO on 6/8/2015.
 */
public class myContentObserver extends ContentObserver{
    Handler handler;
    Context context;

    public myContentObserver(Handler handler, Context context) {
        super(handler);
        this.handler=handler;
        this.context = context;
        Log.d("self_change", "MyContentObserver.constructor ");
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    @Override
    public void onChange(boolean selfChange) {

        super.onChange(selfChange);
        Log.d("self_change", "MyContentObserver.onChange(" + selfChange + ")");

    }

    public void onChange(boolean selfChange, Uri uri) {
        Log.d("self_change", "MyContentObserver.onChange(" + selfChange + ")");
    }

}
