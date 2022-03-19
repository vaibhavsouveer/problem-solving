package commons;

import java.util.*;
import java.util.stream.Collectors;

public class Student implements Comparable{
    public String name;
    public int gradeLevel;
    public double gpa;
    public String gender;
    public List<String> activities;

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }

    public static void main(String[] args) {
        // for a list of students, get all activities they are involved in
        System.out.println("resultActivities = " + getAllStudents().stream()
                .flatMap(student -> student.activities.stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList())
                );

        // sort student based on GPA
        /*System.out.println("Sorted list of students bases on GPA is \n" + allStudents.stream()
                .sorted(new SortByGPA())
        .collect(Collectors.toList()));*/

        /*
        Collections.sort(allStudents, new SortByGPA());
        System.out.println("allStudents = " + allStudents);
        */


    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Student)o).name);
    }

    static class SortByGPA implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            if(s1.gpa == s2.gpa) return 0;
            if(s1.gpa > s2.gpa) return 1;
            return -1;
        }
    }

    public static List<Student> getAllStudents(){
        Student student1 = new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Jenny",2,3.8,"female",Arrays.asList("swimming", "gymnastics","soccer"));
        Student student3 = new Student("Emily",3,4.0,"female",Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student("Dave",3,4.0,"male",Arrays.asList("swimming", "gymnastics","soccer"));
        Student student5 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student("James",4,3.9,"male",Arrays.asList("swimming", "basketball","baseball","football"));
        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                '}';
    }
}

