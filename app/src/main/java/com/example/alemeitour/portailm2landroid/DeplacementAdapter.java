package com.example.alemeitour.portailm2landroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alemeitour on 03/04/2018.
 */

public class DeplacementAdapter extends BaseAdapter {
    private List<Deplacement> deplacementList;
    private LayoutInflater inflater;

    public DeplacementAdapter(Context context, List<Deplacement> listD){
        this.inflater = LayoutInflater.from(context);
        this.deplacementList = listD;
    }
    public int getCount() {
        int nombreElement = deplacementList.size();
        return nombreElement;
    }

    @Override
    public Deplacement getItem(int i) {

        return deplacementList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return (i);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        TextView idAdherent;
        TextView dateDeplacement;
        TextView motif;
        TextView villeA;
        TextView villeD;
        TextView cout;
        TextView kiloM;
        TextView fraisHebergement;
        TextView fraisRepas;
        TextView fraisPeage;
        if(convertView ==null){
            convertView = this.inflater.inflate(R.layout.vue_deplacement, parent, false);
            idAdherent = (TextView) convertView.findViewById(R.id.txt_idAdherent);
            dateDeplacement = (TextView) convertView.findViewById(R.id.txt_dateDeplacement);
            motif = (TextView) convertView.findViewById(R.id.txt_motif);
            villeA = (TextView) convertView.findViewById(R.id.txt_villeA);
            villeD = (TextView) convertView.findViewById(R.id.txt_VilleD);
            cout = (TextView) convertView.findViewById(R.id.txt_cout);
            kiloM = (TextView) convertView.findViewById(R.id.txt_kiloM);
            fraisHebergement = (TextView) convertView.findViewById(R.id.txt_fraisHebergement);
            fraisRepas = (TextView) convertView.findViewById(R.id.txt_fraisRepas);
            fraisPeage = (TextView) convertView.findViewById(R.id.txt_fraisPeage);

            convertView.setTag(R.id.txt_idAdherent, idAdherent);
            convertView.setTag(R.id.txt_dateDeplacement, dateDeplacement);
            convertView.setTag(R.id.txt_motif, motif);
            convertView.setTag(R.id.txt_villeA, villeA);
            convertView.setTag(R.id.txt_VilleD, villeD);
            convertView.setTag(R.id.txt_cout, cout);
            convertView.setTag(R.id.txt_kiloM, kiloM);
            convertView.setTag(R.id.txt_fraisHebergement, fraisHebergement);
            convertView.setTag(R.id.txt_fraisRepas, fraisRepas);
            convertView.setTag(R.id.txt_fraisPeage, fraisPeage);

        }else {
            idAdherent = (TextView) convertView.getTag(R.id.txt_idAdherent);
            dateDeplacement = (TextView) convertView.getTag(R.id.txt_dateDeplacement);
            motif = (TextView) convertView.getTag(R.id.txt_motif);
            villeA = (TextView) convertView.getTag(R.id.txt_villeA);
            villeD = (TextView) convertView.getTag(R.id.txt_VilleD);
            cout = (TextView) convertView.getTag(R.id.txt_cout);
            kiloM = (TextView) convertView.getTag(R.id.txt_kiloM);
            fraisHebergement = (TextView) convertView.getTag(R.id.txt_fraisHebergement);
            fraisRepas = (TextView) convertView.getTag(R.id.txt_fraisRepas);
            fraisPeage = (TextView) convertView.getTag(R.id.txt_fraisPeage);

            convertView = this.inflater.inflate(R.layout.vue_deplacement, parent, false);
            idAdherent = (TextView) convertView.findViewById(R.id.txt_idAdherent);
            dateDeplacement = (TextView) convertView.findViewById(R.id.txt_dateDeplacement);
            motif = (TextView) convertView.findViewById(R.id.txt_motif);
            villeA = (TextView) convertView.findViewById(R.id.txt_villeA);
            villeD = (TextView) convertView.findViewById(R.id.txt_VilleD);
            cout = (TextView) convertView.findViewById(R.id.txt_cout);
            kiloM = (TextView) convertView.findViewById(R.id.txt_kiloM);
            fraisHebergement = (TextView) convertView.findViewById(R.id.txt_fraisHebergement);
            fraisRepas = (TextView) convertView.findViewById(R.id.txt_fraisRepas);
            fraisPeage = (TextView) convertView.findViewById(R.id.txt_fraisPeage);


        }
        Deplacement exo = this.getItem(position);
        idAdherent.setText((Integer.toString(exo.getIdAdherent())));
        dateDeplacement.setText(exo.getDateDeplacement());
        motif.setText(exo.getMotif());
        villeA.setText(Integer.toString(exo.getVilleA()));
        villeD.setText(Integer.toString(exo.getVilleD()));
        cout.setText(Integer.toString(exo.getCout()));
        kiloM.setText(Integer.toString(exo.getKiloM()));
        fraisHebergement.setText(Integer.toString(exo.getFraisHebergement()));
        fraisRepas.setText(Integer.toString(exo.getFraisRepas()));
        fraisPeage.setText(Integer.toString(exo.getFraisPeage()));
        return convertView;
    }

}


