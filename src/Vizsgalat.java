import org.w3c.dom.ls.LSOutput;

public class Vizsgalat {
    String paciensNeve, orvosSzakterulete ;
    int alapdij, idotartam = 30;

    public Vizsgalat(String paciensNeve, String orvosSzakterulete, int alapdij) {
        this.setPaciensNeve(paciensNeve);
        this.setOrvosSzakterulete(orvosSzakterulete);
        this.setAlapdij(alapdij);
    }

    public String getPaciensNeve() {
        return paciensNeve;
    }

    public void setPaciensNeve(String paciensNeve) {
        if(!paciensNeve.trim().isEmpty()) {
            this.paciensNeve = paciensNeve;
        } else {
            throw new IllegalArgumentException("Hiba a páciens neve beállításakor!");
        }

    }

    public String getOrvosSzakterulete() {
        return orvosSzakterulete;
    }

    public void setOrvosSzakterulete(String orvosSzakterulete) {
        if(!orvosSzakterulete.trim().isEmpty()) {
            this.orvosSzakterulete = orvosSzakterulete;
        } else {
            throw new IllegalArgumentException("Hiba az orvos szakterülete beállításakor!");
        }
    }

    public int getAlapdij() {
        return alapdij;
    }

    public void setAlapdij(int alapdij) {
        if(alapdij > 0) {
            this.alapdij = alapdij;
        } else {
            throw new IllegalArgumentException("Hiba az Alapdíj beállításakor!");
        }
    }

    public int getIdotartam() {
        return idotartam;
    }

    public void setIdotartam(int idotartam) {
        if(idotartam > 0) {
            this.idotartam = idotartam;
        } else {
            throw new IllegalArgumentException("Hiba az időtartam beállításakor!");
        }

    }

    public int vizsgalatVegsoAr(){
        return this.getAlapdij();
    }

    public int idotartamSzamitasa(){
        return this.getIdotartam();
    }

    @Override
    public String toString() {
        return "VizsgÁlat{" +
                "páciens neve: '" + this.getPaciensNeve() + '\'' +
                ", orvos szakterülete: '" + this.getOrvosSzakterulete() + '\'' +
                ", alapdíj: " + this.getAlapdij() + "Ft\'" +
                ", vizsgálat végső ára: " + this.vizsgalatVegsoAr() + "Ft\'" +
                ", időtartam: " + this.idotartamSzamitasa() + "perc\'" +
                '}';
    }
}
