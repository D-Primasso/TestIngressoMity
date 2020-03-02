package fase3.fase3;

import java.util.List;

public class StudentService {

    private StudentRepository repository = new StudentRepository();

    public StudentService()
    {
        System.out.println( "Student service called" );
    }

    public List<Student> getAllStudents()
    {
        return repository.getStudents();

    }

    public Student addStudent() {

        return repository.addStudent();
    }
}
