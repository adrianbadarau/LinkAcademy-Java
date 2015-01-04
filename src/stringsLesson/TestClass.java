package stringsLesson;

public class TestClass {

    public enum DaysOfWeek {

        MONDAY(1), THUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

        public int position;

        DaysOfWeek(int i) {
            this.position = i;
        }
    }
    //use of enumeration inside of main method
    public static void main(String[] args) {

        System.out.println(DaysOfWeek.FRIDAY.position);

    }
}
