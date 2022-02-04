package test;

import java.util.*;
import java.util.stream.DoubleStream;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private int noteBooks;

    List<String> activities = new ArrayList<>(); public Student() { } public Student(String name, int gradeLevel, double gpa, String gender, int noteBooks, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.noteBooks = noteBooks;
        this.activities = activities;
    } public int getNoteBooks() { return noteBooks;
    } public void setNoteBooks(int noteBooks) {
        this.noteBooks = noteBooks;
    } public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    } public Student(String s) {
        this.name = s;
    } public String getGender() {
        return gender;
    } public void setGender(String gender) {
        this.gender = gender;
    } public String getName() {
        return name;
    } public void setName(String name) {
        this.name = name;
    } public int getGradeLevel() {
        return gradeLevel;
    } public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    } public double getGpa() {
        return gpa;
    } public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public List<String> getActivities() {
        return this.activities;
    } public void setActivities(List<String> activities) {
        this.activities = activities;
    } public void printListOfActivities() { System.out.println("List of Activities are : " + this.activities);
    } @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                '}';
    } public static List<Student> getAllStudents(){
        Student student1 = new Student("Adam",2,3.6, "male",10,Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Jenny",2,3.8,"female", 11,Arrays.asList("swimming", "gymnastics","soccer"));
        Student student3 = new Student("Emily",3,4.0,"female", 12,Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student("Dave",3,4.0,"male", 15,Arrays.asList("swimming", "gymnastics","soccer"));
        Student student5 = new Student("Sophia",4,3.5,"female",10, Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student("James",4,3.9,"male", 22,Arrays.asList("swimming", "basketball","baseball","football"));
        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }

    public static void main(String[] args) {
        List<String> resultActivities = new ArrayList<>();
        List<Student> allStudents = getAllStudents();
        /*allStudents.stream()
                .map(student -> student.getActivities())
                //.flatMap(activities -> )
                .forEach(activities -> {
                    activities.forEach(activity -> {
                        if(!resultActivities.contains(activity)) {
                            resultActivities.add(activity);
                        }
                    });
                });
        System.out.println("resultActivities = " + resultActivities);*/

        // sort student based on GPA
        /*allStudents.stream()
                .sorted((student1, student2) -> student1.getGpa() - student2.getGpa());*/

        Collections.sort(allStudents, new SortByGPA());
        System.out.println("allStudents = " + allStudents);


    }

    static class SortByGPA implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return (int)(s1.getGpa() - s2.getGpa());
        }
    }
}

