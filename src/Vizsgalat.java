public class Vizsgalat {
    private String paciensNeve, orvosSzakterulete;
    private int alapdij, idotartam = 30;

    public Vizsgalat(String paciensNeve, String orvosSzakterulete, int alapdij) {
        setPaciensNeve(paciensNeve);
        setOrvosSzakterulete(orvosSzakterulete);
        setAlapdij(alapdij);
    }

    public void setPaciensNeve(String paciensNeve) {
        if (paciensNeve != null && !paciensNeve.trim().isEmpty()) {
            this.paciensNeve = paciensNeve;
        } else {
            throw new IllegalArgumentException("Hiba a páciens neve beállításakor!");
        }
    }

    public void setOrvosSzakterulete(String orvosSzakterulete) {
        if (orvosSzakterulete != null && !orvosSzakterulete.trim().isEmpty()) {
            this.orvosSzakterulete = orvosSzakterulete;
        } else {
            throw new IllegalArgumentException("Hiba az orvos szakterülete beállításakor!");
        }
    }

    public void setAlapdij(int alapdij) {
        if (alapdij > 0) {
            this.alapdij = alapdij;
        } else {
            throw new IllegalArgumentException("Hiba az Alapdíj beállításakor!");
        }
    }

    public void setIdotartam(int idotartam) {
        if (idotartam > 0) {
            this.idotartam = idotartam;
        } else {
            throw new IllegalArgumentException("Hiba az időtartam beállításakor!");
        }
    }

    public String getPaciensNeve() { return paciensNeve; }
    public String getOrvosSzakterulete() { return orvosSzakterulete; }
    public int getAlapdij() { return alapdij; }
    public int getIdotartam() { return idotartam; }

    public int vizsgalatVegsoAr() {
        return this.getAlapdij();
    }

    public int idotartamSzamitasa() {
        return this.getIdotartam();
    }

    @Override
    public String toString() {
        return "Vizsgálat{" +
                "páciens neve: '" + getPaciensNeve() + '\'' +
                ", orvos szakterülete: '" + getOrvosSzakterulete() + '\'' +
                ", alapdíj: " + getAlapdij() + " Ft" +
                ", vizsgálat végső ára: " + vizsgalatVegsoAr() + " Ft" +
                ", időtartam: " + idotartamSzamitasa() + " perc" +
                '}';
    }
}
