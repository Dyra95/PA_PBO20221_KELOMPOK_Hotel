package com.mycompany.uas_pbo;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dion Defindra
 */
public class PemesananHotel {
    public static void main (String[] args){
    FormRegister FR = new FormRegister();
            FR.setVisible(true);
            FR.pack();
            FR.setLocationRelativeTo(null);
            FR.setDefaultCloseOperation(FormRegister.EXIT_ON_CLOSE);
    }
    double jenis;
    int lama;
    int tarif;
    int bayar;
    int uang;
    int kembalian;
    int index;
    double Rincian;
    String nama;
    String cari;
    int x = 0;
    int baris = 0;
   
   
    static Object kolom[] = {"Nama", "Jenis Kamar", "No Kamar", "Lama Menginap"};
    
    DefaultTableModel model = new DefaultTableModel(kolom, baris);

    public double getJenis() {
        return jenis;
    }

    public void setJenis(double jenis) {
        this.jenis = jenis;
    }

    public double getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public double getBayar() {
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public double getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public double getKembalian() {
        return kembalian;
    }

    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    public double getRincian() {
        return Rincian;
    }

    public void setRincian(double Rincian) {
        this.Rincian = Rincian;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getCari() {
        return cari;
    }

    public void setCari(String cari) {
        this.cari = cari;
    }
    

}
