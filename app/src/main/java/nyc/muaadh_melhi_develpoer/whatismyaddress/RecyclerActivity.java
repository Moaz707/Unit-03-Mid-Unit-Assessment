package nyc.muaadh_melhi_develpoer.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Map;

public class RecyclerActivity extends AppCompatActivity {

    private SharedPreferences registerPrefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        Intent intent = getIntent();
        registerPrefs = getApplicationContext().getSharedPreferences(intent.getStringExtra("sharedKey"), MODE_PRIVATE);
        String userEmail = intent.getStringExtra("sharedpref");
        Log.e("userEmail", userEmail);



        for (Map.Entry<String, ?> entry : registerPrefs.getAll().entrySet()) {
            Log.d("ENTRY", entry.getValue() + " " + "Key: " + entry.getKey());
            Log.d("ENTRY", entry.getValue() + " " + "Size " + registerPrefs.getAll().entrySet().size());


        }
    }
}
