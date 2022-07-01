package core.collections.map;

import commons.Student;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class TreeMapPlayground {
    public static void main(String[] args) {
        Map<Integer, Student> map = getStudentMap();
        map.forEach((k, v) -> {
            System.out.println("key is = " + k + " and value is = " + v.name);
        });

    }

    private void getActivityList() {
        Map<Integer, Student> map = getStudentMap();

    }

    private static Map<Integer, Student> getStudentMap() {
        Map<Integer, Student> treeMap = new TreeMap<>();
        Student student1 = new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Jenny",2,3.8,"female",Arrays.asList("swimming", "gymnastics","soccer"));
        Student student3 = new Student("Emily",3,4.0,"female",Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student("Dave",3,4.0,"male",Arrays.asList("swimming", "gymnastics","soccer"));
        Student student5 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student("James",4,3.9,"male",Arrays.asList("swimming", "basketball","baseball","football"));
        treeMap.put(1, student1);
        treeMap.put(2, student2);
        treeMap.put(4, student5);
        treeMap.put(6, student6);
        treeMap.put(3, student3);
        treeMap.put(4, student4);
        return treeMap;
    }


}




    /*
        Map<Student, Integer> studentMapMap = getStudentMap();
        System.out.println("studentMapMap = " + studentMapMap);

        Map<Student, Integer> studentComparatorMap = getStudentComparatorMap(new SortStudentByGPA());
        System.out.println("studentComparatorMap = " + studentComparatorMap);

    private static Map<Integer, String> getMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "a");
        treeMap.put(2, "b");
        treeMap.put(5, "e");
        treeMap.put(6, "f");
        treeMap.put(3, "c");
        treeMap.put(4, "d");
        return treeMap;
    }

    private static Map<Student, Integer> getStudentMap() {
        // this gives exception at runtime because Student does not implement Comparable interface
        Map<Student, Integer> treeMap = new TreeMap<>();
        Student student1 = new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Jenny",2,3.8,"female",Arrays.asList("swimming", "gymnastics","soccer"));
        Student student3 = new Student("Emily",3,4.0,"female",Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student("Dave",3,4.0,"male",Arrays.asList("swimming", "gymnastics","soccer"));
        Student student5 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student("James",4,3.9,"male",Arrays.asList("swimming", "basketball","baseball","football"));
        treeMap.put(student1, 1);
        treeMap.put(student2, 2);
        treeMap.put(student3, 3);
        treeMap.put(student4, 4);
        treeMap.put(student5, 5);
        treeMap.put(student6, 6);
        return treeMap;
    }

    private static Map<Student, Integer> getStudentComparatorMap(Comparator comparator) {
        // in this the ordering is based on comparator passed in constructor
        Map<Student, Integer> treeMap = new TreeMap<>(comparator);
        Student student1 = new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Jenny",2,3.8,"female",Arrays.asList("swimming", "gymnastics","soccer"));
        Student student3 = new Student("Emily",3,4.0,"female",Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student("Dave",3,4.0,"male",Arrays.asList("swimming", "gymnastics","soccer"));
        Student student5 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student("James",4,3.9,"male",Arrays.asList("swimming", "basketball","baseball","football"));
        treeMap.put(student1, 1);
        treeMap.put(student2, 2);
        treeMap.put(student3, 3);
        treeMap.put(student4, 4);
        treeMap.put(student5, 5);
        treeMap.put(student6, 6);
        return treeMap;
    }
    */
