package in.ashokit.app.generator;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.util.IdGenerator;

import java.util.Random;

public class MyGenerator implements IdentifierGenerator {

    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
        Random random = new Random();
        int x1 = random.nextInt(10);
        int x2 = random.nextInt(10);
        int y1 = random.nextInt(10);
        int y2 = random.nextInt(10);
        String str = x1 + "" + y1 + "" + x2 + "" + y2;
        return Integer.parseInt(str);
    }

}
