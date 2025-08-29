import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan empat bilangan bulat
        System.out.print("Masukkan bilangan pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int c = input.nextInt();
        System.out.print("Masukkan bilangan keempat: ");
        int d = input.nextInt();

        // Variabel untuk menyimpan nilai terbesar dan terkecil
        int max;
        int min;

        // Menentukan bilangan terbesar 
        if (a >= b && a >= c && a >= d) {
            max = a;
        } else if (b >= a && b >= c && b >= d) {
            max = b;
        } else if (c >= a && c >= b && c >= d) {
            max = c;
        } else {
            max = d;
        }

        // Menentukan bilangan terkecil
        if (a <= b && a <= c && a <= d) {
            min = a;
        } else if (b <= a && b <= c && b <= d) {
            min = b;
        } else if (c <= a && c <= b && c <= d) {
            min = c;
        } else {
            min = d;
        }

        // Menampilkan hasil bilangan terbesar dan terkecil
        System.out.println("Bilangan terbesar adalah: " + max);
        System.out.println("Bilangan terkecil adalah: " + min);

        input.close();
    }
}
