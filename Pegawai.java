package soalUAS3;
// Variabel private untuk menyimpan data pegawai
public class Pegawai {
    private String nama;
    private String jenisKelamin;
    private String noPegawai;
    private boolean menikah;

    // Konstruktor yang menerima parameter nama, jenis kelamin, nomor pegawai, dan status menikah
    public Pegawai(String nama, String jenisKelamin, String noPegawai, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.noPegawai = noPegawai;
        this.menikah = menikah;
    }

    // Method public untuk mendapatkan tunjangan pegawai
    public int getTunjangan() {
        if (menikah) {
            if (jenisKelamin.equals("laki-laki")) {
                return 200000;
            } 
            else if (jenisKelamin.equals("perempuan")) {
                return 150000;
            }
        } 
        else {
                return 100000;
        }
        return 0;
    }

    // Method public untuk menampilkan data pegawai 
    public void toShow() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + jenisKelamin);
        System.out.println("No Pegawai\t: " + noPegawai);
        System.out.println("Status Menikah\t: " + menikah);
        System.out.println("Tunjangan\t: " + getTunjangan());
    }
}

class Programmer extends Pegawai {
    // Variabel private untuk menyimpan data programmer
    private int lamaBekerja;
    private double gaji;

    // Konstruktor yang menerima parameter nama, jenis kelamin, nomor pegawai, status menikah, lama bekerja, dan gaji
    public Programmer(String nama, String jenisKelamin, String noPegawai, boolean menikah, int lamaBekerja, double gaji) {
        super(nama, jenisKelamin, noPegawai, menikah);
        this.lamaBekerja = lamaBekerja;
        this.gaji = gaji;
    }

    // Method public untuk mendapatkan bonus programmer
    public double getBonus() {
        if (lamaBekerja < 5) {
            return gaji * 0.05;
        } 
        else {
            return gaji * 0.1;
        }
    }

    // Method override untuk menampilkan data programmer
    @Override
    public void toShow() {
        super.toShow();
        System.out.println("Lama Bekerja\t: " + lamaBekerja);
        System.out.println("Gaji\t\t: " + gaji);
        System.out.println("Bonus\t\t: " + getBonus());
    }
}