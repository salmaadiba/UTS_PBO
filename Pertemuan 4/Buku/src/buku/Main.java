/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

/**
 *
 * @author salma
 */
public class Main {
    public static void main(String[] args) {

        Buku b1 = new Buku();
        System.out.println("Objek b1 (default):");
        b1.tampilkan();
        System.out.println();

        Buku b2 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        System.out.println("Objek b2 (parameterized):");
        b2.tampilkan();
        System.out.println();

        Buku b3 = new Buku(b2);
        System.out.println("Objek b3 (copy dari b2):");
        b3.tampilkan();
    }
}

