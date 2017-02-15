package br.com.blogspot.httptecnomaniacosmaniacosporobotica.caodastro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class formularioOng extends AppCompatActivity {
    ImageView iconeFormulario;
    TextView cadastro;
    TextView nomedainstituição;
    TextView telefone;
    TextView cep;
    Button buttonfinalizar;
    EditText editTextnomedainstituição;
    EditText editTexttelefone;
    EditText editTextcep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_ong);
        iconeFormulario=(ImageView)findViewById(R.id.iconeFormulario);
        cadastro=(TextView)findViewById(R.id.cadastro);
        nomedainstituição=(TextView)findViewById(R.id.nomedainstituição);
        telefone=(TextView)findViewById(R.id.telefone);
        cep=(TextView)findViewById(R.id.cep);
        buttonfinalizar=(Button)findViewById(R.id.buttonfinalizar);
        editTextnomedainstituição=(EditText)findViewById(R.id.editTextnomedainstituição);
        editTexttelefone=(EditText)findViewById(R.id.editTexttelefone);
        editTextcep=(EditText)findViewById(R.id.editTextcep);
        buttonfinalizar=(Button)findViewById(R.id.buttonfinalizar);}

    public void buttonfinalizar (View View) {
        if (editTextnomedainstituição.getText().toString().equals("ONG ABPA")) {
            editTexttelefone.getText().toString().equals("91111-1111");
            editTextcep.getText().toString().equals("11.111-111");
            setContentView(R.layout.activity_perfilda_ong);
        }
        else {
            Toast.makeText(getApplicationContext(), "Campo Obrigatório", Toast.LENGTH_SHORT).show();
            {

            }


        }}}