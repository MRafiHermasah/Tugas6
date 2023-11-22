package Tugas.No1;

public class Derethuruf {
    public static void main(String[] args) {
        System.out.println("Deret huruf Z - A:");

        System.out.println("Menggunakan perulangan:");
        deretHuruf();
    }

    private static void deretHuruf() {
        for (char huruf = 'Z'; huruf >= 'A'; huruf--) {
            System.out.println(huruf);
        }
    }
}