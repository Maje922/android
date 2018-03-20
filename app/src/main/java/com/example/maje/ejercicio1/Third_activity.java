package com.example.maje.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

import com.example.maje.ejercicio1.com.test.beans.PersonaUnica;

public class Third_activity extends AppCompatActivity implements View.OnClickListener{
    public String text[];
    public PersonaUnica persona = PersonaUnica.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_activity);
       /* Toast x;
        Intent intent = this.getIntent();
        if(intent!= null) {

            String calle = intent.getStringExtra(SecondActivity.calle_INIT);
            String cp = intent.getStringExtra(SecondActivity.CP_INIT);
            String nombre = intent.getStringExtra(MainActivity.Nombre_INTENT);
            x=Toast.makeText(this, nombre, Toast.LENGTH_LONG);

            //(EditText)findViewById(R.id.NombrePersona) = nombre;
        }
        else{
            x=Toast.makeText(this, "no hay datos",Toast.LENGTH_LONG);
        }

        x.show();

*/
        init();


        //Button btn = (Button)findViewById(R.id.botn3);
       // btn.setOnClickListener(this);



    }

    private void init(){
        Toast.makeText(this,"nombre: " + persona.getNombre() + "calle: " + persona.getDireccion().getCalle() +"CP: " + persona.getDireccion().getCd(),Toast.LENGTH_LONG).show();

    }


    /*private void leerDatos(){
       // for(int i =0; i< text.length();i++){

        //}
    }
*/
   /* @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop3",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause3",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy3",Toast.LENGTH_LONG).show();
    }
*/

    @Override
    public void onClick(View v) {
        this.finish();
    }
}
