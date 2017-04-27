package com.example.deepakjha.jamia_hamdard_app;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Deepak jha on 02-04-2017.
 */

public class MyFirebsaeInstanceId extends FirebaseInstanceIdService {
    private static final String REG_TOKEN="REG_TOKEN";

    @Override
    public void onTokenRefresh() {
        String recent_token=FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN,recent_token);
    }
}
