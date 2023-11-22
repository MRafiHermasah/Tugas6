package Tugas.No1;
import java.util.Scanner;
public class Ganjilgenap {
    public static void main(String[] args) {
        int Awal, Akhir;
        int pilihan;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n1. Ganjil \n2. Genap \nPilihlah salah satu opsi diatas!: ");
        pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.print("Angka Awal: ");
            Awal = scanner.nextInt();
            System.out.print("Angka Akhir: ");
            Akhir = scanner.nextInt();
            for (int i = Awal; i <= Akhir; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            if (pilihan == 2) {
                System.out.print("Angka Awal: ");
                Awal = scanner.nextInt();
                System.out.print("Angka Akhir: ");
                Akhir = scanner.nextInt();
                for (int i = Awal; i <= Akhir; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}