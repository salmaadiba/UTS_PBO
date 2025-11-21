/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;
import java.util.Scanner;
/**
 *
 * @author salma
 */

// Nama : Salma Adiba Chasani 
// NIM  : 32602400123
public class Mahasiswa {

    private String nama;
    private String nim;

    // Getter & Setter Nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter & Setter NIM dengan validasi
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (nim != null && nim.matches("\\d{10}")) {
            this.nim = nim;
        } else {
            throw new IllegalArgumentException("NIM harus 10 digit angka!");
        }
    }

    // untuk mengisi data mahasiswa
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa m = new Mahasiswa();

        System.out.print("Masukkan Nama: ");
        m.setNama(input.nextLine());

        boolean validNim = false;
        while (!validNim) {
            try {
                System.out.print("Masukkan NIM (10 digit): ");
                m.setNim(input.nextLine());
                validNim = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama: " + m.getNama());
        System.out.println("NIM : " + m.getNim());
    }
    
}
