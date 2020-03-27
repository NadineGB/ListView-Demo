package com.example.listviewdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.myListView);

        final ArrayList<String> myFamily = new ArrayList<String>();
        myFamily.add("Nadine");
        myFamily.add("Birgit");
        myFamily.add("Josef");
        myFamily.add("Hildegard");
        myFamily.add("Hedwig");
        myFamily.add("Bernhard");
        myFamily.add("Ulla");
        myFamily.add("Yoshi");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Log.i("Ausgewälte Person", myFamily.get(i));
            }
        });


    }
}
