package utp.shapes;

public class LimasPersegi {
    private double sisi;
    private double tinggi;
    private final double PI = 22.0 / 7;

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public double hitungTinggiSisi() {
        return Math.sqrt(Math.pow(tinggi, 2) + Math.pow(sisi / 2, 2));
    }

    public double hitungLuasSisi() {
        return (hitungTinggiSisi() * sisi) / 2;
    }

    public double hitungLuasAlas() {
        return sisi * sisi;
    }

    public double hitungLuasPermukaan() {
        return 4 * hitungLuasSisi() + hitungLuasAlas();
    }

    public double hitungVolume() {
        return hitungLuasAlas() * tinggi / 3;
    }

    public void printInfo() {
        System.out.println("Nama            : Limas Persegi");
        System.out.println("Luas permukaan  : " + hitungLuasPermukaan());
        System.out.println("Volume          : " + hitungVolume());
    }
}