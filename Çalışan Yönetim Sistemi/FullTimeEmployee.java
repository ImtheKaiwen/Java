public class FullTimeEmployee extends Employee implements Payable{
    FullTimeEmployee(String name,String position){
        super(name,position);
        setSALARY(getSALARY());
    }

    @Override
    public double calc_salary() {
        return getSALARY();
    }

    @Override
    public void setSALARY(double SALARY) {
        super.setSALARY(SALARY);
    }
}
