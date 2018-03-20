package com.example.maje.ejercicio1;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText nombre;
    private EditText apellido;



    public static final String Nombre_INTENT ="nombre";
    public static final String Apellido_INTENT ="apellido";
   // private view  btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre =(EditText) findViewById(R.id.NombreeditText);
        apellido =(EditText) findViewById(R.id.ApellidoeditText2);


        Button btn=findViewById(R.id.OKbutton);
        Button rest=findViewById(R.id.ResetButton2);

        btn.setOnClickListener(this);
        rest.setOnClickListener(this);
       /* btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Button b =(Button)view;
                b.setText("hola");
                MainActivity.this.setContentView((R.layout.activity_main));
            }
        });*/

    }

    @Override
    protected void onStart() {
        nombre=findViewById(R.id.NombreeditText);
        apellido=findViewById(R.id.ApellidoeditText2) ;
        super.onStart();
        Toast.makeText(MainActivity.this,"onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Toast.makeText(MainActivity.this,"onCreate",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this,"onResume",Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this,"onResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.OKbutton:
                Intent intent = new Intent(this,SecondActivity.class);
                intent.putExtra(MainActivity.Nombre_INTENT,nombre.getText().toString());
                intent.putExtra(MainActivity.Apellido_INTENT,apellido.getText().toString());

                startActivity(intent);

                //Toast.makeText(this,"no pasa nada",Toast.LENGTH_LONG).show();
                return;
            case R.id.ResetButton2:
                nombre.setText(null);
                apellido.setText(null);
                return;

        }

    }
}
