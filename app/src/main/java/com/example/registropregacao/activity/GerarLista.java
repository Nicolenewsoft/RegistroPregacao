package com.example.registropregacao.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.registropregacao.R;
import com.example.registropregacao.fragment.ListagemFragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GerarLista extends AppCompatActivity {

    private EditText numeroInicial, numeroFinal, nomeLista;
    private Button buttonSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerar_lista);

        numeroInicial = findViewById(R.id.editNumeroInicial);
        numeroFinal = findViewById(R.id.editNumeroFinal);
        buttonSalvar = findViewById(R.id.buttonSalvar);
        nomeLista = findViewById(R.id.editNomeLista);



        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int init = 0;

                Integer numeroinicial = Integer.valueOf(numeroInicial.getText().toString());
                Integer numerofinal = Integer.valueOf(numeroFinal.getText().toString());

                List<Integer> lista = new ArrayList<>();

                for(int i = numeroinicial; i <= numerofinal; i++){
                    init++;


                    lista.add(init);

                }

                Intent intent = new Intent(getApplicationContext(), ListagemFragment.class);

                intent.putExtra("nomeLista", "Lista1");

                startActivity(intent);

                //System.out.println("Lista Final" + lista.toString());



            }

        });

    }





}

