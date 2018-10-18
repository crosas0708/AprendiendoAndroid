package jrosas.miprimerholamundo.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {
    ListView lstView ;
    String[] gaseosas = {"Cola cola", "Inka kola", "Fanta", "Sprite"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        lstView = findViewById(R.id.lstVwGaseosas);
        /*Typos de Adaptater's: BaseAdapter, ArrayAdapter, ListAdapter*/
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, gaseosas);

        lstView.setAdapter(adapter);
        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
