package com.example.ferro.cadastroservidor.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ferro.cadastroservidor.AsyncTask.ListarAsy;
import com.example.ferro.cadastroservidor.Pessoa;
import com.example.ferro.cadastroservidor.R;

import java.util.concurrent.ExecutionException;

public class ListarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        ListView list = (ListView) findViewById(R.id.list);
        ListarAsy listPessoa = new ListarAsy();

        try {

            ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this, android.R.layout.simple_list_item_1, listPessoa.execute("http://ladoss.info:8773/Convite_SERVICE/convidado/listar").get());
            list.setAdapter(adapter);

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
