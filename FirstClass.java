import java.util.Date;

public class FirstClass {

    private String name;
    private int yearOfManuf;
    private int serialNo;

    private static int objectCounter;

    public FirstClass(String name, int yearOfManuf) {
        this.name = name;
        this.yearOfManuf = yearOfManuf;
        objectCounter++;
        serialNo = objectCounter;
    }

    public FirstClass(String name) {
        this.name = name;
        objectCounter++;
        serialNo = objectCounter;
    }

    public String getName() {
        return name;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setYearOfManuf(int yearOfManuf) {
        this.yearOfManuf = yearOfManuf;
    }

    public static void counterPrint() {
        System.out.println("*** objects created in total: "+objectCounter+" ***");
    }

    public int calculateAge() {
        Date today = new Date();
        return (today.getYear()+1900) - yearOfManuf;
    }

    public static String agePrint (FirstClass obj) {
        return  obj.name+" age is "+obj.calculateAge();
    }

    public static String compareAge (FirstClass obj1, FirstClass obj2) {
        if (obj1.calculateAge() < obj2.calculateAge()) {
            return obj1.name+" is " +(obj2.calculateAge()-obj1.calculateAge())+ " years newer than "+obj2.name;
        } else if (obj1.calculateAge() == obj2.calculateAge()) {
            return "Objects are peers";
        } else {
            return obj2.name+" is " +(obj1.calculateAge()-obj2.calculateAge())+ " years newer than "+obj1.name;
        }

    }

}
