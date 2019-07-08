package com.pickle.WifiReciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.widget.Toast;

import static com.pickle.WifiReciever.MainActivity.ACTION_CUSTOM_BROADCAST;

public class WifiReciver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();
        switch (action) {
            case ACTION_CUSTOM_BROADCAST:

            Toast.makeText(context, "CUSTOM Broadcast Recieved", Toast.LENGTH_LONG).show();
        }


    }
    }

