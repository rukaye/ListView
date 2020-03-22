package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listVw;
    List<mesajModel>list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        listDoldur();


    }
    public  void tanimla()
    {
      listVw=findViewById(R.id.listView);

    }
    public  void listDoldur()
    {
        list=new ArrayList<>();
        mesajModel m1=new mesajModel("merhaba ben mırnaw","kedi",R.drawable.kedi);
        mesajModel m2=new mesajModel("merhaba ben rex","köpek",R.drawable.dog);
        mesajModel m3=new mesajModel("merhaba ben giraff","zürafa",R.drawable.giraffe);
        list.add(m1);
        list.add(m2);
        list.add(m3);
        mesajAdapter adp=new mesajAdapter(list,this);
        listVw.setAdapter(adp);

    }

}
