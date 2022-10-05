package Bangunruang;

public class Main {
    public static void main(String[] args){

        bangunruang BangunRuang = new bangunruang();
        Bangunruang.Segitiga segitiga = new Bangunruang.Segitiga(8, 6);
        Bangunruang.Lingkaran lingkaran = new Bangunruang.Lingkaran(30);

        BangunRuang.luas();
        BangunRuang.keliling();

        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Luas Lingkaran: " + lingkaran.keliling());
    }
}
