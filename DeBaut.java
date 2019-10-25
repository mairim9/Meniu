/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miriam
 */
public class DeBaut extends Alimente {
    private int volum;
    public DeBaut(String nume, int pret, int volum){
        super(nume,pret);
        this.volum=volum;
    }
    public int getVolum(){
        return this.volum;
    }
    
}
