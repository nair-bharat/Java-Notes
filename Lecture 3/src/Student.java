import java.util.List;

public class Student {
    Course english;
    // one to one: A student can have 1 course

    List<Course> courseList;
    // one to many: A student can have list of courses
    // many to many: Student can have list of courses


    // has a relationship is of 2 types:

    /*
    * Aggregation: Both objects can survive individually - means ending of one object will not end other object
    * Composition: Ending of one object will end another object
    *
    * Aggregation eg:
    *
    *   class School {
    *       List<Student> studList;
    *   }
    *
    * // if we delete one, it will not impact other(can exist independently)
    *
    * Composition eg:
    *   Schools and Rooms
    *
    *
    * */
}
