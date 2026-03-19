import java.util.ArrayList;
import java.util.List;

public class NapiZarasiRiport {
    private List<Vizsgalat> napiVizsgalatok = new ArrayList<>();

    public void vizsgalatHozzaadasa(Vizsgalat v) {
        napiVizsgalatok.add(v);
    }

    public double getNapiOsszBevetel() {
        return napiVizsgalatok.stream()
                .mapToDouble(Vizsgalat::vegsoArSzamitasa)
                .sum();
    }

    public List<String> getKesoPaciensek() {
        List<String> kesok = new ArrayList<>();
        for (Vizsgalat v : napiVizsgalatok) {
            if (v instanceof LaborVizsgalat l) {
                if (l.getVarakozasiIdoNapokban() >= 3) {
                    kesok.add(l.getPaciensNeve() + " (" + l.getVarakozasiIdoNapokban() + " nap)");
                }
            }
        }
        return kesok;
    }

    public void riportNyomtatas() {
        System.out.println("--- NAPI ZÁRÁSI RIPORT ---");
        napiVizsgalatok.forEach(v ->
                System.out.printf("Páciens: %s | Szakterület: %s | Díj: %.2f Ft%n",
                        v.getPaciensNeve(), v.getSzakterulet(), v.vegsoArSzamitasa()));

        System.out.println("--------------------------");
        System.out.println("Összes bevétel: " + getNapiOsszBevetel() + " Ft");
        System.out.println("Sokat várakozó páciensek: " + getKesoPaciensek());
    }
}
