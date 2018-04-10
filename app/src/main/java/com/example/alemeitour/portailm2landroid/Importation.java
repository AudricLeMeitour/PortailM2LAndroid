package com.example.alemeitour.portailm2landroid;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Created by alemeitour on 03/04/2018.
 */

class Importation extends AsyncTask<String,Void,ArrayList<Deplacement>> {

    protected ArrayList<Deplacement> doInBackground(String... urls){
        URL url;
        String ligne;
        try
        {
            ArrayList<Deplacement> listDeplacementImportee;
            url = new URL(String.valueOf(urls[0]));
            InputStream is = url.openConnection().getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader buff = new BufferedReader(isr);
            ligne = buff.readLine();
            ligne = ligne.replace("<p>","");
            ligne = ligne.replace("</p>","");
            Gson gson=new Gson();
            listDeplacementImportee = gson.fromJson(ligne,
                    new TypeToken<ArrayList<Deplacement>>(){}.getType());
            if (listDeplacementImportee != null) {
                return listDeplacementImportee;
            }
            else
                return null;
        }
        catch (MalformedURLException e)
        {
            Log.i("Parseur", "URL incorrecte "+e.getMessage());
            return null;
        } catch (IOException e) {
            Log.i("Parseur", "Problème I/O " + e.getMessage());
            return null;
        }
    }

}

