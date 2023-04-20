package de.mindlib.sendIntent;

import android.os.Bundle;
import android.app.Activity;

import com.getcapacitor.BridgeActivity;

public class SendIntentActivity extends BridgeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerPlugin(SendIntent.class);
    }

    @Override
    public void onPause() {
        super.onPause();
        if (bridge != null) {
            Activity activity = bridge.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (bridge != null) {
            Activity activity = bridge.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }
}
