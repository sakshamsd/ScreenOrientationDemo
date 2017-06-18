package com.example.cksya.orientationdemo;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView h1, h2;
    RecyclerView r1, r2;
    List<Contact> contactList;
    CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h1 = (TextView) findViewById(R.id.h1_textview);
        h2 = (TextView) findViewById(R.id.h2_textview);
        r1 = (RecyclerView) findViewById(R.id.h1_recyclerview);
        r2 = (RecyclerView) findViewById(R.id.h2_recyclerview);
        contactList = new ArrayList<>();


        myAdapter = new CustomAdapter(contactList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(this);
        r1.setLayoutManager(layoutManager);
        r2.setLayoutManager(layoutManager2);

        r1.setItemAnimator(new DefaultItemAnimator());
        r2.setItemAnimator(new DefaultItemAnimator());
        r1.setAdapter(myAdapter);
        r2.setAdapter(myAdapter);
        addGarne();


    }

    void addGarne(){
        Contact list = new Contact("ram", "123456789");
        contactList.add(list);

        list = new Contact("shyam", "12345679");
        contactList.add(list);

        list = new Contact("ghanshyam", "12345679");
        contactList.add(list);

        list = new Contact("ashyam", "012345679");
        contactList.add(list);
        list = new Contact("bshyam", "112345679");
        contactList.add(list);
        list = new Contact("cshyam", "122345679");
        contactList.add(list);
        list = new Contact("dshyam", "123445679");
        contactList.add(list);
        list = new Contact("eshyam", "1234545679");
        contactList.add(list);
        list = new Contact("fshyam", "123458979679");
        contactList.add(list);
        list = new Contact("gshyam", "123456792");
        contactList.add(list);
        list = new Contact("hshyam", "12345675");
        contactList.add(list);
        myAdapter.notifyDataSetChanged();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(this);
            r1.setLayoutManager(layoutManager);
            r1.setItemAnimator(new DefaultItemAnimator());
            r1.setAdapter(myAdapter);
            r2.setLayoutManager(layoutManager2);
            r2.setItemAnimator(new DefaultItemAnimator());
            r2.setAdapter(myAdapter);
            addGarne();

        }
        if(newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
            RecyclerView.LayoutManager layoutManager2 = new GridLayoutManager(this,2);

            r1.setLayoutManager(layoutManager);
            r1.setItemAnimator(new DefaultItemAnimator());
            r1.setAdapter(myAdapter);
            r2.setLayoutManager(layoutManager2);
            r2.setItemAnimator(new DefaultItemAnimator());
            r2.setAdapter(myAdapter);
            addGarne();
        }
    }
}
