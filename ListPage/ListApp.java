import java.awt.*;

public class ListApp {
    public static void main(String[] args) {
        Frame frame = new Frame("Reminders");

        // Set dark mode background
        frame.setBackground(Color.BLACK);
        frame.setLayout(new BorderLayout());

        // Top Summary Panel
        Panel summaryPanel = new Panel(new GridLayout(2, 3, 10, 10));
        summaryPanel.setBackground(Color.BLACK);

        summaryPanel.add(createTile("Today", Color.decode("#1E88E5"), "1"));
        summaryPanel.add(createTile("Scheduled", Color.decode("#EF5350"), "1"));
        summaryPanel.add(createTile("All", Color.DARK_GRAY, "8"));
        summaryPanel.add(createTile("Flagged", Color.decode("#FFB300"), "0"));
        summaryPanel.add(createTile("Completed", Color.GRAY, ""));

        // Center My Lists Panel
        Panel listPanel = new Panel(new GridLayout(4, 1));
        listPanel.setBackground(Color.BLACK);
        listPanel.add(createListItem("Events", Color.RED, "1"));
        listPanel.add(createListItem("Shopping", new Color(222, 184, 135), "7"));  // light brown
        listPanel.add(createListItem("Assignment", Color.ORANGE, "0"));
        listPanel.add(createListItem("Tasks", new Color(138, 43, 226), "0"));  // blue-violet

        // Bottom Button Panel
        Panel bottomPanel = new Panel(new FlowLayout());
        bottomPanel.setBackground(Color.BLACK);
        Button newReminder = new Button("+ New Reminder");
        newReminder.setForeground(Color.BLUE);
        newReminder.setBackground(Color.BLACK);
        Button addList = new Button("Add List");
        addList.setForeground(Color.BLUE);
        addList.setBackground(Color.BLACK);
        bottomPanel.add(newReminder);
        bottomPanel.add(addList);

        // Add panels to frame
        frame.add(summaryPanel, BorderLayout.NORTH);
        frame.add(listPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setSize(400, 600);
        frame.setVisible(true);
    }

    static Panel createTile(String title, Color color, String count) {
        Panel tile = new Panel(new BorderLayout());
        tile.setBackground(Color.DARK_GRAY);
        Label label = new Label(title + " " + count, Label.CENTER);
        label.setForeground(color);
        tile.add(label, BorderLayout.CENTER);
        return tile;
    }

    static Panel createListItem(String name, Color iconColor, String count) {
        Panel listItem = new Panel(new BorderLayout());
        listItem.setBackground(Color.BLACK);
        Label label = new Label(name + "   " + count);
        label.setForeground(Color.WHITE);
        listItem.add(label, BorderLayout.CENTER);
        return listItem;
    }
}