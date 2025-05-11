package Proje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bayii bayii = new Bayii();

        // 15 Porsche modeli ekleniyor
        bayii.arabaEkle(new Porsche(1, "911 Carrera", 8500000, 2023, true, "Carrera"));
        bayii.arabaEkle(new Porsche(2, "Taycan Turbo", 9500000, 2024, true, "Taycan"));
        bayii.arabaEkle(new Porsche(3, "Panamera GTS", 7800000, 2022, true, "Panamera"));
        bayii.arabaEkle(new Porsche(4, "Cayenne S", 6200000, 2023, true, "Cayenne"));
        bayii.arabaEkle(new Porsche(5, "Macan GTS", 5400000, 2023, true, "Macan"));
        bayii.arabaEkle(new Porsche(6, "718 Cayman", 4700000, 2022, true, "Cayman"));
        bayii.arabaEkle(new Porsche(7, "718 Boxster", 4800000, 2022, true, "Boxster"));
        bayii.arabaEkle(new Porsche(8, "911 Turbo S", 10500000, 2023, true, "Carrera"));
        bayii.arabaEkle(new Porsche(9, "911 GT3", 11500000, 2023, true, "Carrera"));
        bayii.arabaEkle(new Porsche(10, "911 Targa 4S", 9200000, 2024, true, "Carrera"));
        bayii.arabaEkle(new Porsche(11, "Taycan Cross Turismo", 9800000, 2024, true, "Taycan"));
        bayii.arabaEkle(new Porsche(12, "Panamera Turbo S", 10300000, 2024, true, "Panamera"));
        bayii.arabaEkle(new Porsche(13, "Cayenne Coupe", 6600000, 2023, true, "Cayenne"));
        bayii.arabaEkle(new Porsche(14, "Macan Turbo", 5900000, 2023, true, "Macan"));
        bayii.arabaEkle(new Porsche(15, "911 Dakar", 11800000, 2024, true, "Carrera"));

        Scanner girdi = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\n=== PORSCHE BAYİİ SİSTEMİ ===");
            System.out.println("1- Araçları Listele");
            System.out.println("2- Araç Sat");
            System.out.println("0- Çıkış");
            System.out.print("Seçiminiz: ");
            secim = girdi.nextInt();

            switch (secim) {
                case 1:
                    bayii.arabaListele();
                    break;
                case 2:
                    System.out.print("Satılacak aracın ID'sini girin: ");
                    int id = girdi.nextInt();
                    bayii.arabaSat(id);
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }

        } while (secim != 0);
    }
}
