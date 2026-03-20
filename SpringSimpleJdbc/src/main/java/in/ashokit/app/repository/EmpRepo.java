package in.ashokit.app.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmpRepo {

    @Autowired
    SimpleJdbcCall simpleJdbcCall;

    public double getBonus(int empid) {
        simpleJdbcCall.withFunctionName("bonus_function");

        Map<String,Integer> inMap = new HashMap<>();
        inMap.put("empid", empid);

        Map<String,Object> outMap = simpleJdbcCall.execute(inMap);

        return (Double) outMap.get("return");

    }

}
