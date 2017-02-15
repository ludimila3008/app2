package br.com.blogspot.httptecnomaniacosmaniacosporobotica.caodastro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;

public class activityentrar extends AppCompatActivity {
     Button confirmar;
     EditText senha;
    TextView textViewsenha;
    FloatingActionButton FloatActionButton;
    EditText email;
    TextView textViewemail;
    RelativeLayout relativeLayout;
    LinearLayout LinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityentrar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        email = (EditText)  findViewById(R.id.email);
        textViewemail = (TextView) findViewById(R.id.textViewemail);
        textViewsenha = (TextView)findViewById(R.id.textViewsenha);
        senha = (EditText) findViewById(R.id.senha);
        LinearLayout =(LinearLayout)findViewById(R.id.LinearLayout);
        FloatActionButton=(FloatingActionButton) findViewById(R.id.FloactingActionButton);
        FloatActionButton.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick (View View) {
                Intent intent= new Intent(activityentrar.this,MainActivity1.class);}

        });
        confirmar = (Button) findViewById(R.id.confirmar);}
        public void confirmar (View View) {
        if (email.getText().toString().equals("ONGABPA@gmail.com")) {
            senha.getText().toString().equals(1234);
            setContentView(R.layout.activity_perfilda_ong);
        }
        else {
            Toast.makeText(getApplicationContext(), "Usuário ou senha errados", Toast.LENGTH_SHORT).show();}
        }
    }


