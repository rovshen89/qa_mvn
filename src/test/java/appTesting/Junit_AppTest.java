package appTesting;

import appCode.AppforTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Junit_AppTest {

    AppforTest atest = new AppforTest();

    @Test
    public void testSum() {
        int res;
        res = atest.sumNmbrs(1, 3);
        Assertions.assertEquals(5, res, "sum mismatch");
        System.out.println("@testSum method run");
    }

    @Test
    public void testString() {
        String result = atest.addString("Rov", "shen");
        Assertions.assertEquals(result, "Rov_shen", "String mismatch");
        System.out.println("@testString method run");
    }


}
