package module03.task3;

import java.time.Month;
import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(96, 9, 1);     // Sept. 1, 1996
//        Course course01 = new Course(calendar.getTime(), "Chemistry");
//        calendar.set(96, 10, 1);    // Oct. 1, 1996
//        Course course02 = new Course(calendar.getTime(), "Biology");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1996, Month.SEPTEMBER.getValue(), 1);    // Sept. 1, 1996
        Course course01 = new Course(calendar.getTime(), "Chemistry");
        calendar.set(1996, Month.OCTOBER.getValue(), 1);      // Oct. 1, 1996
        Course course02 = new Course(calendar.getTime(), "Biology");


        Course course03 = new Course(16, "English", "Jameson");
        Course course04 = new Course(16, "Philosophy", "Wesson");
        Course course05 = new Course(32, "Mathematics", "Smith");

        Course[] arrayOfCourses1 = {course02, course05};
        Course[] arrayOfCourses2 = {course03};
        Course[] arrayOfCourses3 = {course01, course02, course04, course05};

        Student student06 = new Student("John", "Smith", 2);
        Student student07 = new Student("Dickinson", arrayOfCourses1);

        CollegeStudent collegeStudent08 = new CollegeStudent("Kent", "Stuart", 1);
        CollegeStudent collegeStudent09 = new CollegeStudent("Freeman", arrayOfCourses2);
        //   CollegeStudent collegeStudent10 = new CollegeStudent("Andrew", "Daniels", 3, arrayOfCourses3, 21, "Springfield", 5, 123456);
        CollegeStudent collegeStudent10 = new CollegeStudent("Andrew", "Daniels", 3, "Springfield", 5, 123456);

        SpecialStudent specialStudent11 = new SpecialStudent("Catherine", "Sparrow", 2);
        SpecialStudent specialStudent12 = new SpecialStudent("Fisherman", arrayOfCourses3);
        //   SpecialStudent specialStudent13 = new SpecialStudent(123457);
        SpecialStudent specialStudent13 = new SpecialStudent("Fox", "Mulder", 123457);
    }
}
