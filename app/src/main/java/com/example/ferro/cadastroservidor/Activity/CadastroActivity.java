package com.example.ferro.cadastroservidor.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.ferro.cadastroservidor.Pessoa;
import com.example.ferro.cadastroservidor.Listeners.onClickEnviar;
import com.example.ferro.cadastroservidor.R;

/**
 * Created by Ferrão on 08/10/2016.
 */
public class CadastroActivity extends Activity {

    EditText nome;
    EditText end;
    EditText email;
    EditText cpf ;
    Button enviar;

    private Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = (EditText) findViewById(R.id.etNome);
        end = (EditText) findViewById(R.id.etEndereco);
        email = (EditText) findViewById(R.id.etEmail);
        cpf = (EditText) findViewById(R.id.etCpf);
        enviar = (Button) findViewById(R.id.btEnviar);

        enviar.setOnClickListener(new onClickEnviar(this));
    }

    public Pessoa getPessoa(){
        pessoa = new Pessoa(nome.getText().toString(),email.getText().toString(),end.getText().toString(),cpf.getText().toString());
        return this.pessoa;
    }

    public void setPessoa(Pessoa p){
        this.pessoa = p;
    }
    public EditText getNome() {
        return nome;
    }

    public void setNome(EditText nome) {
        this.nome = nome;
    }

    public EditText getEndereco() {
        return end;
    }

    public void setEndereco(EditText endereco) {
        this.end = endereco;
    }

    public EditText getCpf() {
        return cpf;
    }

    public void setCpf(EditText Cpf) {
        this.cpf = Cpf;
    }

    public EditText getEmail() {
        return email;
    }

    public void setEmail(EditText Email) {
        this.email = Email;
    }

    public Button getEnviar() {
        return enviar;
    }

    public void setEnviar(Button enviar) {
        this.enviar = enviar;
    }



}
