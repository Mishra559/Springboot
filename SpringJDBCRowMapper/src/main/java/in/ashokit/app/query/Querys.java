package in.ashokit.app.query;

public class Querys {

    public static final String CREATE_TABLE = "CREATE TABLE EMP(" +
            "EMPNO INT," +
            "ENAME VARCHAR(30)," +
            "SAL DOUBLE,"+
            "DEPARTMENT VARCHAR(30),"+
            "PRIMARY KEY(EMPNO))";

    public static final String PUT_VALUES = "INSERT INTO EMP VALUES (?,?,?,?)";

    public static final String FIND_ALL = "SELECT * FROM EMP";


}
