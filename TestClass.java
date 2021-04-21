import org.testng.annotations.Test;

public class TestClass {
//works with an object
    @Test
    public void testName() throws CloneNotSupportedException {

        FirstClass obj1 = new FirstClass("Alpha", 1963);
        FirstClass obj2 = new FirstClass("Beta");

        System.out.println(obj1.getName()+" serial number is "+obj1.getSerialNo());
        System.out.println(obj2.getName()+" serial number is "+obj2.getSerialNo());

        obj2.setYearOfManuf(1987);

        System.out.println(FirstClass.agePrint(obj1));
        System.out.println(FirstClass.agePrint(obj2));
        System.out.println(FirstClass.compareAge(obj1, obj2));

        FirstClass.counterPrint();
        System.out.println("GitHub added");

    }

}
