import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah buku di awal");
            System.out.println("2. Tambah buku di akhir");
            System.out.println("3. Hapus buku");
            System.out.println("4. Cetak daftar buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul Buku: ");
                    String judulAwal = scanner.nextLine();
                    System.out.print("Masukkan Penulis: ");
                    String penulisAwal = scanner.nextLine();
                    System.out.print("Masukkan Tahun Terbit: ");
                    int tahunTerbitAwal = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer
                    linkedList.tambahDiAwal(new Buku(judulAwal, penulisAwal, tahunTerbitAwal));
                    break;
                case 2:
                    System.out.print("Masukkan Judul Buku: ");
                    String judulAkhir = scanner.nextLine();
                    System.out.print("Masukkan Penulis: ");
                    String penulisAkhir = scanner.nextLine();
                    System.out.print("Masukkan Tahun Terbit: ");
                    int tahunTerbitAkhir = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer
                    linkedList.tambahDiAkhir(new Buku(judulAkhir, penulisAkhir, tahunTerbitAkhir));
                    break;
                case 3:
                    System.out.println("1. Hapus buku dari awal");
                    System.out.println("2. Hapus buku dari akhir");
                    System.out.print("Pilih operasi: ");
                    int pilihanHapus = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer
                    if (pilihanHapus == 1) {
                        linkedList.hapusDariAwal();
                    } else if (pilihanHapus == 2) {
                        linkedList.hapusDariAkhir();
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 4:
                    linkedList.cetakList();
                    break;
                case 5:
                    System.out.println("Program berakhir.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
