package Proje;

public class Araba {
    private int id;
    private String model;
    private double fiyat;
    private int yil;
    private boolean stokta;

    public Araba(int id, String model, double fiyat, int yil, boolean stokta) {
        this.id = id;
        this.model = model;
        this.fiyat = fiyat;
        this.yil = yil;
        this.stokta = stokta;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getFiyat() {
        return fiyat;
    }

    public int getYil() {
        return yil;
    }

    public boolean isStokta() {
        return stokta;
    }

    public void setStokta(boolean stokta) {
        this.stokta = stokta;
    }

    public void bilgiYazdir() {
        System.out.println("Model: " + model + " | Yıl: " + yil + " | Fiyat: " + fiyat + " TL | Stok: " + (stokta ? "Var" : "Yok"));
    }
}
