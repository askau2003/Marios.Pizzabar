public class Kunder {
    private String navn;
    private String adresse;
    private int rabat;

    public Kunder(String navn, String adresse, int rabat) {
        this.navn = navn;
        this.adresse = adresse;
        this.rabat = rabat; // Os fjerne
    }


    public String toString() {
        return "Navn: " + navn + ", Udbringnings Adresse: " + adresse + ", Rabat: " + rabat;
    }

}