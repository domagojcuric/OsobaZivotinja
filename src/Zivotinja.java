public abstract class Zivotinja {

    private String ime;
    private int tezina;

    Zivotinja(String ime, int tezina){
        this.ime = ime;
        this.tezina = tezina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    public abstract void spava();

    public abstract void jede();

    public abstract void kreceSe();

}


