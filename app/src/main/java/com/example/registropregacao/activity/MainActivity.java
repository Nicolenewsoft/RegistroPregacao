package com.example.registropregacao.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.registropregacao.R;
import com.example.registropregacao.fragment.ContatoFragment;
import com.example.registropregacao.fragment.ListagemFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import static java.lang.Integer.*;

public class MainActivity extends AppCompatActivity {

    private Button buttonListagem, buttonContato;
    private ListagemFragment listagemFragment;
    private ContatoFragment contatoFragment;
    private FloatingActionButton floatingActionButton;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContato = findViewById(R.id.buttonContato);
        buttonListagem = findViewById(R.id.buttonListagem);
        recyclerView = findViewById(R.id.recyclerView);

        listagemFragment = new ListagemFragment();
        contatoFragment = new ContatoFragment();

        //Removendo a sombra da barra
        getSupportActionBar().setElevation(0);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, listagemFragment);
        transaction.commit();

        buttonListagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listagemFragment = new ListagemFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, listagemFragment);
                transaction.commit();
            }
        });

        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatoFragment = new ContatoFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatoFragment);
                transaction.commit();
            }
        });

        //Configurar adapter


        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        //recyclerView.setAdapter();


    }

    public void irGerarLista(View view){

        Intent intent = new Intent(this, GerarLista.class);
        startActivity(intent);

    }



}

