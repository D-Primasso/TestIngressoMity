package fase3.fase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentRepository {

    private MockDatabase mockDatabase = MockDatabase.getInstance();

    public StudentRepository() {
        System.out.println( "Student repository called" );
    }

    public List<Student> getStudents() {
        List<Student> studentList = null;
        Map<Long, Student> students = mockDatabase.getAllStudent();
        if ( students != null )
        {
            studentList = new ArrayList<Student>( students.values() );
        }
        return studentList;
    }

    public Student addStudent() {
        return mockDatabase.addStudent();
    }
    
}
