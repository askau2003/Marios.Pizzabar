import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

public class Test {
    private ArrayList<Bestilling> bestillinger;
    private PizzaMenu menu;
    private ArrayList<Kunder> kundeListe;
    // Privat int discount_amount = 10;

    public Test() {
        bestillinger = new ArrayList<>();
        menu = new PizzaMenu();
        kundeListe = new ArrayList<>();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.menu.printMenu();

        System.out.print("\n**Bestillingsliste**\n");
        test.addBestilling("Amerikaner", "10:32", "11:32");
        test.addBestilling("Vesuvio", "11:47", "12:47");
        test.addBestilling("Amerikaner", "12:09", "13:09");
        test.addBestilling("Cacciatore", "14:32", "15:32");
        test.printBestillinger();
        test.gemBestillinger("gemBestillinger.txt");

        System.out.println("\n");
        test.beregnOmsaetning();
        String mestPopulaerePizza = test.mestPopulaerePizza();
        System.out.println("Mest populære pizza: " + mestPopulaerePizza);
        System.out.println("\n");

        test.fjernBestilling("11:47");
        test.printBestillinger();

        test.addKunder("Peter Hansen", "Ølstykkevej 12", 10); // Fjerne rabetten da vi altid gir 10% til faste kunder og derfor er det unødvendigt det står der.
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
        for (Bestilling bestilling : bestillinger) {
            if (bestilling.getBestillingsTidspunkt().equals(bestillingstidspunkt)) {
                bestilling.setAfhentning();
                break;
            }
        }
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
        for (Kunder navn : kundeListe) {
            System.out.println(navn);
        }
    }

    public void gemBestillinger(String gemBestillinger) {
        try (FileWriter writer = new FileWriter(gemBestillinger)) {
            for (Bestilling bestilling : bestillinger) {
                writer.write(bestilling.toString() + "\n");
            }
            System.out.println("Bestilling(er) er gemt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void beregnOmsaetning(){

        double total = 0;
        for (Bestilling bestilling : bestillinger){
            String pizzaNavn = bestilling.getPizzaNavn();
            double pris = menu.getPizzaPris(bestilling.getPizzaNavn());
            total += pris;
        }
        System.out.println("Total omsætning: " + total);
    }


    public String mestPopulaerePizza() {
        int taeller1 = 0;
        String mestPopulaerePizza = null;

        for (Bestilling current : bestillinger) {
            int taeller2 = 0;
            for (Bestilling bestilling : bestillinger) {
                if (bestilling.getPizzaNavn().equals(current.getPizzaNavn())) {
                    taeller2++;
                }
            }
            if (taeller2 > taeller1) {
                taeller1 = taeller2;
                mestPopulaerePizza = current.getPizzaNavn();
            }
        }
        return mestPopulaerePizza;
    }
}