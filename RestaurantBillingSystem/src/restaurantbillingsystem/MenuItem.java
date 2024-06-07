package restaurantbillingsystem;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MenuItem {
    private String name;
    private double price;
    private String imagePath; // Path to image file or URL

    public MenuItem(String name, double price, String imagePath) {
        this.name = name;
        this.price = price;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getImagePath() {
        return imagePath;
    }
}