import java.util.ArrayList;

public class PizzaMenu {
    private ArrayList<String> pizzaMenu;

    public PizzaMenu() {
        pizzaMenu = new ArrayList<>();
        pizzaMenu.add("1. Vesuvio: Tomatsauce, ost, skinke og oregano");
        pizzaMenu.add("2. Amerikaner: Tomatsauce, ost, oksefars og oregano");
        pizzaMenu.add("3. Cacciatore: Tomatsauce, ost, pepperoni og oregano");
        pizzaMenu.add("4. Carbona: Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano");
        pizzaMenu.add("5. Dennis: Tomatsauce, ost, skinke, pepperoni, cocktailpølser");
        pizzaMenu.add("6. Bertil: Tomatsauce, ost, bacon og oregano");
        pizzaMenu.add("7. Silvia: Tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano");
        pizzaMenu.add("8. Victoria: Tomatsauce, ost, skinke, ananas, champignon, løg og oregano");
        pizzaMenu.add("9. Toronfo: Tomatsauce, ost, skinke, bacon, kebab, chili og oregano");
        pizzaMenu.add("10. Capricciosa: Tomatsauce, ost, skinke, champignon og oregano");
        pizzaMenu.add("11. Hawai: Tomatsauce, ost, skinke, ananas og oregano");
        pizzaMenu.add("12. La Blissola: Tomatsauce, ost, skinke, rejer og oregano");
        pizzaMenu.add("13. Venezia: Tomatsauce, ost, skinke, bacon og oregano");
        pizzaMenu.add("14. Mafia: Tomatsauce, ost, pepperoni, bacon, løg og oregano");
        pizzaMenu.add("15. Parma: Tomatsauce, ost, parmaskinke, rucola og oregano");
        pizzaMenu.add("16. Quattro Stagioni: Tomatsauce, ost, skinke, champignon, artiskok og oliven");
        pizzaMenu.add("17. Diavola: Tomatsauce, ost, stærk salami, chili og oregano");
        pizzaMenu.add("18. Margherita: Tomatsauce, ost, tomatskiver og oregano");
        pizzaMenu.add("19. Quattro Formaggi: Tomatsauce, mozzarella, gorgonzola, parmesan, ricotta og oregano");
        pizzaMenu.add("20. Frutti di Mare: Tomatsauce, ost, rejer, muslinger, blæksprutter og oregano");
        pizzaMenu.add("21. Tonno: Tomatsauce, ost, tun, løg og oregano");
        pizzaMenu.add("22. Calzone: Tomatsauce, ost, skinke, champignon, indbagt og oregano");
        pizzaMenu.add("23. Mexicana: Tomatsauce, ost, oksekød, jalapeños, majs og oregano");
        pizzaMenu.add("24. Toscana: Tomatsauce, ost, skinke, bacon, løg og oregano");
        pizzaMenu.add("25. Napoli: Tomatsauce, ost, ansjoser, kapers og oregano");
        pizzaMenu.add("26. Pescatora: Tomatsauce, ost, rejer, blæksprutter, tun og oregano");
        pizzaMenu.add("27. Pollo: Tomatsauce, ost, kylling, champignon, løg og oregano");
        pizzaMenu.add("28. Vegetariana: Tomatsauce, ost, champignon, løg, peberfrugt, oliven og oregano");
        pizzaMenu.add("29. Montanara: Tomatsauce, ost, pølser, kartoffelskiver og oregano");
        pizzaMenu.add("30. Romana: Tomatsauce, ost, skinke, artiskok, oliven og oregano");
    }


    public ArrayList getPizzaMenu() {
        return pizzaMenu;
    }

    public void printMenu() {
        System.out.println("**Menuen**");
        for (String pizza : pizzaMenu) {
            System.out.println(pizza);
        }
    }
}