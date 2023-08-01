package soalUAS3;
public class Main {
    public static void main(String[] args) {
        // Pegawai laki-laki yang telah menikah
        Pegawai pegawai1 = new Pegawai("Jaksa", "laki-laki", "123", true);
        pegawai1.toShow();
        System.out.println();

        // Pegawai perempuan yang belum menikah
        Pegawai pegawai2 = new Pegawai("Evelyn", "perempuan", "234", false);
        pegawai2.toShow();
        System.out.println();

        // Programmer laki-laki yang belum menikah dan telah bekerja selama 5 tahun
        Programmer programmer1 = new Programmer("Aldan", "laki-laki", "345", false, 5, 1000000);
        programmer1.toShow();
        System.out.println();

        // Programmer perempuan yang telah menikah dan telah bekerja selama 2 tahun
        Programmer programmer2 = new Programmer("Nana", "perempuan", "456", true, 2, 800000);
        programmer2.toShow();
        System.out.println();

        // Programmer laki-laki yang telah menikah dan telah bekerja lebih dari 10 tahun
        Programmer programmer3 = new Programmer("Ucup", "laki-laki", "567", true, 12, 1200000);
        programmer3.toShow();
        System.out.println();
    }
}