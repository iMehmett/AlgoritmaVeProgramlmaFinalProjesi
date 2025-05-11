package Proje;

public class Porsche extends Araba {
    private String seri;

    public Porsche(int id, String model, double fiyat, int yil, boolean stokta, String seri) {
        super(id, model, fiyat, yil, stokta);
        this.seri = seri;
    }

    public String getSeri() {
        return seri;
    }

    @Override
    public void bilgiYazdir() {
        System.out.println("Seri: " + seri + " | Model: " + getModel() + " | Yıl: " + getYil() +
                           " | Fiyat: " + getFiyat() + " TL | Stok: " + (isStokta() ? "Var" : "Yok"));
    }
}
