import java.util.ArrayList;

public abstract class Osoba {

    private String OIB;
    private String ime;
    private String prezime;
    private String adresa;

    ArrayList<Zivotinja> ljubimci;

    Osoba(String OIB, String ime, String prezime, String adresa){
        this.OIB = OIB;
        this.ime = ime;
        this. prezime = prezime;
        this.adresa = adresa;
    }

    public String getOIB() {
        return OIB;
    }

    public void setOIB(String OIB) {
        this.OIB = OIB;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void zivi(){
        System.out.println("zivi");
    }

    public void jede(){
        System.out.println("jede");
    }

    public void spava(){
        System.out.println("spava");
    }

}
