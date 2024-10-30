public class Bestilling {

    private String afhentningsTidspunkt;
    private String bestillingsTidspunkt;
    private String pizzaNavn;
    private boolean erAfhentet;

    public Bestilling(String pNavn, String bestTidspunkt, String afhTidspunkt) {
        pizzaNavn = pNavn;
        bestillingsTidspunkt = bestTidspunkt;
        afhentningsTidspunkt = afhTidspunkt;
    }

    public String getAfhentningsTidspunkt() {
        return afhentningsTidspunkt;

    }

    public String getBestillingsTidspunkt() {
        return bestillingsTidspunkt;
    }

    public String getPizzaNavn() {
        return pizzaNavn;
    }

    public void setAfhentning(){
        this.erAfhentet = true;
    }

    public String toString() {
        return "Pizza: " + pizzaNavn + "\n" + "Bestillingstidspunkt: " + bestillingsTidspunkt + "\n" + "Afhentningstidspunkt: " + afhentningsTidspunkt + "\n";
    }
}
