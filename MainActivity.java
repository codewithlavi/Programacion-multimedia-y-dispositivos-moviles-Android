package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.practica4.R;

public class MainActivity extends AppCompatActivity {
  //declaramos los elementos
    private TextView txt5, txt6, txt7, txt4;
    private Button bt1;
    private EditText et1, et2;
    private CheckBox sumar, restar, multi, dividir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asociamos los elementos
        txt4 = (findViewById(R.id.txt4));
        txt5 = (findViewById(R.id.txt5));
        txt6 = (findViewById(R.id.txt6));
        txt7 = (findViewById(R.id.txt7));
        bt1 = (findViewById(R.id.bt1));
        et1 = (findViewById(R.id.et1));
        et2 = (findViewById(R.id.et2));
        sumar = (findViewById(R.id.sumar));
        restar = (findViewById(R.id.restar));
        multi = (findViewById(R.id.multi));
        dividir = (findViewById(R.id.dividir));

    }

    public void mostrar(View view){
        double dato1 = Double.parseDouble(et1.getText().toString());
        double dato2 = Double.parseDouble(et2.getText().toString());
        double suma = 0.0;
        double resta = 0.0;
        double multiplica = 0.0;
        double divide = 0.0;
        //sumar
        if (sumar.isChecked()){
            suma = dato1 + dato2;
            String texto1 = "El resultado de la suma es: " + Double.toString(suma);
            txt4.setText(texto1);
        }
        //restar
        if (restar.isChecked()) {
            resta = dato1 - dato2;
            String texto2 = "El resultado de la resta es: " + Double.toString(resta);
            txt5.setText(texto2);
        }
        //multiplicar
        if (multi.isChecked()) {
            multiplica = dato1 * dato2;
            String texto3 = "El resultado de la multiplicación es: " + Double.toString(multiplica);
            txt6.setText(texto3);
        }
        //dividir
        if (dividir.isChecked()){
            //comprueba que el divisor no sea cero
           if (dato2 != 0){
           divide = dato1 / dato2;
           String texto4 = "El resultado de la división es: " + Double.toString(divide);
           txt7.setText(texto4);
           }else {
               Toast.makeText(this,"No se puede dividir entre cero", Toast.LENGTH_LONG).show();
           }
        }




    }

}