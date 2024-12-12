import java.security.spec.ECField;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Company company = new Company();
        boolean run = true;
        Employee employee1 = new Manager("Kaiwen");
        Employee employee2 = new Cleaner("Berat");
        Employee employee3 = new SoftwareEngineer("Hayrünnisa");
        Employee[] employees = {employee1,employee2,employee3};
        for (Employee e: employees){
            company.add(e);
        }
        while (run) {
            menu.mainMenu();
            int choice = -1;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    menu.listMenu();
                    try {
                        System.out.println("Enter choice:");
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice) {
                            case 1:
                                company.list("all");
                                break;
                            case 2:
                                company.list("Cleaner");
                                break;
                            case 3:
                                company.list("Manager");
                                break;
                            case 4:
                                company.list("Software Engineer");
                                break;
                            default:
                                System.out.println("Invalid");
                                break;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input.");
                        scanner.nextLine();
                    }
                    break;
                case 2:
                    menu.addMenu();
                    try {
                        System.out.println("Enter choice:");
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter Name :");
                        String name = scanner.nextLine();
                        switch (choice) {
                            case 1:
                                company.add(new Manager(name));
                                break;
                            case 2:
                                company.add(new Cleaner(name));
                                break;
                            case 3:
                                company.add(new SoftwareEngineer(name));
                                break;
                            default:
                                System.out.println("Invalid");
                                break;
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input.");
                        scanner.nextLine();
                    }
                    break;
                case 3:
                    System.out.println("Enter name:");
                    scanner.nextLine(); 
                    String name = scanner.nextLine();
                    System.out.println("Enter pos:");
                    String pos = scanner.nextLine();
                    company.delete(name, pos);
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }
}
