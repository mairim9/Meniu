/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miriam
 */
public class Alimente {
    private String denumire;
    private int pret;
    public Alimente(String nume, int pret){
        this.denumire=nume;
        this.pret=pret;
    }
    public String getDenumire(){
        return this.denumire;
    }
    public int getPret(){
        return this.pret;
    }
    public String toString(){
        return denumire+", "+pret+" RON";
    }
}
