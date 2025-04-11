package utp.shapes;

public class Tabung {
    private double radius;
    private double tinggi;
    private final double PI = 22.0 / 7;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public double hitungLuasAlas() {
        return PI * radius * radius;
    }

    public double hitungKeliling() {
        return 2 * PI * radius;
    }

    public double hitungLuasPermukaan() {
        return 2 * hitungLuasAlas() + hitungKeliling() * tinggi;
    }

    public double hitungVolume() {
        return hitungLuasAlas() * tinggi;
    }

    public void printInfo() {
        System.out.println("Nama            : Tabung");
        System.out.println("Luas permukaan  : " + hitungLuasPermukaan());
        System.out.println("Volume          : " + hitungVolume());
    }
}