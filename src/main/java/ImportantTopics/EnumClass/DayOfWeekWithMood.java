//: Class Enum middle
//      methods: valueOf();
//               values();

package ImportantTopics.EnumClass;

import java.util.Arrays;

class MainSecond {
    public static void main(String[] args) {

        DayOfWeekWithMood dayMood = new DayOfWeekWithMood(WeekDaysWithMood.MONDAY);
        dayMood.enterDayOfWeek();
            // Output: Go to work
            //         Mood this day is bad

        System.out.println(dayMood.weekDaysWithMood);
            // Output: MONDAY

        WeekDaysWithMood mood1 = WeekDaysWithMood.SATURDAY;
        WeekDaysWithMood mood2 = WeekDaysWithMood.MONDAY;
        WeekDaysWithMood mood3 = WeekDaysWithMood.MONDAY;

        System.out.println("-----");
        System.out.println(mood2 == mood3);  // true
        System.out.println(mood1 == mood3);  // false
        System.out.println("-----");
        System.out.println(mood2.equals(mood3));  // true
        System.out.println(mood1.equals(mood3));  // false

//        WeekDaysWithMood value = WeekDaysWithMood.valueOf("Monday"); // Exception: IllegalArgumentException
        WeekDaysWithMood value = WeekDaysWithMood.valueOf("MONDAY");
        System.out.println(value);
            // Output: MONDAY

        WeekDaysWithMood[] array = WeekDaysWithMood.values();
        System.out.println(Arrays.toString(array));
            // Output: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]

    }
}

public class DayOfWeekWithMood {

    public WeekDaysWithMood weekDaysWithMood;

    public DayOfWeekWithMood(WeekDaysWithMood weekDaysWithMood) {
        this.weekDaysWithMood = weekDaysWithMood;
    }

    public void enterDayOfWeek() {
        switch(weekDaysWithMood) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to work");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Sleep, eat, play");
                break;
        }
        System.out.println("Mood this day is " + weekDaysWithMood.getMood());
    }
}

enum WeekDaysWithMood {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY,         // empty constructor
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY;

    private String mood;

    WeekDaysWithMood() {
        // empty
    }

    WeekDaysWithMood(String mood) {  // only "private"
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}