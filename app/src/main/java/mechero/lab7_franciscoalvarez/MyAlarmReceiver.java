package mechero.lab7_franciscoalvarez;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import java.util.Random;

public class MyAlarmReceiver extends BroadcastReceiver {
    private int id;
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Time's Up!", Toast.LENGTH_SHORT).show();

        Random rn = new Random();
        id = rn.nextInt();

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context)
                .setSmallIcon(R.drawable.ic_android_black_24dp)
                .setContentTitle("Advisory Message.")
                .setContentText("Check the application. ID: " + id);

        PendingIntent contentIntent = PendingIntent.getActivity(context, 0,
                new Intent(context, MainActivity.class), PendingIntent.FLAG_UPDATE_CURRENT);

        mBuilder.setContentIntent(contentIntent);

        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(id, mBuilder.build());
    }

}