package jrosas.miprimerholamundo.com;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class listviewpers_item1 extends ArrayAdapter<String> {
    private String[] gaseosas;
    private Integer[] imgIds;
    private Activity context;

    public listviewpers_item1(Activity context, String[] gaseosas, Integer[] imgIds) {
        super(context, R.layout.listviewpers_item1, gaseosas);

        this.context = context;
        this.gaseosas= gaseosas;
        this.imgIds=imgIds;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;

        if (r==null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.listviewpers_item1, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder)r.getTag();
        }

        viewHolder.imgGas.setImageResource(imgIds[position]);
        viewHolder.descGas.setText(gaseosas[position]);

        return r;
    }

    class ViewHolder{
        ImageView imgGas;
        TextView descGas;
        ViewHolder(View v){
            imgGas = v.findViewById(R.id.imgVwGas);
            descGas = v.findViewById(R.id.txtVwDescGas);

        }
    }

}
