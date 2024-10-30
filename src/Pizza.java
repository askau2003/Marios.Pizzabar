
public class Pizza {

    private String pizzaNavn;
    private Double pris;

    public Pizza(String pNavn, Double p) {
        this.pizzaNavn = pNavn;
        this.pris= p;
    }

    public String getNavn(){
        return pizzaNavn;
    }

    public Double getPris(){
        return pris;
    }

    public String toString() {
        return pizzaNavn + " - Pris: " + pris;
    }
}