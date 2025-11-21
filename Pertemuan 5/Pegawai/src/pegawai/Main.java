/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;

/**
 *
 * @author salma
 */
public class Main {
    public static void main(String[] args) {

        Direktur d = new Direktur();

        // Method dari Pegawai
        d.kerja();
        
        // Method dari Manajer
        d.aturTim();
        
        // Method dari Direktur
        d.buatKeputusan();
    }
}
