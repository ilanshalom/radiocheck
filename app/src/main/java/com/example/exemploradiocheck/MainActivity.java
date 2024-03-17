package com.example.exemploradiocheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cadastrar(View v) {
        String strSexo = "";
        
        int sexo = ((RadioGroup)findViewById(R.id.idGrupoSexo)).getCheckedRadioButtonId();
        if(sexo == R.id.idFeminino) {
            strSexo = "Sexo feminino";
        }
        if(sexo == R.id.idMasculino) {
            strSexo = "Sexo masculino";
        }
        if(sexo == R.id.idOutro) {
            strSexo = "Outro sexo";
        }

        boolean receberEmail = ((CheckBox)findViewById(R.id.idEmails)).isChecked();
        if(receberEmail) {  // ou    if(receberEmail == true) {
            strSexo += " -> deseja receber e-mails";
        }
        else{
            strSexo += " -> não deseja receber e-mails";
        }

        if(receberEmail == true) {
            Snackbar.make(v, "Que bom que vc aceitará e-mails!", Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }

        Toast.makeText(v.getContext(), strSexo, Toast.LENGTH_LONG).show();
    }
}