package jrosas.miprimerholamundo.com;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GaseosaAdapter extends ArrayAdapter<Gaseosa> {
    Context myContext;
    int myLayoutResourceID;
    Gaseosa myData[] = null;
    private static final String CadLog = "MyLg-Android";

    public GaseosaAdapter(Context context, int layoutResourceID, Gaseosa[] data){
        super(context, layoutResourceID, data);

        this.myContext=context;
        this.myLayoutResourceID=layoutResourceID;
        this.myData=data;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View r = convertView;
        GaseosaHolder holder = null;

        Log.d(CadLog, "entro");
        if (r == null){
            LayoutInflater layoutInflater = ((Activity)myContext).getLayoutInflater();
            r = layoutInflater.inflate(myLayoutResourceID, parent, false);

            holder = new GaseosaHolder(r);
            r.setTag(holder);
        }
        else{
            holder = (GaseosaHolder)r.getTag();
        }

        Gaseosa gaseosa = myData[position];
        holder.imgGas.setImageResource(gaseosa.icon);
        holder.descGas.setText(gaseosa.desc);

        return r;
    }

    static class GaseosaHolder{
        ImageView imgGas;
        TextView descGas;

        GaseosaHolder(View v){
            imgGas = v.findViewById(R.id.imgVwGas);
            descGas = v.findViewById(R.id.txtVwDescGas);

        }
    }

}
