package pboif2.pkg10119065.latihan36.targetsaldotabungan;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program target saldo tabungan 
                          dengan objek
 */
public class PBOIF210119065Latihan36TargetSaldoTabungan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Saldo targetSaldo = new Saldo();
        int usSaldo = 3500000;
        int usBunga = 8;
        int usSaldoTarget = 6000000;
        
        targetSaldo.hitungTarget(usSaldo,usSaldoTarget,usBunga);
        System.out.println("\nDeveloped by : Fachriansyah Muhammad Nur Ihsan");
    }
    
}
