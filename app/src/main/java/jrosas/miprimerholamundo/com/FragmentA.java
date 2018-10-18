package jrosas.miprimerholamundo.com;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentA extends Fragment {

    View rootView;
    Button btn;
    EditText editText;
    EnviarDato intfcEM;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmenta, container, false);

        editText = rootView.findViewById(R.id.inputA);

        btn = rootView.findViewById(R.id.btnEnviar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato = editText.getText().toString();
                intfcEM.enviarDatos(dato);
            }
        });

        return rootView;
    }



}
