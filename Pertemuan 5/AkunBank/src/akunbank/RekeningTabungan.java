/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akunbank;

/**
 *
 * @author salma
 */
   
public class RekeningTabungan extends AkunBank {

    public void setor(double jml) {
        tambahSaldo(jml); // bisa, karena method protected
        System.out.println("Berhasil setor " + jml);
    }

    public void info() {
        System.out.println("Pemilik: " + pemilik); // bisa, karena protected
        System.out.println("Bank: " + bank);        // bisa, karena public
        System.out.println("Saldo: " + getSaldo()); // akses saldo via getter
    }
}
