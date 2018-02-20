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
    int contador;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview1=findViewById(R.id.textView);
        textview1.setText(contador);


}

    public void restar(View v){
        boton1=findViewById(R.id.button);
        contador--;

    }
    public void sumar(View v){
        boton2=findViewById(R.id.button2);
        contador++;

    }

    public void reset(View v){
        boton3=findViewById(R.id.button3);
        contador=0;

    }

}
