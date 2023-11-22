package Tugas.No1;

public class Anakayam {
    public static void main(String[] args) {
        int jumlahAnakAyam = 4;

        System.out.println("Lagu Anak Ayam Turun " + jumlahAnakAyam);

        for (int i = jumlahAnakAyam; i >= 1; i--) {
            System.out.println("Anak ayam turun " + i + "\nMati satu tinggal " + (i - 1));

            System.out.println("Tekotek-kotek kotek\nAnak ayam turunlah berkotek");
            System.out.println("");
        }

        System.out.println("Mama ayam pulang, pulang " + jumlahAnakAyam);
    }
}