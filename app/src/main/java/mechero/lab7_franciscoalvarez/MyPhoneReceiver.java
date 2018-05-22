package mechero.lab7_franciscoalvarez;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyPhoneReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent intents = new Intent(context,MainActivity.class);
        Log.i("MyPhoneReceiver","funcaaaaaaaaaa");
        context.startActivity(intents);
        Toast.makeText(context,"Done!",Toast.LENGTH_SHORT).show();
    }
}