import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan sebuah kalimat
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        // Menghasilkan dua indeks acak untuk menentukan substring
        // start = indeks awal, end = indeks akhir (lebih besar dari start)
        int start = (int)(Math.random() * kalimat.length());
        int end = (int)(Math.random() * (kalimat.length() - start)) + start + 1;

        // Menanyakan kepada pengguna substring yang berada di antara indeks start hingga end-1
        System.out.printf("Apa substring dari indeks %d hingga %d? ", start, end - 1);
        String jawabanUser = input.nextLine();
        // Mendapatkan substring yang benar dari kalimat
        String substringBenar = kalimat.substring(start, end);

        // Mengecek apakah jawaban pengguna sesuai dengan substring yang benar
        if (jawabanUser.equals(substringBenar)) {
            System.out.println("\u2714 Benar! Keren, kamu jago string!");
        } else {
            System.out.println("\u2716 Kurang tepat. Jawaban yang benar: " + substringBenar);
        }

        input.close();
    }
}
