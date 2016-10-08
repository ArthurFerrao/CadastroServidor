package com.example.ferro.cadastroservidor.Listeners;

import android.view.View;
import android.widget.Toast;

import com.example.ferro.cadastroservidor.Activity.CadastroActivity;
import com.example.ferro.cadastroservidor.AsyncTask.CadastroAsy;
import com.example.ferro.cadastroservidor.Pessoa;

import java.util.concurrent.ExecutionException;

/**
 * Created by Ferrão on 08/10/2016.
 */
public class onClickEnviar implements View.OnClickListener {
    CadastroActivity cadastroActivity;

    public onClickEnviar(CadastroActivity cadastroActivity){
        this.cadastroActivity = cadastroActivity;
    }


    @Override
    public void onClick(View v) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(cadastroActivity.getNome().getText().toString());
        pessoa.setEndereco(cadastroActivity.getEndereco().getText().toString());
        pessoa.setEmail(cadastroActivity.getEmail().getText().toString());
        pessoa.setCpf(cadastroActivity.getCpf().getText().toString());

        CadastroAsy cadastrar = new CadastroAsy();

        try {

            String message = cadastrar.execute(pessoa).get();

            Toast toast = Toast.makeText(this.cadastroActivity,message,Toast.LENGTH_SHORT);
            toast.show();

            cadastroActivity.getNome().setText("");
            cadastroActivity.getEndereco().setText("");
            cadastroActivity.getEmail().setText("");
            cadastroActivity.getCpf().setText("");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
