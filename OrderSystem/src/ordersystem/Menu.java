package ordersystem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<>();
        initializeMenu();
    }

    private void initializeMenu() {
        // Appetizers
        menuItems.add(new MenuItem("Orange glazed meatballs", 12.00, "Appetizers"));
        menuItems.add(new MenuItem("Tortilla Pinwheels", 8.50, "Appetizers"));
        menuItems.add(new MenuItem("Burger", 10.00, "Appetizers"));
        menuItems.add(new MenuItem("Party Shrimp", 15.00, "Appetizers"));
        menuItems.add(new MenuItem("French Fries", 5.00, "Appetizers"));

        // Filipino
        menuItems.add(new MenuItem("Pork Bicol Express", 18.00, "Filipino"));
        menuItems.add(new MenuItem("Pork Sinigang", 16.00, "Filipino"));
        menuItems.add(new MenuItem("Chicken Adobo", 15.00, "Filipino"));
        menuItems.add(new MenuItem("Chicken Kaldereta", 20.00, "Filipino"));
        menuItems.add(new MenuItem("Kare-Kare", 22.00, "Filipino"));

        // Chinese
        menuItems.add(new MenuItem("Char Siu", 18.00, "Chinese"));
        menuItems.add(new MenuItem("Wonton Soup", 10.00, "Chinese"));
        menuItems.add(new MenuItem("Spring Rolls", 12.00, "Chinese"));
        menuItems.add(new MenuItem("Chow Mein", 15.00, "Chinese"));
        menuItems.add(new MenuItem("Peking Roast Duck", 25.00, "Chinese"));

        // Italian
        menuItems.add(new MenuItem("Trofie al pesto", 20.00, "Italian"));
        menuItems.add(new MenuItem("Lasagne", 18.00, "Italian"));
        menuItems.add(new MenuItem("Brodetto", 22.00, "Italian"));
        menuItems.add(new MenuItem("Risotto al pollo", 19.00, "Italian"));
        menuItems.add(new MenuItem("Pizza", 16.00, "Italian"));

        // Desserts
        menuItems.add(new MenuItem("Strawberry Creampie", 8.00, "Desserts"));
        menuItems.add(new MenuItem("Creme Brulee", 9.00, "Desserts"));
        menuItems.add(new MenuItem("Baked Alaska", 10.00, " Desserts"));
        menuItems.add(new MenuItem("Blueberry CheeseCake", 7.00, "Desserts"));
        menuItems.add(new MenuItem("Mango Graham Float", 8.00, "Desserts"));

        // Beverages
        menuItems.add(new MenuItem("Canned Softdrinks", 2.50, "Beverages"));
        menuItems.add(new MenuItem("Bottled Water", 1.50, "Beverages"));
        menuItems.add(new MenuItem("Case of Beer", 15.00, "Beverages"));
        menuItems.add(new MenuItem("Espresso Coffee", 3.50, "Beverages"));
        menuItems.add(new MenuItem("Orange juice", 3.00, "Beverages"));
        
        // Japanese
        menuItems.add(new MenuItem("Sushi", 2.50, "Japanese"));
        menuItems.add(new MenuItem("Udon", 1.50, "Japanese"));
        menuItems.add(new MenuItem("Tofu", 15.00, "Japanese"));
        menuItems.add(new MenuItem("Ramen", 3.50, "Japanese"));
        menuItems.add(new MenuItem("Tempura", 3.00, "Japanese"));
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}

