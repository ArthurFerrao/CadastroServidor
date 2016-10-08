package com.example.ferro.cadastroservidor.AsyncTask;

import android.os.AsyncTask;
import android.util.Log;

import com.example.ferro.cadastroservidor.Pessoa;

import com.google.gson.Gson;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Ferrão on 08/10/2016.
 */
public class CadastroAsy extends AsyncTask<Pessoa, Void, String> {
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(Pessoa... pessoas) {

        String resp = "";

        try {
            Gson gson = new Gson();
            String pessoaJson = gson.toJson(pessoas[0]);

            URL url = new URL("http://ladoss.info:8773/Convite_SERVICE/convidado/cadastrar");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty("Content-Type", "application/json");
            urlConnection.connect();

            DataOutputStream wr = new DataOutputStream(
                    urlConnection.getOutputStream());

            wr.writeBytes(pessoaJson);
            wr.close();

            Log.i("ExampleAsyncTaskJson","Resposta: "+urlConnection.getResponseCode());


            if(urlConnection.getResponseCode() == 200){
                resp= "Usuário cadastrado com sucesso";
            }else{
                resp = "Algo errado aconteceu!";
            }

            urlConnection.disconnect();


        } catch (IOException e) {

            Log.e("Erro ", e.getMessage());
        }

        return resp;
    }

    @Override
    protected void onPostExecute(String result){
        super.onPostExecute(result);
    }
}
