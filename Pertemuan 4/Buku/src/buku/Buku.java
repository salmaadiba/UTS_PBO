/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buku;

/**
 *
 * @author salma
 */

// Nama : Salma Adiba Chasani
// NIM  : 32602400123
class Buku {
    private String judul;
    private String penulis;
    private int tahun;

    public Buku() {
        this.judul = "Belum ada judul";
        this.penulis = "Tidak diketahui";
        this.tahun = 0;
    }

    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    public Buku(Buku other) {
        this.judul = other.judul;
        this.penulis = other.penulis;
        this.tahun = other.tahun;
    }

    public void tampilkan() {
        System.out.println("Judul   : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Tahun   : " + tahun);
    }
}
