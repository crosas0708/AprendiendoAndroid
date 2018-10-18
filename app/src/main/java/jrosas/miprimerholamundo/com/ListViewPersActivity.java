package jrosas.miprimerholamundo.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewPersActivity extends AppCompatActivity {
    ListView lstVwPers;
    String[] gaseosas = {"Cola cola", "Inka kola", "Fanta", "Sprite"};
    Integer[] imgIds = {R.drawable.coca, R.drawable.inca, R.drawable.fanta, R.drawable.sprite};

    /*Source: https://www.youtube.com/watch?v=_YF6ocdPaBg*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewpers);


        lstVwPers = findViewById(R.id.lstVwPers1);
        listviewpers_item1 customListView = new listviewpers_item1(this, gaseosas, imgIds);
        lstVwPers.setAdapter(customListView);
    }
}
