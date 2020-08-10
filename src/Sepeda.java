/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class Sepeda {
    private int jumlah;
    private String warna;
    
public Sepeda (int jumlah, String warna){
    this.jumlah = jumlah;
    this.warna = warna;
    System.out.println("Inisialisasi Atribut");
}

void melaju (){
    System.out.println("Sepeda melaju cepat");
}
void berjalan (){
    System.out.println("Sepeda berjalan dengan sangat lambat");
}
void tampilData(){
    System.out.println("jumlah:"+this.jumlah);
    System.out.println("warna:"+this.warna);
}
    
}
