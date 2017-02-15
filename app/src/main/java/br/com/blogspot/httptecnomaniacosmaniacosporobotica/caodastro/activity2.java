package br.com.blogspot.httptecnomaniacosmaniacosporobotica.caodastro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class activity2 extends AppCompatActivity {
     Button buttoncaes;
    Button buttoncrianças;
    ImageView cao;
    ImageView crianca;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        cao=(ImageView)findViewById(R.id.cao);
        crianca=(ImageView)findViewById(R.id.crianca);
        buttoncrianças=(Button)findViewById(R.id.buttoncrianças);
        buttoncrianças.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Intent intent = new Intent(activity2.this,formularioPais.class);
                startActivity(intent);


                buttoncaes=(Button)findViewById(R.id.buttoncaes);
                buttoncaes.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View View) {
                        Intent intent = new Intent(activity2.this,formularioOng.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }

}
