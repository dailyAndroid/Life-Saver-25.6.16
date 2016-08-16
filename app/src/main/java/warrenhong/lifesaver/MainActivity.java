package warrenhong.lifesaver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendText() {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("6505551212", null, "I'm Abducted", null, null);
    }

    public void fine() {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("6505551212", null, "I'm Fine now", null, null);
    }

    public void lost() {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("6505551212", null, "I'm Lost", null, null);
    }

    public void keys() {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("6505551212", null, "I'm Lost my Keys", null, null);
    }

    public void almostHome() {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("6505551212", null, "I'm almost home", null, null);
    }
}
