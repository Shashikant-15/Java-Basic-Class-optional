package com.knoldus.kup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.lang.System.out;

     /**
     * Represents a Main Application Implementation class.
     */
public final class MainApplicationImplementation {
    private MainApplicationImplementation() {
    }
     /**
     * main() method for the application.
     * @param argument associated to accept arguments.
     */
    public static void main(final String[] argument) {
        final int rollNumberOfStudent1 = 1;
        final int rollNumberOfStudent2 = 2;
        final int rollNumberOfStudent3 = 3;
        final int rollNumberOfStudent4 = 4;
        final int rollNumberOfStudent5 = 5;
        final int rollNumberOfStudent6 = 6;
        final int rollNumberOfStudent7 = 7;
        final int rollNumberOfStudent8 = 8;
        final int rollNumberOfStudent9 = 9;
        final int rollNumberOfStudent10 = 10;

        Student std1 = new Student(
                "Deepak", rollNumberOfStudent1, Optional.of("Python"));
        Student std2 = new Student(
                "Shivam", rollNumberOfStudent2, Optional.empty());
        Student std3 = new Student(
                "Prakhar", rollNumberOfStudent3, Optional.empty());
        Student std4 = new Student(
                "Vaishali", rollNumberOfStudent4, Optional.of("Java"));
        Student std5 = new Student(
                "Raju", rollNumberOfStudent5, Optional.of(".NET"));
        Student std6 = new Student(
                "Bhavya", rollNumberOfStudent6, Optional.of("React"));
        Student std7 = new Student(
                "Pratibha", rollNumberOfStudent7, Optional.of("JavaScript"));
        Student std8 = new Student(
                "Krishna", rollNumberOfStudent8, Optional.of("Python"));
        Student std9 = new Student(
                "Harsh", rollNumberOfStudent9, Optional.of("PHP"));
        Student std10 = new Student(
                "Raj", rollNumberOfStudent10, Optional.of("SpringBoot"));
    //   * It's used to Creating student list.
        Optional<List<Student>> studentList = Optional
                .of(Arrays.asList(std1, std2, std3, std1));
    //   * It's used to Creating a student list.
        Optional<List<Student>> studentList2 = Optional
                .of(Arrays.asList(std4, std5, std6,
                        std7, std9, std10, std8));
    //   * It's used to Creating classroom list.
        List<ClassRoom> classRooms = new ArrayList<>();
        classRooms.add(new ClassRoom("J1001", studentList));
        classRooms.add(new ClassRoom("xyz", studentList2));
        classRooms.add(new ClassRoom("J1004", Optional.empty()));
    //  It's used to  Printing hello students if given room having students.
        String finalString = classRooms.get(1).hasStudents();
        out.println(finalString);
    //  * It's used to Finding students without subjects.
        List<Student> studentsWithoutSubject = classRooms
                .get(0).toGetStudentsWithoutSubject();
        out.println("\nStudent List Without subject: ");
        studentsWithoutSubject.forEach(out::println);
    //   * Finding distinct subjects of students associated with room id "xyz".
        List<Optional<String>> subjectsList = classRooms.get(1)
                .toGetDistinctSubjectsThroughRoomId("xyz");
        out.println("\nDistinct Subject List of ClassRoom xyz: ");
        subjectsList.forEach(out::println);
    }
}
