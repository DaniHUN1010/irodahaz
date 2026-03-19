


public class SzakorvosiKonzultacio extends Vizsgalat {
    private int konzultacioHossza;

    public SzakorvosiKonzultacio(String paciensNeve, String orvosSzakterulete, int alapdij, int konzultacioHossza) {
        super(paciensNeve, orvosSzakterulete, alapdij);
        this.konzultacioHossza = konzultacioHossza;
    }

    private double getSzakteruletSzorzo() {
        return switch (getOrvosSzakterulete().toLowerCase()) {
            // Példa szorzók a követelmény alapján
            case "agysebész" -> 2.5;
            case "fogorvos" -> 1.2;
            default -> 1.0;
        };
    }

    @Override
    public double vegsoArSzamitasa() {
        // Alapdíj szorozva a szakterület súlyával és az időtartam arányával (pl. 30 perchez képest)
        return (getAlapdij() * getSzakteruletSzorzo()) * (konzultacioHossza / 30.0);
    }

    @Override
    public int idotartamSzamitasa() {
        return konzultacioHossza;
    }
}