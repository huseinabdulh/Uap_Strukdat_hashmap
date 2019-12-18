/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ASUS RYZEN
 */
public class Auth {

    Scanner input = new Scanner(System.in);
    HashMap<String, String> identitas = new HashMap<String, String>();

    public String dataAkun() {
        identitas.put("Anak", "Husein Abdul Hamid");
        identitas.put("Ibu", "Siti choiriyah");
        identitas.put("Ayah", "Bambang Setiawan");
        return toString();
    }

    public String tambahData(String status, String nama) {
        System.out.println("==================Tambah data================");
        System.out.println("Masukkan Status keluarga :");
        status = input.nextLine();
        System.out.println("Masukkan nama keluarga :");
        nama = input.next();

        identitas.put(status, nama);
        return toString();
    }

    public String gantiData(String status, String nama) {
        System.out.println("==================Replace================");
        System.out.println("Masukkan identitas keluarga :");
        status = input.next();
        identitas.replace(status, "Andin");
        return toString();
    }

    public String hapusData(String status, String nama) {
        System.out.println("==================Hapus data keluarga================");
        System.out.println("Masukkan status keluarga :");
        status = input.next();

        identitas.remove(status);//jika menghapus status keluarga
        System.out.println("Data berhasil dihapus");
        return toString();
    }

    public String cekData(String status, String nama) {
        System.out.println("==================Cari data================");
        System.out.println("Masukkan Status keluarga yang ingin dicari =");
        status = input.next();
        if (identitas.containsKey(status) == true) {
            System.out.println("Identitas ditemukan=" + identitas.get(status));
        } else{
            System.out.println("Maaf salah");
        }
//        identitas.get(status);
        return toString();
    }

    public void Tampil() {
        System.out.println("=======Data Terbaru===========");
        for (Map.Entry map : identitas.entrySet()) {
            System.out.println(map.getKey() + "=" + map.getValue());
        }
    }

    public void dataMasuk() {
        System.out.println("==================Jumlah data================");
        identitas.size();

    }

}
