/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class Utama {
    public static void main(String[] args){
        
        int jumlah = 3;
        String warna = "Biru";
        
        Sepeda sepeda = new Sepeda(jumlah,warna);
        sepeda.melaju();
        sepeda.berjalan();
        sepeda.tampilData();
        
    }
    
}
