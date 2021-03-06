package pboif2.pkg10119065.latihan36.targetsaldotabungan;


/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program target saldo tabungan 
                          dengan objek
 */
public class Saldo {    
    private int saldoTabungan;
    
    private int calcSaldoTabungan (int saldo, int bunga)
    {
        saldoTabungan = saldo + (saldo * bunga) / 100;
        return saldoTabungan;
    }
    
    public void hitungTarget(int setSaldo, int setSaldoTarget, int setBunga){
        int i = 0;
        int saldo = setSaldo;
        while(saldo < setSaldoTarget){
            System.out.println("Saldo di bulan ke-"+ (i+1) +" "+ String.format("%,d", calcSaldoTabungan(saldo,setBunga)).replace(',','.'));
            saldo = calcSaldoTabungan(saldo,setBunga);
            i++;
        }
    }
}
