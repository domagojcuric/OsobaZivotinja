public class Pas extends Zivotinja{

    private String pasmina;
    private String boja;
    private boolean necijiLjubimac;

    Pas(String ime,int tezina,String vrsta,String boja){
        super(ime,tezina);
        this.pasmina = vrsta;
        this.boja = boja;
        this.necijiLjubimac = false;

    }

    public String getVrsta() {
        return pasmina;
    }

    public void setVrsta(String vrsta) {
        this.pasmina = vrsta;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public boolean isNecijiLjubimac() {
        return necijiLjubimac;
    }

    public void setNecijiLjubimac(boolean necijiLjubimac) {
        this.necijiLjubimac = necijiLjubimac;
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
        System.out.println("trci");
    }
}
