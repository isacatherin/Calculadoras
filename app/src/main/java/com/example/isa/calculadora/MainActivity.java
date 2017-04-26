package com.example.isa.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView vista1;
    Button siguiente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vista1 = (TextView) findViewById(R.id.view1);
        siguiente = (Button) findViewById(R.id.btnsiguiente);
        siguiente.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnsiguiente:
                Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);

        }

    }

    //
}
