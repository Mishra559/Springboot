package in.ashokit.app.repository;


import in.ashokit.app.model.Employee;
import in.ashokit.app.query.Querys;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Repository
public class EmpDao {

    JdbcTemplate jdbcTemplate;

    public EmpDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void create(){
        jdbcTemplate.execute(Querys.CREATE_TABLE);
        System.out.println("Table created");
    }

    public int put(int empno, String ename, double sal, String dept) {
        return jdbcTemplate.update(Querys.PUT_VALUES,empno,ename,sal,dept);
    }

    public List<Employee> getAll(){
        RowMapper<Employee> empRowMapper = (rs,rowNum) -> {
            Employee emp = new Employee();
            emp.setEmpno(rs.getInt("empno"));
            emp.setEname(rs.getString("ename"));
            emp.setSal(rs.getDouble("sal"));
            emp.setDepartment(rs.getString("department"));
            return emp;
        };
        return jdbcTemplate.query(Querys.FIND_ALL,empRowMapper);
    }


    public Set<Employee> findAll(){
        Set<Employee> empSet = new LinkedHashSet<>();
        ResultSetExtractor<Set<Employee>> empRowMapper = rs -> {
            int count = 1;
            while(rs.next()){
                if(count % 2 == 1){
                    Employee emp = new Employee();
                    emp.setEmpno(rs.getInt("empno"));
                    emp.setEname(rs.getString("ename"));
                    emp.setSal(rs.getDouble("sal"));
                    emp.setDepartment(rs.getString("department"));
                    empSet.add(emp);
                }
                count++;
            }
            return empSet;

        };
        return jdbcTemplate.query(Querys.FIND_ALL,empRowMapper);
    }
}
