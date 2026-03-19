import org.w3c.dom.ls.LSOutput;

public class Vizsgalat {
    String paciensNeve, orvosSzakterulete ;
    int alapdij;

    public Vizsgalat(String paciensNeve, String orvosSzakterulete, int alapdij) {
        this.setPaciensNeve(paciensNeve);
        this.setOrvosSzakterulete(orvosSzakterulete);
        this.setAlapdij(alapdij);
    }

    public String getPaciensNeve() {
        return paciensNeve;
    }

    public void setPaciensNeve(String paciensNeve) {
        if(paciensNeve != "" || paciensNeve != null) {
            this.paciensNeve = paciensNeve;
        } else {
            System.out.println("Hiba a név módosításánál: " + paciensNeve);
        }

    }

    public String getOrvosSzakterulete() {
        return orvosSzakterulete;
    }

    public void setOrvosSzakterulete(String orvosSzakterulete) {
        if(orvosSzakterulete != "" || orvosSzakterulete != null) {
            this.orvosSzakterulete = orvosSzakterulete;
        } else {
            System.out.println("Hiba a szakterület módosításánál: " + orvosSzakterulete);
        }
    }

    public int getAlapdij() {
        return alapdij;
    }

    public void setAlapdij(int alapdij) {
        if(alapdij > 0) {
            this.alapdij = alapdij;
        } else {
            System.out.println("Hiba az alapdíj módosításánál: " + alapdij);
        }
    }

    public int vizsgalatVegsoAr(){
        return this.getAlapdij();
    }

    @Override
    public String toString() {
        return "VizsgÁlat{" +
                "páciens neve: '" + this.getPaciensNeve() + '\'' +
                ", orvos szakterülete: '" + this.getOrvosSzakterulete() + '\'' +
                ", alapdíj: " + this.getAlapdij() + '\'' +
                ", vizsgálat végső: " + this.vizsgalatVegsoAr() + '\'' +
                '}';
    }
}
