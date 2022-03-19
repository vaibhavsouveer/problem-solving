package commons;

import java.util.Comparator;

public class SortStudentByGPA implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
            if(a.gpa > b.gpa) return 1;
            if(a.gpa < b.gpa) return -1;
            return 0;
    }

}
