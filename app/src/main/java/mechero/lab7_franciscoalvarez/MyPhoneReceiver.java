package mechero.lab7_franciscoalvarez;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyPhoneReceiver extends BroadcastReceiver {
    private String TAG = "MyPhoneReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG,"funca");
    }
}
