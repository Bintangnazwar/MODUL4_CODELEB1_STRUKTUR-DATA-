import java.util.HashMap;
import java.util.Map;

public class Codeleb1 {
    public static void main(String[] args) {
        // Inisialisasi HashMap untuk menyimpan nama dan nomor telepon
        HashMap<String, String> bukuTelepon = new HashMap<>();

        // Menambahkan data kontak
        bukuTelepon.put("Bintang", "081234567000");
        bukuTelepon.put("Hajrin", "087650001000");
        bukuTelepon.put("Alimun", "085555555555");

        // Menampilkan isi buku telepon
        System.out.println("Isi Buku Telepon:");
        for (Map.Entry<String, String> entry : bukuTelepon.entrySet()) {
            System.out.println("Nama: " + entry.getKey() + ", Telepon: " + entry.getValue());
        }

        // Mencari nomor telepon berdasarkan nama
        String namaDicari = "Bintang";
        String nomorTelepon = bukuTelepon.get(namaDicari);

        if (nomorTelepon != null) {
            System.out.println("Nomor telepon " + namaDicari + ": " + nomorTelepon);
        } else {
            System.out.println("Kontak '" + namaDicari + "' tidak ditemukan.");
        }

        // Memeriksa apakah sebuah nama ada dalam buku telepon
        String namaPengecekan = "Hajrin";
        if (bukuTelepon.containsKey(namaPengecekan)) {
            System.out.println("Kontak '" + namaPengecekan + "' ada dalam buku telepon.");
        } else {
            System.out.println("Kontak '" + namaPengecekan + "' tidak ada dalam buku telepon.");
        }

        // Menghapus data kontak
        String namaHapus = "Alimun";
        bukuTelepon.remove(namaHapus);
        System.out.println("Isi Buku Telepon setelah menghapus '" + namaHapus + "':");
        
        for (Map.Entry<String, String> entry : bukuTelepon.entrySet()) {
            System.out.println("Nama: " + entry.getKey() + ", Telepon: " + entry.getValue());
        }
    }
}
