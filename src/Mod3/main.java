/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod3;


/**
 *
 * @author ASUS RYZEN
 */
public class main {

    public static void main(String[] args) {
        Auth a = new Auth();
        String status = "";
        String nama = "";
        
        a.dataAkun();
        a.tambahData(status, nama);
        a.gantiData(status, nama);
        a.hapusData(status, nama);
        
        a.cekData(status, nama);
//        a.dataMasuk();
        
        
        a.Tampil();
        
        
        
        
    }
}
