package org.lesson.java;

import java.util.ArrayList;

public class Ciclabile {

    private int[] arrayInteri= new int[] {2, 3 ,6, 7, 8, 12,44,35};
    int cicloCount = 0;

    public Ciclabile(){

    }

    public Ciclabile(int[] arrayInteri ){
        this.arrayInteri = arrayInteri;
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
            return false;
        }
    }  

    public void resetCount(){
        this.cicloCount = 0;
    }



    


    public static void main(String[] args) { 
            
        Ciclabile ciclabile = new Ciclabile();

        
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.getElementoSuccessivo());
        
    }


    
}
