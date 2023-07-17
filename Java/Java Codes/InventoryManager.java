import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javafx.application.*;;

class Computer implements Comparable<Computer> {

    private String manufacturer;
    private int ramSize;
    private int hardDiskSize;

    public Computer(String manufacturer, int ramSize, int hardDiskSize) {
        this.manufacturer = manufacturer;
        this.ramSize = ramSize;
        this.hardDiskSize = hardDiskSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getHardDiskSize() {
        return hardDiskSize;
    }

    @Override
    public boolean equals(Object o) 
    {
        if(o instanceof Computer) 
        {
            Computer c = (Computer) o;
            return this.manufacturer.equals(c.manufacturer) &&
                    this.ramSize == c.ramSize &&
                    this.hardDiskSize == c.hardDiskSize;
        }
        return false;
    }

    @Override
    public int compareTo(Computer c) {
        int result = this.getManufacturer().compareTo(c.getManufacturer());
        if (result == 0) {
            result = Integer.compare(this.getHardDiskSize(), c.getHardDiskSize());
        }
        return result;
    }

}

class InventoryManager {

    public static void addComputer(ArrayList<Computer> inventory, Scanner scanner) {
        System.out.println("Enter manufacturer name:");
        String manufacturer = scanner.next();
        System.out.println("Enter RAM size:");
        int ramSize = scanner.nextInt();
        System.out.println("Enter hard disk capacity:");
        int hardDiskSize = scanner.nextInt();

        Computer newComputer = new Computer(manufacturer, ramSize, hardDiskSize);
        if (inventory.contains(newComputer)) {
            System.out.println("This computer is already in the inventory!");
        } else {
            inventory.add(newComputer);
            System.out.println("Computer added to inventory!");
        }
    }

    public static void removeComputer(ArrayList<Computer> inventory, Scanner scanner) {
        System.out.println("Enter manufacturer name:");
        String manufacturer = scanner.next();
        System.out.println("Enter RAM size:");
        int ramSize = scanner.nextInt();
        System.out.println("Enter hard disk capacity:");
        int hardDiskSize = scanner.nextInt();

        Computer toRemove = new Computer(manufacturer, ramSize, hardDiskSize);
        if (inventory.remove(toRemove)) {
            System.out.println("Computer removed from inventory!");
        } else {
            System.out.println("This computer is not in the inventory!");
        }
    }

    public static void displayInventory(ArrayList<Computer> inventory) {
        Collections.sort(inventory);
        System.out.println("Manufacturer\tRAM Size\tHard Disk Capacity");
        for (Computer computer : inventory) {
            System.out.println(computer.getManufacturer() + "\t\t" + computer.getRamSize() + " GB" + "\t\t" + computer.getHardDiskSize() + " GB");
        }
    }
}

class CompInv {

	public static void main(String[] args) {
	
		ArrayList<Computer> inventory = new ArrayList<Computer>();
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
		    System.out.println("Please enter your choice (1-4):");
		    System.out.println("1. Add computer details");
		    System.out.println("2. Remove computer details");
		    System.out.println("3. Display complete inventory in sorted order of manufacturer and hard disk");
		    System.out.println("4. Exit");
		    choice = scanner.nextInt();
		    switch (choice) {
		        case 1:
		            InventoryManager.addComputer(inventory, scanner);
		            break;
		        case 2:
		            InventoryManager.removeComputer(inventory, scanner);
		            break;
		        case 3:
		            InventoryManager.displayInventory(inventory);
		            break;
		        case 4:
		            System.out.println("Exiting program...");
		            break;
		        default:
		            System.out.println("Invalid choice!");
		    }
		} while (choice != 4);

		scanner.close();
	}

}