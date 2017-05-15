package com.starbucksapp.davinci.edu.ar.starbucksapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class CoffeeList extends AppCompatActivity {
    TextView welcomeUser;
    ListView lvCoffee;
    ArrayList<String> coffeeList;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_list);



        welcomeUser= (TextView) findViewById(R.id.welcomeUser);
        Bundle b2=getIntent().getExtras();
        welcomeUser.setText("Welcome "+b2.getString("name"));

        lvCoffee = (ListView) findViewById(R.id.lvCoffee);
        coffeeList = new ArrayList<String>();
        coffeeList.add("Anniversary Blend");
        coffeeList.add("Colombia");
        coffeeList.add("Christmas Blend");
        coffeeList.add("Espresso Roast");
        coffeeList.add("Guatemala");
        coffeeList.add("Italian Roast");
        coffeeList.add("Kenya");
        coffeeList.add("Kati-Kati");
        coffeeList.add("Sumatra");
        coffeeList.add("Verona");


        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,coffeeList);
        lvCoffee.setAdapter(aa);
    }
}
