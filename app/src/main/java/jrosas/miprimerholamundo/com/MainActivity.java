package jrosas.miprimerholamundo.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton, boton2, btmScrollVw, btnLstVw, btnLstVwPers, btnMainFrag;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.button);
        boton.setOnClickListener(this);

        boton2 = findViewById(R.id.button2);
        boton2.setOnClickListener(this);

        editText = findViewById(R.id.editText);

        btmScrollVw = findViewById(R.id.btnScrollView);
        btmScrollVw.setOnClickListener(this);

        btnLstVw = findViewById(R.id.btnListView);
        btnLstVw.setOnClickListener(this);

        btnLstVwPers = findViewById(R.id.btnLstVwPers);
        btnLstVwPers.setOnClickListener(this);

        btnMainFrag = findViewById(R.id.btnMainFragm);
        btnMainFrag.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()){
            case R.id.button:
                intent = new Intent(this, Ejm2Activity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(this, Ejm3Activity.class);
                String dato = editText.getText().toString();
                intent.putExtra("param1", dato);
                startActivity(intent);
                break;
            case R.id.btnScrollView:
                intent = new Intent(this, MainScrollActivity.class);
                startActivity(intent);
                break;
            case R.id.btnListView:
                intent = new Intent(this, ListViewActivity.class);
                startActivity(intent);
                break;
            case R.id.btnLstVwPers:
                intent = new Intent(this, ListViewPersActivity.class);
                startActivity(intent);
                break;
            case R.id.btnMainFragm:
                intent = new Intent(this, MainFragmActivity.class);
                startActivity(intent);
                break;
        }
    }
}
