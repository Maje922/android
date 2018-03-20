package com.example.maje.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


import com.example.maje.ejercicio1.com.test.beans.PersonaDTO;
import com.example.maje.ejercicio1.com.test.beans.PersonaUnica;

public class Main2Activity extends AppCompatActivity {
    PersonaUnica persona = PersonaUnica.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Toast.makeText(this, persona.getNombre(),Toast.LENGTH_LONG).show();
    }
}
