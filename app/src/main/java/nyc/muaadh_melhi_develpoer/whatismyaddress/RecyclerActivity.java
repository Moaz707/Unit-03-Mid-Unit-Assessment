package nyc.muaadh_melhi_develpoer.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RecyclerActivity extends AppCompatActivity {

    private SharedPreferences registerPrefs;
    List<MyList> mylist = new ArrayList<>();

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
            mylist.add(new MyList(entry.getValue().toString()));

        }
        for (MyList key : mylist) {

            Log.e("myList value", key.toString());
        }

        //recycle view

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_View);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        MyAdapter myAdapter = new MyAdapter(mylist);
        recyclerView.setAdapter(myAdapter);


    }


}
