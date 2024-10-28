import java.util.ArrayList;

public class Test {
    private ArrayList<Bestilling> bestillinger;
    private PizzaMenu menu;
    private ArrayList<Kunder> kundeListe;

    public Test() {
        bestillinger = new ArrayList<>();
        menu = new PizzaMenu();
        kundeListe = new ArrayList<>();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.menu.printMenu();

        System.out.print("\n**Bestillingsliste**\n");
        test.addBestilling("Vesuvio", "11:47", "12:47");
        test.addBestilling("Amerikaner", "12:09", "13:09");
        test.addBestilling("Cacciatore", "14:32", "15:32");
        test.printBestillinger();

        test.fjernBestilling("11:47");
        test.printBestillinger();
        test.addKunder("Peter Hansen", "Ølstykkevej 12", 10);
        test.printKunder();
    }

    public void addBestilling(String pizzaNavn, String bestillingsTidspunkt, String afhentningsTidspunkt) {
        Bestilling nyBestilling = new Bestilling(pizzaNavn, bestillingsTidspunkt, afhentningsTidspunkt);
        bestillinger.add(nyBestilling);
    }

    public void printBestillinger() {
        for (Bestilling bestilling : bestillinger) {
            double pris = menu.getPizzaPris(bestilling.getPizzaNavn());
            // Udskriv i ønsket rækkefølge
            System.out.println("Pizza: " + bestilling.getPizzaNavn());
            System.out.println("Pris: " + (pris >= 0 ? pris + " DKK" : "Ikke tilgængelig"));
            System.out.println("Bestillingstidspunkt: " + bestilling.getBestillingsTidspunkt());
            System.out.println("Afhentningstidspunkt: " + bestilling.getAfhentningsTidspunkt());
            System.out.println();  // Tom linje mellem bestillinger
        }
    }

    public void fjernBestilling(String bestillingstidspunkt) {
        bestillinger.removeIf(bestilling -> bestilling.getBestillingsTidspunkt().equals(bestillingstidspunkt));
    }

    public void addKunder(String navn, String adresse, int rabat) {
        Kunder nyKunde = new Kunder(navn, adresse, rabat);
        kundeListe.add(nyKunde);
        if (kundeListe.contains(nyKunde)) {
            System.out.println("Kunden får Rabat: " + rabat + "%");
        } else {
            System.out.println("Kunden får ikke Rabat!");
        }
    }

    public void printKunder() {
        for (Kunder kNavn : kundeListe) {
            System.out.println(kNavn);
        }
    }
}


