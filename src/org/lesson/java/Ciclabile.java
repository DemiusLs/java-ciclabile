package org.lesson.java;

import java.util.Random;

public class Ciclabile {

    private int CAPACITA = 10;
    private int[] arrayInteri= new int[CAPACITA] ;
    int cicloCount = 0;

    public Ciclabile(){
        generateIntArray();
    }

    public Ciclabile(int CAPACITA){
        this.CAPACITA = CAPACITA;
        generateIntArray();
    }

    public Ciclabile(int[] arrayInteri , int CAPACITA){
        this.arrayInteri = arrayInteri;
        this.CAPACITA = CAPACITA;
    }

    
    public Integer getElementoSuccessivo(){
        if(cicloCount < arrayInteri.length){
            int element = arrayInteri[cicloCount];
            cicloCount++;        
            return element;
        }else{ 
            System.out.println("Elementi terminati, resetta il ciclo");
            return null;
        }        
    }

    public boolean hasAncoraElementi(){
        if(cicloCount < arrayInteri.length){
            System.out.println("Ci sono ancora " + (arrayInteri.length - cicloCount ) + "elementi");
            return true;
        }else{
            System.out.println("Ci sono ancora " + (arrayInteri.length - cicloCount ) + "elementi");
            return false;
        }
    }  

    public void resetCount(){
        this.cicloCount = 0;
    }

    public void generateIntArray(){
        Random rand = new Random();
        System.out.println("Generazione nuovo array");
        String outString = "";
        for(int i=0 ; i< arrayInteri.length ; i++){
            arrayInteri[i] = rand.nextInt(999);
            outString += arrayInteri[i] + " ";
        }  
        System.out.println(outString);

    }
    // public int getArrayLength(){
    //     return this.arrayInteri.length;
    // }
    public void cicla(int indice){
        
        if(indice >0 && indice <= arrayInteri.length){
            for(int i = 0; i < indice   ; i++){
            System.out.println(getElementoSuccessivo());
        }
        }else{
            System.out.println("Indice non corretto");
        }
        
    } 
    
    public void getIntAtIndex(int indice){
        
        if(indice >0 && indice <= arrayInteri.length){        
            System.out.println("Numero: "+ arrayInteri[indice] + " all'indice: " + indice );
        }else{
            System.out.println("Indice non corretto");
        }       
        
        }
    


    public static void main(String[] args) { 
            
        Ciclabile ciclabile = new Ciclabile();        
        ciclabile.cicla(10);
        ciclabile.getIntAtIndex(3);
        
    }
}
