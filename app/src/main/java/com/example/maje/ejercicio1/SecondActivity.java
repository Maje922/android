package com.example.maje.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    private Button boton;
    private EditText calle;
    private EditText cp;

    public String nombre;
    public String apellido;

    public static final String calle_INIT="calle";
    public static final String CP_INIT="cp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        Intent intent = this.getIntent();
        init();
        Toast x;
        if(intent!= null) {

             nombre = intent.getStringExtra(MainActivity.Nombre_INTENT);
             apellido = intent.getStringExtra(MainActivity.Apellido_INTENT);
            x=Toast.makeText(this, nombre+ " " +apellido, Toast.LENGTH_LONG);
            //(EditText)findViewById(R.id.NombrePersona) = nombre;
        }
        else{
            x=Toast.makeText(this, "no hay datos",Toast.LENGTH_LONG);
        }

        x.show();

        Button btn=findViewById(R.id.botoncito);
        btn.setOnClickListener(this);

    }

    private void init() {
        boton=(Button)findViewById(R.id.botoncito);
        calle=(EditText)findViewById(R.id.CalleEditText);
        cp=(EditText)findViewById(R.id.CPeditText3);
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop2",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause2",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy2",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Intent preciusIntent = getIntent();

        if(preciusIntent!=null) {
            nombre = preciusIntent.getStringExtra((MainActivity.Nombre_INTENT));
        }
        Intent intent = new Intent(this, Third_activity.class);
        intent.putExtra(SecondActivity.calle_INIT, calle.getText().toString());
        intent.putExtra(SecondActivity.CP_INIT, cp.getText().toString());


        if(nombre!=null){
            intent.putExtra(MainActivity.Nombre_INTENT,nombre);
        }

        startActivity(intent);
    }
}