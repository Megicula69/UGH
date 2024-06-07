package ordersystem;

import javax.swing.*;


public class CategoryMenuFrame extends JFrame {
    private String category;
    private Menu menu;

    public CategoryMenuFrame(String category, Menu menu) {
        this.category = category;
        this.menu = menu;
        initialize();
    }

    private void initialize() {
        setTitle(category + " Menu");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null); // Use the same layout as the main JFrame

        // You can add any common design elements here (e.g., headers, footers)

        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (MenuItem item : menu.getMenuItems()) {
            if (item.getCategory().equalsIgnoreCase(category)) {
                listModel.addElement(item.toString());
            }
        }

        JList<String> itemList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(itemList);
        scrollPane.setBounds(10, 50, 760, 500); // Adjust as needed to fit your design

        add(scrollPane);
    }
}
