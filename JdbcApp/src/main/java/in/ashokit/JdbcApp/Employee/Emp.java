package in.ashokit.JdbcApp.Employee;

public class Emp {
    private int empno;
    private String ename;
    private double sal;
    private String department;


    public Emp(int empno, String ename, double sal, String department) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                ", department='" + department + '\'' +
                '}';
    }
}
