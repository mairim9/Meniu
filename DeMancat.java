/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miriam
 */
public class DeMancat extends Alimente{
    private int calorii;
    public DeMancat(String nume, int pret, int calorii){
        super(nume,pret);
        this.calorii=calorii;
    }
    public int getCalorii(){
        return this.calorii;
    }
    
}
