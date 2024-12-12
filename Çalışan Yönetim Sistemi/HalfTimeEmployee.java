public class HalfTimeEmployee extends Employee implements Payable{
    private float hours;
    private double cost;
    private int day;
    HalfTimeEmployee(String name, String position){
        super(name,position);
        setSALARY(calc_salary());
    }

    @Override
    public double calc_salary() {
        return cost * hours * day;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
