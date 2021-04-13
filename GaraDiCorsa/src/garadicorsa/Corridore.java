/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garadicorsa;

import java.util.ArrayList;

/**
 *
 * @author Bucci
 */
public class Corridore extends Thread{
    public static ArrayList<String> classifica = new ArrayList<>();
    private static int metriDaPercorrere = 100;
    public Corridore(String name) 
    {
        super(name);
    }
    
    @Override
    public void run() 
    {
        for(int i = 0; i < metriDaPercorrere; i++)
        {
            System.out.println("Metro numero: " + i + " del corridore: " + super.getName());
        }
        
        aggiungiElementoClassifica(super.getName());
    }
    
    public static synchronized void aggiungiElementoClassifica(String name)
    {
       System.out.println("--------------------------- Metri percorsi: " + metriDaPercorrere + " dal corridore: " + name);
       classifica.add(name + " ARRIVATO");
    }
    
    public static void stampaClassifica(){
    	for(int i = 0; i < classifica.size(); i++){
            System.out.println("n." + (i+1) + " " + classifica.get(i));
        }
    }
}
