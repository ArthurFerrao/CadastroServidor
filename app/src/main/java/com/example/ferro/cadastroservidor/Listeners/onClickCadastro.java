package com.example.ferro.cadastroservidor.Listeners;

import android.content.Intent;
import android.view.View;

import com.example.ferro.cadastroservidor.Activity.Cadastro;
import com.example.ferro.cadastroservidor.Activity.MainActivity;

/**
 * Created by Ferrão on 07/10/2016.
 */
public class onClickCadastro implements View.OnClickListener {
    MainActivity main;
    public onClickCadastro(MainActivity mainActivity) {
        this.main = mainActivity;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this.main, Cadastro.class);
        main.startActivity(intent);
    }
}
