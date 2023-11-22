/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zidan;

/**
 *
 * @author HP
 */
public class Zidan {

    //pertambahan

    double Tinggi;
    void setTinggi(int Penjumlahan1){
        Tinggi = Tinggi + Penjumlahan1;
    }
    
    double getTinggi(){
        return Tinggi/100;
    }
    
     int Berat;
    void setBerat(int Penjumlahan1){
        Berat = Berat + Penjumlahan1;
    }
    
    int getBerat(){
        return Berat;
    }
    
    double getStunting(){
        return Berat /(Tinggi/100 * Tinggi/100);
    }
    
    
    
}
