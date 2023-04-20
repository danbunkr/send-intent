package de.mindlib.sendIntent;

import android.os.Bundle;
import android.app.Activity;

import com.getcapacitor.BridgeActivity;
import com.getcapacitor.PluginCall;

public class SendIntentActivity extends BridgeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerPlugin(SendIntent.class);
    }

    @Override
    public void onPause() {
        super.onPause();
        Activity activity = bridge.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        Activity activity = bridge.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @PluginMethod
    public void finish(PluginCall call) {
        Activity activity = bridge.getActivity();
        if (activity != null) {
            activity.finish();
        } else {
            call.reject("Activity is null");
        }
    }
}
