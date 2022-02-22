package tugas1; //deklarasi package

import java.util.Scanner; //packages untuk input dari user
import tugas1.Konversi; // untuk mengimport kelas Konversi

public class Main {
    public static void main(String[] args) {
        int suhu, menu; //deklarasi variabel suhu utk menyimpan data celsius, menu untuk pilih opsi
        boolean cek = false;
        Scanner input = new Scanner(System.in);
        
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius  : ");
        
        suhu = input.nextInt();
        Konversi convert = new Konversi (suhu); //instansiasi
        do {
            System.out.println("\nOpsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            menu = input.nextInt();
            
            if (menu == 1) {
                convert.tampil();
            } 
            else if (menu == 2) {
                System.out.println("\nInput Data");
                System.out.println("----------");
                System.out.print("Suhu Dalam Celsius : ");
                convert.suhu = input.nextInt();
            }
            else if (menu == 3) {
                System.exit(0);
            }
            else {
                System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar!");
                cek = true;
            }
            
        } while (cek= true);
         
    }
}
