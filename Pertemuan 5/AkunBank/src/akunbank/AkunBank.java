/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package akunbank;

/**
 *
 * @author salma
 */
public class AkunBank {
    private double saldo = 100000;      
    protected String pemilik = "Salma";  
    public String bank = "Bank Indonesia"; 

    public double getSaldo() {
        return saldo;  
    }

    protected void tambahSaldo(double jumlah) {
        saldo += jumlah;
    }
}
