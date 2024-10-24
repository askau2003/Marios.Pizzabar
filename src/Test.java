import java.util.ArrayList;

public class Test {
    private ArrayList<Bestilling> bestillinger;

    public Test(){
        bestillinger = new ArrayList<>();
    }

    public static void main(String[] args) {
        PizzaMenu menu = new PizzaMenu();
        menu.printMenu();

        Test test = new Test();
        System.out.print("\n");
        System.out.println("**Bestillingsliste**");
        test.addBestilling("Vesuvio", "11:47", "12:47");
        test.addBestilling("Amerikaner","12:09","13:09");
        test.printBestillinger();
    }

    public void addBestilling(String pizzaNavn, String bestillingsTidspunkt, String afhentningsTidspunkt) {
        Bestilling nyBestilling = new Bestilling(pizzaNavn, bestillingsTidspunkt, afhentningsTidspunkt);
        bestillinger.add(nyBestilling);
    }

    public void printBestillinger(){
        for (Bestilling bestilling : bestillinger) {
            System.out.println(bestilling);
        }
    }
}