public abstract class Employee {
    private String NAME;
    private double  SALARY;
    private String POSITION;

    Employee(String NAME, String POSITION){
        this.NAME = NAME;
        this.POSITION = POSITION;
    }
    public double getSALARY() {
        return SALARY;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setSALARY(double SALARY) {
        this.SALARY = SALARY;
    }

    public String getPOSITION() {
        return POSITION;
    }

    public void setPOSITION(String POSITION) {
        this.POSITION = POSITION;
    }

}
