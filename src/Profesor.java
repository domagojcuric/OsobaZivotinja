public class Profesor extends Osoba implements Predaje{

    private String fakultet;
    private String kolegij;


    Profesor(String OIB, String ime, String prezime, String adresa, String fakultet,String kolegij) {
        super(OIB, ime, prezime, adresa);
        this.fakultet = fakultet;
        this.kolegij = kolegij;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public String getKolegij() {
        return kolegij;
    }

    public void setKolegij(String kolegij) {
        this.kolegij = kolegij;
    }

    @Override
    public void predaje() {
        String s = getKolegij() + "_" + getFakultet();
        System.out.println(s);
    }
}
