/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ASUS RYZEN
 */
public class main {

    public static void main(String[] args) {
        HashMap<String, String> identitas = new HashMap<String, String>();
        //string 1 key,string 2 value
        //method put untuk nambah
        identitas.put("Husein", "pelajar");
        identitas.put("Tiara", "janda");
        identitas.put("Melon", "Duda");
        identitas.put("ulfa", "jomblo");
        System.out.println("Identitas =" + identitas);
        
        //memanggil data sesaui key
        System.out.println("Identitas tiara =" + identitas.get("Tiara"));
        System.out.println("Identitas Melon =" + identitas.get("Melon"));
        
        
        //cara nambahkan hashmap ke kategori identitas :
        identitas.put("Rahayu", "Sayang husein");
        System.out.println("Setelah ditambahan :"+identitas);
        
        //hapus berdasarkan key
        identitas.remove("Melon");
        System.out.println("Identitas setelah dihapus :"+identitas);
        
        //method replace
        identitas.replace("ulfa", "Jomblo seumur hidup");
        System.out.println("Identitas ="+identitas);
        
        //nyari value berdasarkan key
        
        System.out.println("Data duda = "+identitas.containsValue("Husein"));
        //cara menampilkan semua data dari key dan value
        System.out.println("====================================");
        System.out.println("        DATA IDENTITAS DIRI         ");
        for(Map.Entry map : identitas.entrySet()){
            System.out.println(map.getKey()+"="+map.getValue());
        }
        //mengtahui jumlah data
        System.out.println("Jumlah identitas ="+identitas.size());
        //hapus seluruhnya
        identitas.clear();
        System.out.println("Identitas ="+identitas);

    }
}
