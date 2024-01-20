package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private ArrayAdapter aAdapter;
    private String[] users = { "Android", "Java", "PHP", "Hadoop", "sap","Python","Ajax","C++","Ruby","Rails","c","JS","MAD","DSU","pscal","Bash","Css","HTML"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.userlist);
        aAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);
        mListView.setAdapter(aAdapter);
      mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

              Toast.makeText(MainActivity.this,users[position],Toast.LENGTH_LONG).show();
          }
      });


    }
  // @Override

   // public void  OnItemClickListener()
    //public void onItemClick(ArrayAdapter<?> parent, View view,int position,long id)
    //{
      //  String value=mListView.getItemAtPosition(position).toString();
        //Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
    //}
}
