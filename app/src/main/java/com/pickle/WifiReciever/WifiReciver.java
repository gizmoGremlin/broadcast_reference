package com.pickle.WifiReciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import static android.net.wifi.WifiManager.NETWORK_STATE_CHANGED_ACTION;
import static com.pickle.WifiReciever.MainActivity.ACTION_CUSTOM_BROADCAST;

public class WifiReciver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();
        String toastMessage = "unknown";
        switch (action) {
            case ACTION_CUSTOM_BROADCAST:
                toastMessage = "Custom Broadcast";
                break;
            case NETWORK_STATE_CHANGED_ACTION:
                toastMessage = "WIFI CHANGED";
                break;
        }
        Log.d("WIFIReciever", action);
        Toast.makeText(context, toastMessage, Toast.LENGTH_LONG).show();
    }
    }

