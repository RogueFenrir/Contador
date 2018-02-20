package mx.unam.aragon.fes.diplo.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private Button boton1;
    private Button boton2;
    private Button boton3;
    private TextView textview1;
    int contador=0;
    String contadortext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview1=findViewById(R.id.textView);

        boton3=findViewById(R.id.button3);
        boton1=findViewById(R.id.button);
        boton2=findViewById(R.id.button2);

}

    public void restar(View v){

        contador--;
        contadortext=Integer.toString(contador);
        textview1.setText(contadortext);


    }
    public void sumar(View v){

        contador++;
        contadortext=Integer.toString(contador);
        textview1.setText(contadortext);


    }

    public void reset(View v){

        contador=0;
        contadortext=Integer.toString(contador);
        textview1.setText(contadortext);


    }

}
