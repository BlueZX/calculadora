package cl.bluez.calculadora;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnCero;
    private Button btnUno;
    private Button btnDos;
    private Button btnTres;
    private Button btnCuatro;
    private Button btnCinco;
    private Button btnSeis;
    private Button btnSiete;
    private Button btnOcho;
    private Button btnNueve;
    private Button btnPunto;
    private Button btnPlus;
    private Button btnIgual;
    private Button btnClean;
    private Button btnMenos;
    private Button btnX;
    private Button btn;

    private TextView tvCalcular;

    private String calculo = "";
    private Double primerValor = 0.0;
    private Double segundoValor = 0.0;
    private Double valor= 0.0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvCalcular = (TextView) findViewById(R.id.calculo);

        btnCero = (Button) findViewById(R.id.btnCero);
        btnUno = (Button) findViewById(R.id.btnUno);
        btnDos = (Button) findViewById(R.id.btnDos);
        btnTres = (Button) findViewById(R.id.btnTres);
        btnCuatro = (Button) findViewById(R.id.btnCuatro);
        btnCinco = (Button) findViewById(R.id.btnCinco);
        btnSeis = (Button) findViewById(R.id.btnSeis);
        btnSiete = (Button) findViewById(R.id.btnSiete);
        btnOcho = (Button) findViewById(R.id.btnOcho);
        btnNueve = (Button) findViewById(R.id.btnNueve);
        btnPunto = (Button) findViewById(R.id.btnPunto);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        btnX = (Button) findViewById(R.id.btnX);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnClean = (Button) findViewById(R.id.clean);

        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo = "";
                valor = 0.0;
                tvCalcular.setText(calculo);
            }
        });

        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculo += "0";
                tvCalcular.setText(calculo);
            }
        });

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo += "1";
                tvCalcular.setText(calculo);
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo += "2";
                tvCalcular.setText(calculo);
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo += "3";
                tvCalcular.setText(calculo);
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo += "4";
                tvCalcular.setText(calculo);
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo += "5";
                tvCalcular.setText(calculo);
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo += "6";
                tvCalcular.setText(calculo);
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo += "7";
                tvCalcular.setText(calculo);
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo += "8";
                tvCalcular.setText(calculo);
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo += "9";
                tvCalcular.setText(calculo);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo += "+";
                tvCalcular.setText(calculo);
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo += "-";
                tvCalcular.setText(calculo);
            }
        });

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculo += "x";
                tvCalcular.setText(calculo);
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] calculos = calculo.split("[-+x/]");
                String[] operacion = calculo.split("[1234567890.]", -1);

                ArrayList<String> operar= new ArrayList<String>();

                for(int i=0; i < operacion.length ; i++){
                    if(!operacion[i].isEmpty()){
                        Log.d("calculos:",operacion[i]+ "    xd");
                        operar.add(operacion[i]);
                    }
                }

                for(int i = 0; i < operar.size();i++){
                    switch (operar.get(i)){
                        case "x":
                            if(i == 0){
                                valor = Double.valueOf(calculos[i]) * Double.valueOf(calculos[i+1]);

                            }else{
                                valor *=  Double.valueOf(calculos[i+1]);
                            }
                            tvCalcular.setText(valor+"");
                            break;
                        case "+":
                            if(i == 0){
                                valor = Double.valueOf(calculos[i]) + Double.valueOf(calculos[i+1]);

                            }else{
                                valor +=  Double.valueOf(calculos[i+1]);
                            }
                            tvCalcular.setText(valor+"");
                            break;
                        case "-":
                            if(i == 0){
                                valor = Double.valueOf(calculos[i]) - Double.valueOf(calculos[i+1]);

                            }else{
                                valor -=  Double.valueOf(calculos[i+1]);
                            }
                            tvCalcular.setText(valor+"");
                            break;
                        default:
                            break;
                    }
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
