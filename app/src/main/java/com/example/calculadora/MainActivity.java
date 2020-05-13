package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView pantalla;
    public short numOp;
    public double num1,num2,resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla=findViewById(R.id.textView);
    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn1:
                pantalla.append(getString(R.string.mainStringBoton1));
                break;
            case R.id.btn2:
                pantalla.append(getString(R.string.mainStringBoton2));
                break;
            case R.id.btn3:
                pantalla.append(getString(R.string.mainStringBoton3));
                break;
            case R.id.btn4:
                pantalla.append(getString(R.string.mainStringBoton4));
                break;
            case R.id.btn5:
                pantalla.append(getString(R.string.mainStringBoton5));
                break;
            case R.id.btn6:
                pantalla.append(getString(R.string.mainStringBoton6));
                break;
            case R.id.btn7:
                pantalla.append(getString(R.string.mainStringBoton7));
                break;
            case R.id.btn8:
                pantalla.append(getString(R.string.mainStringBoton8));
                break;
            case R.id.btn9:
                pantalla.append(getString(R.string.mainStringBoton9));
                break;
            case R.id.btn0:
                pantalla.append(getString(R.string.mainStringBoton0));
                break;
            case R.id.btnPunto:
                pantalla.append(getString(R.string.mainStringBotonPunto));
                break;
            case R.id.btnMas:
                try{
                    num1=Double.parseDouble(pantalla.getText().toString());
                    numOp=1;
                }
                catch(NumberFormatException error){
                    Toast.makeText(this, "Valor ingresado no válido, favor de cambiarlo", Toast.LENGTH_SHORT).show();
                }
                pantalla.setText("");
                break;
            case R.id.btnMenos:
                try{
                    num1=Double.parseDouble(pantalla.getText().toString());
                    numOp=2;
                }
                catch(NumberFormatException error){
                    Toast.makeText(this, "Valor ingresado no válido, favor de cambiarlo", Toast.LENGTH_SHORT).show();
                }
                pantalla.setText("");
                break;
            case R.id.btnPor:
                try{
                    num1=Double.parseDouble(pantalla.getText().toString());
                    numOp=3;
                }
                catch(NumberFormatException error){
                    Toast.makeText(this, "Valor ingresado no válido, favor de cambiarlo", Toast.LENGTH_SHORT).show();
                }
                pantalla.setText("");
                break;
            case R.id.btnEntre:
                try{
                    num1=Double.parseDouble(pantalla.getText().toString());
                    numOp=4;
                }
                catch(NumberFormatException error){
                    Toast.makeText(this, "Valor ingresado no válido, favor de cambiarlo", Toast.LENGTH_SHORT).show();
                }
                pantalla.setText("");
                break;
            case R.id.btnSen:
                try{
                    num2=Math.sin(Double.parseDouble(pantalla.getText().toString())*Math.PI/180);
                    pantalla.setText(num2+"");
                }
                catch (NumberFormatException error){
                    Toast.makeText(this, "Valor ingresado no válido, favor de cambiarlo", Toast.LENGTH_SHORT).show();
                    pantalla.setText("");
                }
                break;
            case R.id.btnCos:
                try{
                    num2=Math.cos(Double.parseDouble(pantalla.getText().toString())*Math.PI/180);
                    pantalla.setText(num2+"");
                }
                catch (NumberFormatException error){
                    Toast.makeText(this, "Valor ingresado no válido, favor de cambiarlo", Toast.LENGTH_SHORT).show();
                    pantalla.setText("");
                }
                break;
            case R.id.btnIgual:
                if(pantalla.getText().toString().equals("")==false){
                    try{
                        num2=Double.parseDouble(pantalla.getText().toString());
                        switch(numOp){
                            case 1:
                                resultado=num1+num2;
                                pantalla.setText(resultado+"");
                                break;
                            case 2:
                                resultado=num1-num2;
                                pantalla.setText(resultado+"");
                                break;
                            case 3:
                                resultado=num1*num2;
                                pantalla.setText(resultado+"");
                                break;
                            case 4:
                                if(num2==0){
                                    Toast.makeText(this, "Valor ingresado no válido, favor de cambiarlo", Toast.LENGTH_SHORT).show();
                                    pantalla.setText("");
                                }
                                else{
                                    resultado=num1/num2;
                                    pantalla.setText(resultado+"");
                                }
                                break;
                        }
                    }
                    catch(NumberFormatException error){
                        Toast.makeText(this, "Valor ingresado no válido, favor de cambiarlo", Toast.LENGTH_SHORT).show();
                        pantalla.setText("");
                    }
                }
                else{
                    Toast.makeText(this, "Favor de ingresar un valor para realizar la operación", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnC:
                pantalla.setText("");
                break;
        }
    }
}
