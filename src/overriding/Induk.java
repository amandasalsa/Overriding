/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author Amanda
 */
public class Induk {
    
            double luas, alas, tinggi;
    public void luas(){
        System.out.println("=====MENGHITUNG LUAS SEGITIGA======");
        System.out.println("Rumus luas segitiga : 0.5 * a * t ");
        
        alas = 8;
        tinggi = 10;
        luas = 0.5 * alas * tinggi;
    }
    public  void hitung(){
        System.out.println("Luas = "+luas);
        
        }
        
} 
    
    

