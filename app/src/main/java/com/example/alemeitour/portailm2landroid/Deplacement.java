package com.example.alemeitour.portailm2landroid;

import java.util.ArrayList;

/**
 * Created by alemeitour on 03/04/2018.
 */

public class Deplacement {
    private int _idAdherent;
    private String _dateDeplacement;
    private String _motif;;
    private int _villeA;
    private int _villeD;
    private int _cout;
    private int _kiloM;
    private int _fraisHebergement;
    private int _fraisRepas;
    private int _fraisPeage;

    public Deplacement(int idAdherent, String dateDeplacement, String motif, int villeD, int villeA, int unCout, int kiloM, int fraisHebergement, int fraisRepas, int fraisPeage)
    {
        this._idAdherent = idAdherent;
        this._dateDeplacement = dateDeplacement;
        this._motif = motif;
        this._villeA = villeA;
        this._villeD = villeD;
        this._cout = unCout;
        this._kiloM = kiloM;
        this._fraisHebergement = fraisHebergement;
        this._fraisRepas = fraisRepas;
        this._fraisPeage = fraisPeage;
    }

    //GETTERS-----------------------------------------------------

    public int getIdAdherent()
    {
        return this._idAdherent;
    }

    public String getMotif()
    {
        return this._motif;
    }

    public int getFraisHebergement()
    {
        return this._fraisHebergement;
    }

    public int getFraisRepas()
    {
        return this._fraisRepas;
    }

    public int getFraisPeage()
    {
        return this._fraisPeage;
    }

    public int getKiloM()
    {
        return this._kiloM;
    }

    public String getDateDeplacement()
    {
        return this._dateDeplacement;
    }

    public int getVilleA()
    {
        return this._villeA;
    }

    public int getVilleD()
    {
        return this._villeD;
    }

    public int getCout()
    {
        return this._cout;
    }


//SETTERS-------------------------------------------------------------


    public void set_idAdherent(int _idAdherent) {
        this._idAdherent = _idAdherent;
    }

    public void set_dateDeplacement(String _dateDeplacement) {
        this._dateDeplacement = _dateDeplacement;
    }

    public void set_motif(String _motif) {
        this._motif = _motif;
    }

    public void set_villeA(int _villeA) {
        this._villeA = _villeA;
    }

    public void set_villeD(int _villeD) {
        this._villeD = _villeD;
    }

    public void set_cout(int _cout) {
        this._cout = _cout;
    }

    public void set_kiloM(int _kiloM) {
        this._kiloM = _kiloM;
    }

    public void set_fraisHebergement(int _fraisHebergement) {
        this._fraisHebergement = _fraisHebergement;
    }

    public void set_fraisRepas(int _fraisRepas) {
        this._fraisRepas = _fraisRepas;
    }

    public void set_fraisPeage(int _fraisPeage) {
        this._fraisPeage = _fraisPeage;
    }

    //ArrayListDeplacement
    public static ArrayList<Deplacement> lesDeplacements = new ArrayList<>();

    public static void setLesDeplacements(ArrayList<Deplacement> lesDeplacements){
        Deplacement.lesDeplacements = lesDeplacements;
    }
}


