/*
 * Lisans bilgisi icin lutfen proje ana dizinindeki zemberek2-lisans.txt dosyasini okuyunuz.
 */

/*
 * Created on 13.Eyl.2005
 *
 */
//package net.zemberek.kullanim;
package app_with_pooka;

import net.zemberek.araclar.TimeTracker;
import net.zemberek.erisim.Zemberek;
import net.zemberek.tr.yapi.TurkiyeTurkcesi;

public class TestDogrula {

    private static Zemberek zemberek;

    public static void denetle(String str) {
        if (zemberek.kelimeDenetle(str) == true) {
            System.out.println(str + " Türkçe bir kelime");
        } else {
            System.out.println(str + " Türkçe değil");
        }
    }

    public static void main(String[] args) {
        TimeTracker.startClock("x");
        zemberek = new Zemberek(new TurkiyeTurkcesi());
        System.out.println(TimeTracker.stopClock("x"));

        denetle("kediciklerin");
        denetle("Çekoslovakyalalaştırabileceklerimizdenseniz");
        denetle("Mrhaba");
        denetle("yürekleniğişebiliyordurlarına");
    }
}
