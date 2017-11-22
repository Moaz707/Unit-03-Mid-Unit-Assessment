package nyc.muaadh_melhi_develpoer.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button save, move;
    private static final String address_shared_preferences = "sharedPrefsTesting";
    private SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = (EditText) findViewById(R.id.edittext);
        save = (Button) findViewById(R.id.save_button);
        move = (Button) findViewById(R.id.move_button);

        sharedPreferences = getApplicationContext().getSharedPreferences(address_shared_preferences, MODE_PRIVATE);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("email address", editText.getText().toString());
                editor.commit();
                editText.setText("");

            }
        });




     move.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
             intent.putExtra("sharedpref", editText.getText().toString());//check again if that what they want
             startActivity(intent);
         }
     });
    }
}

