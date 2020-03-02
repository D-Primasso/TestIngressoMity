package fase3.fase3;

import java.util.HashMap;
import java.util.Map;

public class MockDatabase{

        private static Map<Long, Student> students = new HashMap<Long, Student>();
        private static MockDatabase mockDatabase;

        static {
            mockDatabase = new MockDatabase();
        }

        private MockDatabase(){
        }

        public static MockDatabase getInstance() {
            System.out.println( "Getting db instance..." );
            return mockDatabase;
        }

        public Map<Long, Student> getAllStudent() {
            return students;
        }

        public Student addStudent() {
            long id = students.size() + 1;
            Student student = new Student("firstName","LastName");
            student.setId( id );
            students.put( id, student );
            return student;
        }

    }
