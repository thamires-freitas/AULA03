package com.example.arqdsis.servicedesk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalheChamadoActivity extends AppCompatActivity {

    private TextView nomeSelecionadoTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_chamado);
        nomeSelecionadoTextView = (TextView) findViewById(R.id.nomeSelecionadoTextView);
        Intent i = getIntent();
        String selecionado = i.getStringExtra(ListarChamadosActivity.DESCRICAO);

    }
}
