import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {
    //Creating an object for the method arithematicLogic
    arithematicLogic a = new arithematicLogic();

    @Test
    public void addTwoNumber(){

        int sum = a.getSum(10,20);
        Assert.assertEquals(30,sum);
    }

    @Test
    public void mulTwoNumber(){
        int res = a.getMul(10,20);
        Assert.assertEquals(200, res);
    }

    @Test
    public void subTwoNumber(){
        int subRes = a.getSub(10,5);
        Assert.assertEquals(5,subRes);
    }
}
