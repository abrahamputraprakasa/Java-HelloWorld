package site.abrahamprakasa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.print("Halo Dunia");
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.print("Mohon masukkan angka pertama: ");
        int bil1 = scan.nextInt();

        System.out.print("Mohon masukkan angka kedua: ");
        int bil2 = scan.nextInt();

        int hasil = bil1 + bil2;
        int hasilKurang = bil1 - bil2;
        int hasilKali = bil1 * bil2;
        float hasilBagi = (float) bil1 / (float) bil2;
        int hasilModulus = bil1 % bil2;
        System.out.printf("Hasil Penjumlahan bilangan %d dan %d adalah %d %n", bil1, bil2, hasil);
        System.out.printf("Hasil Pengurangan bilangan %d dan %d adalah %d %n", bil1, bil2, hasilKurang);
        System.out.printf("Hasil Perkalian bilangan %d dan %d adalah %d %n", bil1, bil2, hasilKali);
        System.out.printf("Hasil Pembagian bilangan %d dan %d adalah %.2f %n", bil1, bil2, hasilBagi);
        System.out.printf("Hasil Modulus bilangan %d dan %d adalah %d %n", bil1, bil2, hasilModulus);

        boolean lebihDariNol = (hasilModulus > 0);
        char karakter = 'a';


        System.out.println("Hasil modulus lebih dari nol: " + lebihDariNol);
        System.out.println("karakter " + karakter);

    }
}
