package br.ufjf.dcc196.matheus.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public enum Jogada{
        PEDRA(0), PAPEL(1), TESOURA(2);
        private final int valor;
        Jogada(int valor){
            this.valor=valor;

        }
    }

    public enum Resultado{
        DERROTA(-1),EMPATE(0),VITORIA(1);
        private final int valor;
        Resultado(int valor){
            this.valor=valor;
        }
    }

    public static final Resultado TABELA[][]= {
        {Resultado.EMPATE},{Resultado.DERROTA},{Resultado.VITORIA},
        {Resultado.VITORIA},{Resultado.EMPATE},{Resultado.DERROTA},
        {Resultado.DERROTA},{Resultado.VITORIA},{Resultado.EMPATE},
    };

    private Integer pontosCPU = 0;
    private Integer pontosPlayer = 0;

    private Button pedraButton;
    private Button papelButton;
    private Button tesouraButton;

    private ProgressBar progressBarCpu;
    private ProgressBar progressBarPlayer;

    private TextView textViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pedraButton= findViewById(R.id.PedraButton);
        papelButton= findViewById(R.id.PapelButton);
        tesouraButton= findViewById(R.id.TesouraButton);

        progressBarPlayer=findViewById(R.id.progressBarPlayer);
        progressBarCpu= findViewById(R.id.progressBarCpu);
        textViewStatus= findViewById(R.id.TextViewStatus);

    }
    public void ButtonPedraClick(View view){
        rodada(Jogada.PEDRA);
    }

    public void ButtonPapelClick(View view){
        rodada(Jogada.PAPEL);
    }
    public void ButtonTesouraClick(View view){
        rodada(Jogada.TESOURA);
    }

    public void rodada(Jogada jogada){

    }

}