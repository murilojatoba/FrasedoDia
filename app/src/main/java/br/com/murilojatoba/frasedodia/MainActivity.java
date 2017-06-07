package br.com.murilojatoba.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnNovaFrase;
    private TextView txtNovaFrase;

    private String[] frases = {
            "A cada nova manhã, nasce junto uma nova chance.",
            "O sucesso normalmente vem para quem está ocupado demais procurando por ele.",
            "Não coloque limites em seus sonhos, coloque fé.",
            "Um pequeno pensamento positivo pela manhã pode mudar todo o seu dia.",
            "O que você tem de diferente é o que você tem de mais bonito.",
            "Viva simples, sonhe grande, seja grato, dê amor, ria muito!",
            "Independente do que estiver sentindo, levante-se, vista-se e saia para brilhar.",
            "Seja você mesmo, todos os outros já existem.",
            "Quer um conselho? Valorize-se.",
            "Deixe o seu sorriso mudar o mundo, mas nunca deixe o mundo mudar o seu sorriso."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNovaFrase = (TextView) findViewById(R.id.txtNovaFrase);
        btnNovaFrase = (Button) findViewById(R.id.btnNovaFrase);

        btnNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);

                txtNovaFrase.setText(frases[numeroAleatorio]);
            }
        });
    }
}
