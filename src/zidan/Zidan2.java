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
public class Zidan2 {
    
    public static void main (String [] args){
        
        
        Zidan bmi = new Zidan();

        bmi.setTinggi(175);
        bmi.setBerat(45);
        int hasil = (int) (bmi.getStunting());
        
        
        
        //OPERASI//
        System.out.println("====BMI====");
        System.out.println("Tinggi = " + bmi.getTinggi());
        System.out.println("Berat = " + bmi.getBerat());
        System.out.println("Hasil = " + Math.round(bmi.getStunting()));
        
        System.out.println("=====SARAN=====");
        
        if(hasil==0){
            System.out.println("Anda belum meng-input hasil data stunting anda");
        }else if(hasil<=15){
            System.out.println("anda berada dalam kategori kekurangan berat badan"
                    + " hubungi dokter lebih lanjut mengenai pola makan dan gizi yang baik untuk meningkatkan kesehatan");
        }else if(hasil<=19){
            System.out.println("anda berada dalam kategori normal, Tetap pertahankan "
                    + "berat badan anda dan jaga berat badan anda dengan mengatur keseimbangan"
                    + " antara pola makan dan aktivitas anda");
        }else if(hasil<=26){
            System.out.println("anda berada dalam kategori overweight atau berat badan berlebih"
                    + " cara terbaik untuk menurunkan berat badan adalah dengan menjaga pola makan "
                    + "dan berolah raga");
        }else{
            System.out.println("anda berada pada kategori obesitas, usahakan untuk menurunkan"
                    + " berat badan");
        }
        
        
    }
    
}
