package jrosas.miprimerholamundo.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewPersActivity extends AppCompatActivity {
    ListView lstVwPers;
    /*Source1: https://youtu.be/_YF6ocdPaBg*/
    String[] gaseosas = {"Cola cola", "Inka kola", "Fanta", "Sprite"};
    Integer[] imgIds = {R.drawable.coca, R.drawable.inca, R.drawable.fanta, R.drawable.sprite};


    /*Source2: https://youtu.be/SykVIlNQ4K0*/
    Gaseosa listgaseosas[] = new Gaseosa[]{
            new Gaseosa(R.drawable.coca, "Coca Cola x"),
            new Gaseosa(R.drawable.inca, "Inka Cola x"),
            new Gaseosa(R.drawable.fanta, "Fanta y"),
            new Gaseosa(R.drawable.sprite, "Sprite z")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewpers);

        lstVwPers = findViewById(R.id.lstVwPers1);

        /*
        //Source 1
        listviewpers_item1 customListView = new listviewpers_item1(this, gaseosas, imgIds);
        lstVwPers.setAdapter(customListView);
        */

        //Source 2
        GaseosaAdapter gaseosaAdapter = new GaseosaAdapter(this, R.layout.listviewpers_item1, listgaseosas);
        lstVwPers.setAdapter(gaseosaAdapter);
        lstVwPers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v = view.findViewById(R.id.txtVwDescGas);
                Toast.makeText(getApplicationContext(), v.getText(), Toast.LENGTH_SHORT). show();
            }
        });

    }
}
