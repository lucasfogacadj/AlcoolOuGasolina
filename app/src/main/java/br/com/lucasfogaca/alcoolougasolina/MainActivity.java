package br.com.lucasfogaca.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText gasolina;
    private EditText alcool;
    private Button btnCalcular;
    private TextView resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gasolina = findViewById(R.id.txtGasolina);
        alcool = findViewById(R.id.txtAlcool);
        btnCalcular = findViewById(R.id.btnCalcular);
        resposta = findViewById(R.id.resposta);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // Toast.makeText(getApplicationContext(), "Botão Funcionando", Toast.LENGTH_LONG).show();

                if (gasolina.getText().toString().trim().equals("") || alcool.getText().toString().trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "Prencha os valores corretamente", Toast.LENGTH_LONG).show();
                } else {

                    double gas = Double.parseDouble(gasolina.getText().toString());
                    double alc = Double.parseDouble(alcool.getText().toString());

                    double resultado = alc / gas;

                    if (resultado < 0.7) {
                        resposta.setText("Bota Alcool chefia");
                    } else {
                        resposta.setText("Bota Gasosa Chefia!");
                    }
                    alcool.setText("");
                    gasolina.setText("");
                }
            }
        });


    }



}
