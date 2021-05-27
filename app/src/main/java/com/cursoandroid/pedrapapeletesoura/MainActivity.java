package com.cursoandroid.pedrapapeletesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectRock(View view){
        this.optionSelected("Pedra");
    }

    public void selectPaper(View view){
        this.optionSelected("Papel");
    }

    public void selectScissors(View view){
        this.optionSelected("Tesoura");
    }

    public void optionSelected( String optionSelected ){

        ImageView imageView = findViewById(R.id.resImage);
        int numberRandom = new Random().nextInt(3);
        String[] vectorHands = {"Pedra", "Papel", "Tesoura"};
        String opcaoApp = ( vectorHands[numberRandom] );

        switch (opcaoApp){
            case "Pedra":
                imageView.setImageResource(R.drawable.pedra);
                break;

            case "Papel":
                imageView.setImageResource(R.drawable.papel);
                break;

            case "Tesoura":
                imageView.setImageResource(R.drawable.tesoura);
                break;
        }

        if (    opcaoApp == "Papel" && optionSelected == "Pedra"
                || opcaoApp == "Tesoura" && optionSelected == "Papel"
                || opcaoApp == "Pedra" && optionSelected == "Tesoura"){

            TextView textView = findViewById(R.id.Resultado);
            textView.setText("Você perdeu :(");
        }
        else if (opcaoApp == optionSelected){
            TextView textView = findViewById(R.id.Resultado);
            textView.setText("Empatamos ;(");
        }
        else{
            TextView textView = findViewById(R.id.Resultado);
            textView.setText("Você ganhou :)");
        }
    }

}