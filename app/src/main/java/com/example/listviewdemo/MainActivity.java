package com.example.listviewdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView familyListView = (ListView) findViewById(R.id.myListView);

       /* final ArrayList<String> myFamily = new ArrayList<String>();
        myFamily.add("Nadine");
        myFamily.add("Birgit");
        myFamily.add("Josef");
        myFamily.add("Hildegard");
        myFamily.add("Hedwig");
        myFamily.add("Bernhard");
        myFamily.add("Ulla");
        myFamily.add("Yoshi");*/

        // Kurzschreibweise
        final ArrayList<String> myFamily = new ArrayList<String>(asList("Anna", "Stoffel", "Feldi", "Andre A.", "Andre B."));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        familyListView.setAdapter(arrayAdapter);

        familyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Log.i("Ausgewälte Person", myFamily.get(i));

                Toast.makeText(getApplicationContext(), "Hallo " + myFamily.get(i), Toast.LENGTH_SHORT).show();
            }

        });


    }
}
