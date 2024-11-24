/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author les
 */
public class matematikaBeraksi {
    public static void main(String[] args){
        matematikaCanggih EmTeKa = new matematikaCanggih();
        
        int angkasatu = 12;
        int angkadua = 5;
       
        System.out.println("Hasil dari penjumlahan 12+5 adalah, " + EmTeKa.tambah(12, angkadua));
        System.out.println("Hasil dari perkalian 12*5 adalah, " + EmTeKa.kali(12, angkadua));
        System.out.println("Hasil dari modulus 12%5 adalah, " + EmTeKa.modulus(12, angkadua));
    }
}
