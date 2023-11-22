package Tugas.No1;

public class Bilanganprima {
    public static void main(String[] args) {
        System.out.println("Deret bilangan prima & bukan dari 0 - 20:");
        System.out.println("Prima:");
        for (int i = 0; i <= 20; i++) {
            if (isPrima(i)) {
                System.out.println("Angka "+ i + " Adalah Bilangan Prima");
            }
        }
        System.out.println("\nBukan Prima:");
        for (int i = 0; i <= 20; i++) {
            if (!isPrima(i)) {
                System.out.println("Angka "+ i + " Adalah Bukan Bilangan Prima");
            }
        }
    }
    private static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}