/**
 * Kalkulator
 */
import java.util.Scanner;
public class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Bilangan1, Bilangan2;
        
        System.out.println("Pilih operasi :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Hasil bagi");


        System.out.println("Masukkan Pilihan (1/2/3/4/5) :");

        String pilihan = scanner.nextLine();
        if (pilihan.equals("1") || pilihan.equals("2") || pilihan.equals("3") || pilihan.equals("4")){
            System.out.println("Masukkan bilangan pertama :");
            Bilangan1 = scanner.nextInt();
            System.out.println("Masukkan bilangan kedua :");
            Bilangan2 = scanner.nextInt();


            if(pilihan.equals("1")){
                System.out.println(Bilangan1 + " + " + Bilangan2 + " = " + (Bilangan1 + Bilangan2));
            } else if(pilihan.equals("2")){
                System.out.println(Bilangan1 + " - " + Bilangan2 + " = " + (Bilangan1 - Bilangan2));
            } else if(pilihan.equals("3")){
                System.out.println(Bilangan1 + " x " + Bilangan2 + " = " + (Bilangan1 * Bilangan2));
            }else if(pilihan.equals("4")){
                System.out.println(Bilangan1 + " : " + Bilangan2 + " = " + (Bilangan1 / Bilangan2));
            }
        }else{
            System.out.println("Pilihan Invalid");
        }
    }
    
}