import appCode.AppCode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitAppTest {

    AppCode atest = new AppCode();

    @Test
    public void testSum() {
        int res;
        //SoftAssert class

        res = atest.sumInt(1, 2);
        Assertions.assertEquals(res, 3, "Sum mismatch");
        System.out.println("First assertion complete");

//        Assertions.assertEquals(res, 5, "Sum mismatch");

        System.out.println("Second assertion complete");


    }

    @Test
    public void testString() {
        //Assert
        String res = atest.concatString("Rovshen", "Nurybayev");
        Assertions.assertEquals(res, "Rovshen_Nurybayev", "String mismatch");
        System.out.println("Test String method");
    }

    /*@Test
    public void testArray(){
        int[] arrRes = {1,2,3,4};
        int[] arrAct = atest.getArray();
        Assertions.assertEquals(arrAct, arrRes, "Array mismatch");
        System.out.println("Array method");
    }*/

}
