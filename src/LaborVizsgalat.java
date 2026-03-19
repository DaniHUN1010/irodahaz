public class LaborVizsgalat extends Vizsgalat {
    private int anyagkoltseg;
    private int varakozasiIdoNapokban;

    public LaborVizsgalat(String paciensNeve, String orvosSzakterulete, int alapdij, int anyagkoltseg, int varakozasiIdoNapokban) {
        super(paciensNeve, orvosSzakterulete, alapdij);
        this.anyagkoltseg = anyagkoltseg;
        this.varakozasiIdoNapokban = varakozasiIdoNapokban;
    }

    public int getAnyagkoltseg() {
        return anyagkoltseg;
    }

    public void setAnyagkoltseg(int anyagkoltseg) {
        if(anyagkoltseg > 0) {
            this.anyagkoltseg = anyagkoltseg;
        } else {
            throw new IllegalArgumentException("Hiba az anyagköltség beállításakor!");
        }
    }

    public int getVarakozasiIdoNapokban() {
        return varakozasiIdoNapokban;
    }

    public void setVarakozasiIdoNapokban(int varakozasiIdoNapokban) {
        if(varakozasiIdoNapokban > 0) {
            this.varakozasiIdoNapokban = varakozasiIdoNapokban;
        } else {
            throw new IllegalArgumentException("Hiba a várakozási idő beállításakor!");
        }
    }

    @Override
    public int vizsgalatVegsoAr() {
        return this.getAlapdij() + this.getAnyagkoltseg();
    }

    @Override
    public String toString() {
        return "Vizsgálat{" +
                "páciens neve: '" + this.getPaciensNeve() + '\'' +
                ", orvos szakterülete: '" + this.getOrvosSzakterulete() + '\'' +
                ", alapdíj: " + this.getAlapdij() + "Ft\'" +
                ", vizsgálat végső ára: " + this.vizsgalatVegsoAr() + "Ft\'" +
                ", anyagkötség: " + this.getAnyagkoltseg() + "Ft\'" +
                ", anyagkötség: " + this.getAnyagkoltseg() + "Ft\'" +
                ", várakozási idő: " + this.getVarakozasiIdoNapokban() + " nap\'" +
                '}';
    }
}
