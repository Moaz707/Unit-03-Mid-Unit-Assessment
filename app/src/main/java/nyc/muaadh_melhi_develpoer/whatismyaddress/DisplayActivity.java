package nyc.muaadh_melhi_develpoer.whatismyaddress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        //registerPrefs = getApplicationContext().getSharedPreferences(intent.getStringExtra("sharedKey"), MODE_PRIVATE);
       String textValue=intent.getStringExtra("str");


        TextView textDisplay1=(TextView)findViewById(R.id.text_display01);
        TextView textDisplay2=(TextView)findViewById(R.id.text_display02);

        textDisplay1.setText(textValue);
        textDisplay2.setText(""+textValue.length());





    }
}
