package com.example.ferro.cadastroservidor.Listeners;

import android.content.Intent;
import android.view.View;

import com.example.ferro.cadastroservidor.Activity.Cadastro;
import com.example.ferro.cadastroservidor.Activity.Listar;
import com.example.ferro.cadastroservidor.Activity.MainActivity;
import com.example.ferro.cadastroservidor.R;

/**
 * Created by Ferrão on 07/10/2016.
 */
public class onClickVoltar implements View.OnClickListener{
    Cadastro cad;
    Listar list;
    public onClickVoltar(Listar lista) {
        list = lista;
    }
    public onClickVoltar(Cadastro cadastro) {
        cad = cadastro;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btVoltar:
                Intent intent = new Intent(this.cad,MainActivity.class);
                cad.startActivity(intent);
                break;
            case R.id.btVoltarList:
                Intent intent2 = new Intent(this.list,MainActivity.class);
                list.startActivity(intent2);
                break;
        }
    }
}
