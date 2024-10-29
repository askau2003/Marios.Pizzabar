public class Kunder {
    private String navn;
    private String adresse;
    private int rabat; // Os fjerne

    public Kunder(String navn, String adresse, int rabat) {  // Ved at vi har skrevet int rabet ind ender vi med at tage en plads, så hvis vi havde 10000 kunder ville det fylde mere ind at vi bare havde det som en viable inde i test fordi den ville være konstant.
        this.navn = navn;
        this.adresse = adresse;
        this.rabat = rabat; // Os fjerne
    }

    public String toString() {
        return "Navn: " + navn + ", Udbringnings Adresse: " + adresse + ", Rabat: " + rabat;
    }

}