public class SoftwareEngineer extends HalfTimeEmployee{
    SoftwareEngineer(String name){
        super(name,"Software Engineer");
        setCost(800);
        System.out.println("800");
        setHours(8);
        setDay(22);
        setSALARY(calc_salary());
    }
}
