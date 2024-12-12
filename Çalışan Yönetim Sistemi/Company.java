import java.util.LinkedList;

public class Company {
    private LinkedList<Employee> employees = new LinkedList<>();

    public void add(Employee employee){
        employees.add(employee);
        System.out.println("Succesfully Added");
    }

    public void delete(String name, String pos){
        for (Employee employee: employees){
            if(employee.getNAME().toLowerCase().equals(name.toLowerCase()) && employee.getPOSITION().toLowerCase().equals(pos.toLowerCase())){
                employees.remove(employee);
                System.out.println("Successfully Removed");
                return;
            }
        }
        System.out.println("Failed");
    }

    public void list(String pos){
        if(pos.equals("all")){
            for (Employee employee: employees){
                System.out.println("Name :"+employee.getNAME()+" Salary :"+employee.getSALARY()+" Pos :"+employee.getPOSITION());
            }
            return;
        }
        for (Employee employee: employees){
            if (employee.getPOSITION().equals(pos)){
                System.out.println("Name :"+employee.getNAME()+" Salary :"+employee.getSALARY()+" Pos :"+employee.getPOSITION());
            }
        }
    }
}
