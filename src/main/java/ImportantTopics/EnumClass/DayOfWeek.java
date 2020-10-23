//: Class Enum simple

package ImportantTopics.EnumClass;

class Main {
    public static void main(String[] args) {

        DayOfWeek dayNow = new DayOfWeek(WeekDaysWithMood.MONDAY);
        dayNow.enterDayOfWeek();
            // Output: Today is Monday
    }
}

public class DayOfWeek {

    public WeekDaysWithMood weekDaysWithMood;

    public DayOfWeek(WeekDaysWithMood weekDaysWithMood) {
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
    }
}

enum WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}