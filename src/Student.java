public class Student extends Osoba implements Uci {

    private String JMBAG;
    private String fakultet;
    private int godinaStudiranja;


    Student(String OIB, String ime, String prezime, String adresa, String JMBAG,String fakultet, int godinaStudiranja) {
        super(OIB, ime, prezime, adresa);
        this.JMBAG = JMBAG;
        this.fakultet = fakultet;
        this.godinaStudiranja = godinaStudiranja;
    }

    public String getJMBAG() {
        return JMBAG;
    }

    public void setJMBAG(String JMBAG) {
        this.JMBAG = JMBAG;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public int getGodinaStudiranja() {
        return godinaStudiranja;
    }

    public void setGodinaStudiranja(int godinaStudiranja) {
        this.godinaStudiranja = godinaStudiranja;
    }

    @Override
    public void spava() {
        System.out.println("spava 10 sati");
    }

    @Override
    public void uci() {
        System.out.println("uci");
    }
}
