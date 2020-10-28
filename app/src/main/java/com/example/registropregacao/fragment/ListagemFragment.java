package com.example.registropregacao.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.registropregacao.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListagemFragment extends Fragment {

    private TextView textListagem;
    private EditText nomeLista;
    private FloatingActionButton floatingActionButton;


    public ListagemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        final View view =  inflater.inflate(R.layout.fragment_listagem, container, false);
        nomeLista = view.findViewById(R.id.editNomeLista);


        return view;


    }




}
