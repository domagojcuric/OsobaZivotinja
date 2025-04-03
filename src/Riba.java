public class Riba extends Zivotinja {

    private String vrsta;
    private String velicina;
    private boolean agresivna;

    Riba(String ime,int tezina, String vrsta, String velicina, boolean necijiLjubimac){
        super(ime, tezina);
        this.vrsta = vrsta;
        this.velicina = velicina;
        this.agresivna = false;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getVelicina() {
        return velicina;
    }

    public void setVelicina(String velicina) {
        this.velicina = velicina;
    }

    public boolean isNecijiLjubimac() {
        return agresivna;
    }

    public void setNecijiLjubimac(boolean necijiLjubimac) {
        this.agresivna = agresivna;
    }


    @Override
    public void spava() {
        System.out.println("spava");
    }

    @Override
    public void jede() {
        System.out.println("jede");
    }

    @Override
    public void kreceSe() {
        System.out.println("pliva");
    }
}
