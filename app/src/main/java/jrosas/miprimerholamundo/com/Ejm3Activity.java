package jrosas.miprimerholamundo.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ejm3Activity extends AppCompatActivity {
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejm3);

        txtView = findViewById(R.id.textView2);

        Intent intent=getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            String cadena = (String) bundle.get("param1");
            txtView.setText(cadena);
        }
    }

}
