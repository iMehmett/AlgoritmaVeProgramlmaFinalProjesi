package Proje;
import java.util.ArrayList;

public class Bayii {
    private ArrayList<Porsche> arabalar = new ArrayList<>();

    public void arabaEkle(Porsche araba) {
        arabalar.add(araba);
    }

    public void arabaListele() {
        for (Porsche p : arabalar) {
            p.bilgiYazdir();
        }
    }

    public void arabaSat(int id) {
        for (Porsche p : arabalar) {
            if (p.getId() == id && p.isStokta()) {
                p.setStokta(false);
                System.out.println(p.getModel() + " başarıyla satıldı.");
                return;
            }
        }
        System.out.println("Araba bulunamadı ya da stokta yok.");
    }
}
