package com.fjsdxy.j093ac;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
public class MyBroadcastReceiverOne extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("MyBroadcastReceiverOne", "自定义的广播接收者One,接收到了广播事件");
    }
}
