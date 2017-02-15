package br.com.blogspot.httptecnomaniacosmaniacosporobotica.caodastro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.RelativeLayout;


import static br.com.blogspot.httptecnomaniacosmaniacosporobotica.caodastro.R.id.button1;
import static br.com.blogspot.httptecnomaniacosmaniacosporobotica.caodastro.R.id.button2;

public class MainActivity1 extends AppCompatActivity {
    Button button1;
    Button button2;
    ImageView caodastroimageview;
    RelativeLayout relativeLayout;


    @Overrid
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        caodastroimageview =(ImageView) findViewById(R.id.caodastroimageview);
        button2=(Button)findViewById(R.id.button2);
        relativeLayout=(RelativeLayout) findViewById(R.id.content_main1);


        button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity1.this,activityentrar.class);
                startActivity(intent);
            }


        });



    }}


