package com.example.ferro.cadastroservidor.Activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.ferro.cadastroservidor.Listeners.onClickCadastro;
import com.example.ferro.cadastroservidor.Listeners.onClickListar;
import com.example.ferro.cadastroservidor.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btCadastro= (Button) findViewById(R.id.btCadastro);
        Button btListar= (Button) findViewById(R.id.btListar);

        btCadastro.setOnClickListener(new onClickCadastro(this));
        btListar.setOnClickListener(new onClickListar(this));
    }
}
