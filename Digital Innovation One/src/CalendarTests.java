import java.util.Calendar;

public class CalendarTests {
    public static void main(String[] args) {
        Calendar limitDate = Calendar.getInstance();
        Calendar now = Calendar.getInstance();

        limitDate.set(2021, 03,  07, 16,33, 44);

        now.setFirstDayOfWeek(2);

        limitDate.add(Calendar.DAY_OF_MONTH, 10);

        int dayOfTheWeek = limitDate.get(Calendar.DAY_OF_WEEK);



        if(limitDate.before(now)) {
            System.out.println("Passou do vencimento!");
            if(dayOfTheWeek == 7 || dayOfTheWeek == 1) {
               int value = 2 - limitDate.get(Calendar.DAY_OF_WEEK);
               limitDate.add(Calendar.DAY_OF_MONTH, value);
            }

        }

    }


}
