package com.example.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private TextView textView;

    ArrayList<String> language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                listview=findViewById(R.id.listView);
                textView=findViewById(R.id.textView);
                language=new ArrayList<>();
                language.add("C++");
                language.add("JAVA");
                language.add("Python");

                listview.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, language));



    }
}
