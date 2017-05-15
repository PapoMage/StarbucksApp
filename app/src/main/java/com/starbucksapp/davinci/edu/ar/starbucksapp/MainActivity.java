package com.starbucksapp.davinci.edu.ar.starbucksapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button btncheck;
    EditText nombreUser;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncheck =(Button) findViewById(R.id.btncheck);
        nombreUser = (EditText) findViewById(R.id.nombreUser);
        imageView = (ImageView) findViewById(R.id.imageView);

        btncheck.setOnClickListener(this);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncheck:
                String User = nombreUser.getText().toString();

                if(!User.isEmpty()){
                Intent int1 = new Intent(this,CoffeeList.class);
                    Bundle b =new Bundle();
                    b.putString("name", User);
                    int1.putExtras(b);
                    startActivity(int1);

                Toast t= Toast.makeText(this,"Welcome user "+User,Toast.LENGTH_LONG);
                t.show();

                } else{
                    Toast t=Toast.makeText(this,"Error, please enter name",Toast.LENGTH_SHORT);
                    t.show();
                }
                break;
            case R.id.imageView:

                Toast t= Toast.makeText(this,"This app was created by Pablo Fernandez",Toast.LENGTH_SHORT);
                t.show();
        }
    }
}
