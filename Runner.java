  public class Runner 
// main class
public static void main(String[] args) 
{
InventoryManager system = new InventoryManager();
system.loadData(); 


Scanner scanner = new Scanner(System.in);

int choice;

do {
    System.out.println("Inventory Menu:");
    System.out.println("Add a part");
    System.out.println(" Mark part as out-of-stock");
    System.out.println("View available parts");
    System.out.println("View out of stock parts");
    System.out.println("Save and Exit");
    System.out.print("Choose an option: ");

 choice = InputValidator.getUserInput(scanner);
        scanner.nextLine(); 

switch (choice) 

    {
case 1 -> {
       System.out.print("Enter part name: ");
    String part = scannr.nextLine();
        system.addPart(part);
    
    {
    
    case 2 -> {
        system.viewAvailableParts();
        System.out.print("Enter part code to mark as out of stock: ");
        int index = InputValidator.getUserInput(scanner);
        system.markOutOfStock(index);    }

    case 3 -> system.viewAvailableParts();
    case 4 -> system.viewOutOfStockParts();
    case 5 -> 
            default -> System.out.println("Invalid choice. Please try again.");
        }

} while (choice != 5);

        scanner.close();
    }
}