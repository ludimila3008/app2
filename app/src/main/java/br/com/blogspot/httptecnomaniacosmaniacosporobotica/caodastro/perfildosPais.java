package br.com.blogspot.httptecnomaniacosmaniacosporobotica.caodastro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Toolbar;

public class perfildosPais extends AppCompatActivity {
     Button buttoncadastrocrianças;
     ImageView imageViewiconeusuarionovo;
    ImageView imageViewautismo;
    TextView textViewnome;
    TextView textViewnumerodotelefone;
    TextView textViewcep;
    TextView textViewnumerocep;
    TextView textViewtelefone;
    android.widget.Toolbar toolbarperfilpais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfildos_pais);
        buttoncadastrocrianças=(Button)findViewById(R.id.buttoncadastrocrianças);
        imageViewiconeusuarionovo=(ImageView)findViewById(R.id.imageViewiconeususarionovo);
        imageViewautismo=(ImageView)findViewById(R.id.imageViewautismo);
        textViewnome=(TextView)findViewById(R.id.textViewnome);
        textViewcep=(TextView)findViewById(R.id.textViewcep);
        textViewnumerocep=(TextView)findViewById(R.id.textViewnumerocep);
        textViewnumerodotelefone=(TextView)findViewById(R.id.textViewnumerotelefone);
        textViewtelefone=(TextView)findViewById(R.id.textViewtelefone);
        toolbarperfilpais=(android.widget.Toolbar)findViewById(R.id.toolbarperfilpais);


    }

}
