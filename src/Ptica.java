public class Ptica extends Zivotinja {

    private int rasponKrila;
    private int brzina;
    private String bojaKljuna;

    Ptica(String ime,int tezina, int rasponKrila, int brzina, String bojaKljuna){
        super(ime,tezina);
        this.rasponKrila = rasponKrila;
        this.brzina = brzina;
        this.bojaKljuna = bojaKljuna;
    }

    public int getRasponKrila() {
        return rasponKrila;
    }

    public void setRasponKrila(int rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    public String getBojaKljuna() {
        return bojaKljuna;
    }

    public void setBojaKljuna(String bojaKljuna) {
        this.bojaKljuna = bojaKljuna;
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
        System.out.println("leti");
    }
}
