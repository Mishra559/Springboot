package in.ashokit.JdbcApp.EmpRepo;


import in.ashokit.JdbcApp.Employee.Emp;
import in.ashokit.JdbcApp.Utils.QueryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class EmpDao {

    JdbcTemplate jdbcTemplate;


   public EmpDao(JdbcTemplate jdbcTemplate) {
       this.jdbcTemplate = jdbcTemplate;
   }

    public void createTable() {
        jdbcTemplate.execute(QueryUtils.CREATE_TABLE);
    }

    public void saveEmployee(int empno, String ename, double sal, String dept) {
        try{
            jdbcTemplate.update(QueryUtils.TABLE_DATA, empno, ename, sal, dept);
        }
        catch(DuplicateKeyException e){
            System.out.println("Key Already Exists");
        }
    }
    public Emp getEmployeeById(int empno) {
       try{
           return jdbcTemplate.queryForObject(QueryUtils.SELECT_BY_ID,empno)
       }
    }

}
