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
public class Main {
    public static void main(String[] args) {
        
        Induk induk = new Induk();
        Segitiga1 alas = new Segitiga1();
        Segitiga2 tinggi = new Segitiga2();
        Induk luas = new Segitiga1();
        Induk luas1 = new Segitiga2();
        
        induk.luas();
        alas.luas();
        tinggi.luas();
        induk.hitung();
        
        

    }
    
}
