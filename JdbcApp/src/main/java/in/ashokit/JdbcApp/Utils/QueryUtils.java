package in.ashokit.JdbcApp.Utils;

public class QueryUtils {

    public static final String CREATE_TABLE = " CREATE TABLE EMP(" +
            "EMPNO INT," +
            "ENAME VARCHAR(30)," +
            "SAL DOUBLE," +
            "DEPARTMENT VARCHAR(30)," +
            "PRIMARY KEY (EMPNO)" +
            ")";

    public static final String TABLE_DATA = "INSERT INTO EMP (EMPNO, ENAME, SAL, DEPARTMENT) VALUES (?, ?, ?, ?)";

    public static final String UPDATE_TABLE = "UPDATE EMP SET SAL = ? WHERE EMPNO = ?";

    public static final String SELECT_TABLE = "SELECT * FROM EMP";


    public static final String DELETE_TABLE = "DELETE FROM EMP WHERE EMPNO = ?";

    public static final String SELECT_BY_ID = "SELECT * FROM EMP WHERE EMPNO = ?";

    public static final String GET_COUNT = "SELECT COUNT(*) FROM EMP";
}
