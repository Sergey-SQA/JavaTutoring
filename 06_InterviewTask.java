import org.testng.annotations.Test;
import java.util.ArrayList;


    /*Write a function that will take an array of daily temperature
     readings for 10 days, validates them (discard any that are outside of acceptable range)
     calculates and return the average temperature.

     Ex: (18, 12, 17, 9, 19, 2, 14, 8, 16, 10), acceptable range is [5, 25]*/

public class InterviewTask {

    ArrayList<Integer> arrDailyList = new ArrayList<Integer>();
    int[] arrDailyTemp = {18, 12, 17, 9, 19, 2, 14, 8, 16, 10};
    int minTemp = 5;
    int maxTemp = 25;

    public float calculateTemp(int[] arrDailyTemp, int minTemp, int maxTemp) {

        int sumArrList = 0;

        for (int dT : arrDailyTemp) {
            if (dT > 5 & dT < 25) {
                arrDailyList.add(dT);
            }
        }

        for (Integer x : arrDailyList) {
            sumArrList = sumArrList + x;
        }

        return sumArrList / arrDailyList.size();
    }

    @Test
    public void testName() {

        System.out.println(calculateTemp(arrDailyTemp, minTemp, maxTemp));

    }
}





