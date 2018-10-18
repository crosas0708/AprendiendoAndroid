package jrosas.miprimerholamundo.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainFragmActivity extends AppCompatActivity implements EnviarDato{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainfragm);
    }

    @Override
    public void enviarDatos(String meensaje) {

    }

}
