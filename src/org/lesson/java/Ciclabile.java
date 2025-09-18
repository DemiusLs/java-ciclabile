package org.lesson.java;

import java.util.Random;

public class Ciclabile {

    private int size = 10;
    private int[] arrayInteri= new int[size] ;
    int indiceCorrente = 0;

    public Ciclabile(){
        generateIntArray();
    }

    public Ciclabile(int size){
        this.size = size;
        generateIntArray();
    }

    public Ciclabile(int[] arrayInteri ){
        this.arrayInteri = arrayInteri;
        this.size = arrayInteri.length;
    }

    
    public Integer getElementoSuccessivo(){
        if(indiceCorrente < arrayInteri.length){
            int element = arrayInteri[indiceCorrente];
            indiceCorrente++;        
            return element;
        }else{ 
            System.out.println("Elementi terminati, resetta il ciclo");
            return null;
        }        
    }

    public boolean hasAncoraElementi(){
        return indiceCorrente < arrayInteri.length;
    }  

    public void resetCount(){
        this.indiceCorrente = 0;
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
        resetCount();
        if(indice >0 && indice <= arrayInteri.length){
            for(int i = 0; i < indice ; i++){
            System.out.println(getElementoSuccessivo());
        }
        }else{
            System.out.println("Indice non corretto");
        }
        
    } 
    
    public void getIntAtIndex(int indice){
        
        if(indice >= 0 && indice <= arrayInteri.length){        
            System.out.println("Numero: "+ arrayInteri[indice] + " all'indice: " + indice );
        }else{
            System.out.println("Indice non corretto");
        }     
    }
    
    public void addElemento(int number){
        this.size ++;
        int[] newArrayInteri = new int[arrayInteri.length + 1];
        for(int i = 0 ; i < arrayInteri.length ; i++){
            newArrayInteri[i] = arrayInteri[i];
        }
        newArrayInteri[newArrayInteri.length -1 ] = number;
        this.arrayInteri = newArrayInteri;
    }
    public int getLastIndex(){
        return this.arrayInteri.length ;
    }


    public static void main(String[] args) { 
            
        Ciclabile ciclabile = new Ciclabile();
        System.out.println("Stampo array : ");        
        ciclabile.cicla(ciclabile.arrayInteri.length);  
        ciclabile.addElemento(33);
        System.out.println("Stampo array : "); 
        ciclabile.cicla(ciclabile.arrayInteri.length); 
        ciclabile.getIntAtIndex(3);
        
    }
}
