import java.util.ArrayList;

public class PizzaMenu {
    private ArrayList<Pizza> pizzaMenu;

    public PizzaMenu() {
        pizzaMenu = new ArrayList<>();
        pizzaMenu.add(new Pizza("1. Vesuvio: Tomatsauce, ost, skinke og oregano", 57.0));
        pizzaMenu.add(new Pizza("2. Amerikaner: Tomatsauce, ost, oksefars og oregano", 53.0));
        pizzaMenu.add(new Pizza("3. Cacciatore: Tomatsauce, ost, pepperoni og oregano", 57.0));
        pizzaMenu.add(new Pizza("4. Carbona: Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 64.0));
        pizzaMenu.add(new Pizza("5. Dennis: Tomatsauce, ost, skinke, pepperoni, cocktailpølser", 65.0));
        pizzaMenu.add(new Pizza("6. Bertil: Tomatsauce, ost, bacon og oregano", 57.0));
        pizzaMenu.add(new Pizza("7. Silvia: Tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", 61.0));
        pizzaMenu.add(new Pizza("8. Victoria: Tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 61.0));
        pizzaMenu.add(new Pizza("9. Toronfo: Tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 61.0));
        pizzaMenu.add(new Pizza("10. Capricciosa: Tomatsauce, ost, skinke, champignon og oregano", 61.0));
        pizzaMenu.add(new Pizza("11. Hawai: Tomatsauce, ost, skinke, ananas og oregano", 61.0));
        pizzaMenu.add(new Pizza("12. La Blissola: Tomatsauce, ost, skinke, rejer og oregano", 61.0));
        pizzaMenu.add(new Pizza("13. Venezia: Tomatsauce, ost, skinke, bacon og oregano", 61.0));
        pizzaMenu.add(new Pizza("14. Mafia: Tomatsauce, ost, pepperoni, bacon, løg og oregano", 84.0));
        pizzaMenu.add(new Pizza("15. Parma: Tomatsauce, ost, parmaskinke, rucola og oregano", 74.0));
        pizzaMenu.add(new Pizza("16. Quattro Stagioni: Tomatsauce, ost, skinke, champignon, artiskok og oliven", 86.0));
        pizzaMenu.add(new Pizza("17. Diavola: Tomatsauce, ost, stærk salami, chili og oregano", 74.0));
        pizzaMenu.add(new Pizza("18. Margherita: Tomatsauce, ost, tomatskiver og oregano", 70.0));
        pizzaMenu.add(new Pizza("19. Quattro Formaggi: Tomatsauce, mozzarella, gorgonzola, parmesan, ricotta og oregano", 65.0));
        pizzaMenu.add(new Pizza("20. Frutti di Mare: Tomatsauce, ost, rejer, muslinger, blæksprutter og oregano", 69.0));
        pizzaMenu.add(new Pizza("21. Tonno: Tomatsauce, ost, tun, løg og oregano", 82.0));
        pizzaMenu.add(new Pizza("22. Calzone: Tomatsauce, ost, skinke, champignon, indbagt og oregano", 55.0));
        pizzaMenu.add(new Pizza("23. Mexicana: Tomatsauce, ost, oksekød, jalapeños, majs og oregano", 74.0));
        pizzaMenu.add(new Pizza("24. Toscana: Tomatsauce, ost, skinke, bacon, løg og oregano", 71.0));
        pizzaMenu.add(new Pizza("25. Napoli: Tomatsauce, ost, ansjoser, kapers og oregano", 54.0));
        pizzaMenu.add(new Pizza("26. Pescatora: Tomatsauce, ost, rejer, blæksprutter, tun og oregano", 66.0));
        pizzaMenu.add(new Pizza("27. Pollo: Tomatsauce, ost, kylling, champignon, løg og oregano", 61.0));
        pizzaMenu.add(new Pizza("28. Vegetariana: Tomatsauce, ost, champignon, løg, peberfrugt, oliven og oregano", 61.0));
        pizzaMenu.add(new Pizza("29. Montanara: Tomatsauce, ost, pølser, kartoffelskiver og oregano", 91.0));
        pizzaMenu.add(new Pizza("30. Romana: Tomatsauce, ost, skinke, artiskok, oliven og oregano", 71.0));
    }

    public void printMenu() {
        System.out.println("**Menuen**");
        for (Pizza pizza : pizzaMenu) {
            System.out.println(pizza);
        }
    }

    public double getPizzaPris(String navn) {
        for (Pizza pizza : pizzaMenu) {
            if (pizza.getNavn().contains(navn)) {
                return pizza.getPris();
            }
        }
        System.out.println("Pizza findes ikke");  // Hvis pizzaen ikke findes
        return -1;
    }
}
