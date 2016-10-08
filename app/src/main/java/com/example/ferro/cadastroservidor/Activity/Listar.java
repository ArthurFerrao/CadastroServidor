package com.example.ferro.cadastroservidor.Activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.ferro.cadastroservidor.Listeners.onClickVoltar;
import com.example.ferro.cadastroservidor.R;

public class Listar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        Button btVoltar = (Button) findViewById(R.id.btVoltarList);

        btVoltar.setOnClickListener(new onClickVoltar(this));
    }
}
