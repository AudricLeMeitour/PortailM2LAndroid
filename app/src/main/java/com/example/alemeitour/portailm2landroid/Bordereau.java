package com.example.alemeitour.portailm2landroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Bordereau extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bordereau);
        Importation DeplacementImport = new Importation();
        DeplacementImport.execute("http://10.0.2.2:3001/android");
        ListView listeD = (ListView) findViewById(R.id.ListDeDeplacement);

        try {
            ArrayList<Deplacement> listDeplacementImportee = DeplacementImport.get();
            if (listDeplacementImportee != null) {
                DeplacementAdapter adapter = new DeplacementAdapter(getApplicationContext(), listDeplacementImportee);
                listeD.setAdapter(adapter);

            }
        }
        catch (ExecutionException e) {
            Log.i("Parseur", "Interruption lecture fichier" + e.getMessage());
        }
        catch (InterruptedException e) {
            Log.i("Parseur", "Erreur execution"+ e.getMessage());
        }

    }
}
