package it.markedapp.convertitoreditemperatura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.support.constraint.ConstraintLayout;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Creo la variabile EditText, in modo da trovare il valore direttamente da input;
    EditText tempCelsius;

    //Creo la variabile TextView, in modo da poter indicare dove scrivere il valore post conversione;
    TextView tvTempF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assegno alla variabile EditText l'id del layout, in modo da trovare direttamente l'elemento a schermo;
        tempCelsius = (EditText)findViewById(R.id.tempCelsius);

        //Assegno alla variabile TextView l'id del layout, in modo da trovare direttamente l'elemento a schermo;
        tvTempF = (TextView)findViewById(R.id.tvTempFahreneit);
    }

    public void converti(View view) {
        //Aggiorno il log preconversione;
        Log.d("converti", "Conversione...");

        //Creo la stringa che conterrà la temperatura in celsius;
        String temperaturaCelsius = tempCelsius.getText().toString();

        //Verifico l'effettivo valore della stringa;
        Log.d("converti", "Temperatura in Celsius = "+ temperaturaCelsius);

        //Creo la variabile della temperatura in celsius e le passo il valore della stringa come int;
        double tempC = Integer.parseInt(temperaturaCelsius);

        //Creo la variabile della temperatura in fahreneit e le assegno il valore di conversione;
        double tempF = tempC*1.8+32;

        //Assegno il valore di tempF alla stringa creata in precedenza, passandolo come string;
        tvTempF.setText(Double.toString(tempF));

        //Creo la stringa con la temperatura in Fahreneit e le assegno il valore, passandolo come string;
        String temperaturaFahreneit = tvTempF.getText().toString();

        //Verifico l'effettivo valore della stringa tvTempF;
        Log.d("converti", "Temperatura in Fahreneit = "+temperaturaFahreneit );
    }
}
