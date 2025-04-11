package utp.shapes;

public class PrismaSegitigaSamaKaki {
    private double alas;
    private double kaki;
    private double tinggi;
    private final double PI = 22.0 / 7;

    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        this.tinggi = tinggi;
    }

    public double hitungTinggiAlas() {
        return Math.sqrt(Math.pow(kaki, 2) - Math.pow(alas / 2, 2));
    }

    public double hitungLuasAlas() {
        return (hitungTinggiAlas() * alas) / 2;
    }

    public double hitungKeliling() {
        return 2 * kaki + alas;
    }

    public double hitungLuasPermukaan() {
        return 2 * hitungLuasAlas() + hitungKeliling() * tinggi;
    }

    public double hitungVolume() {
        return hitungLuasAlas() * tinggi;
    }

    public void printInfo() {
        System.out.println("Nama            : Prisma Segitiga Sama Kaki");
        System.out.println("Luas permukaan  : " + hitungLuasPermukaan());
        System.out.println("Volume          : " + hitungVolume());
    }
}