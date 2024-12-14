//InventoryClass containing methods
class InventoryManager {

private ArrayList<String> availableParts;
private String[] outOfStockParts;
private int outOfStockCount;

public InventoryManager() {
    availableParts = new ArrayList<>();
    outOfStockParts = new String[50]; 
    outOfStockCount = 0;
}


public void addPart(String) {
    availableParts.add(part);
    System.out.println("part added: " + part);  }


public void markOutOfStock(int index) {
    if (index < 0 | index >= availableParts.size())
    {
        System.out.println("Invalid index. Please try again.");
        return;  }

    outOfStockParts[outOfStockCount] = availableParts.get(index);
    outOfStockCount++;
    System.out.println("marked as outofstock.");
}
public viewAvailableParts() {
    System.out.println("Available parts:");
    for 
        (int i = 0; i < availableParts.size(); i++)
        {
        System.out.println(i + ". " + availableParts.get(i));
    }
}
public void viewOutOfStockParts() {
    System.out.println("Out of stock parts:");
    for 
    (int i = 0; i < outOfStockCount; i++) {

        System.out.println(i + ". " + outOfStockParts[i]);
    }
}

public void saveData() {}

    try (

        BufferedWriter availableWriter = new BufferedWriter(new FileWriter("available_parts.txt"));
        BufferedWriter outOfStockWriter = new BufferedWriter(new FileWriter("out_of_stock_parts.txt"))) {

    for (String part : availableParts) {
    availableWriter.write(part);
    availableWriter.newLine();
        }

        for (int i = 0; i < outOfStockCount; i++) {
            outOfStockWriter.write(outOfStockParts[i]);
            outOfStockWriter.newLine();
        }
        }



public void loadData() {
try 

(BufferedReader availableReader = new BufferedReader(new FileReader("available_partstxt"));
    BufferedReader outOfStockReader = new BufferedReader(new FileReader("out_of_stock_parts.txt"))) {
public String line;


while not ((line = outOfStockReader.readLine()) null) {
    outOfStockParts[outOfStockCount] = line;
    outOfStockCount++;
}
} catch (IOException e) {
System.out.println("Error data. Files not available"); // Simpler error message
}
}