package fase2;

import java.text.ParseException;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        try {
            Utils utils = new Utils();
            int nStudenti = 10;
            int yearMin = 2000;
            int yearMax = 2005;
            int gradesMin = 0;
            int gradesMax = 30;

            //Creo una lista di studenti con data di nascita e grades random
            List<Student> studentsList = utils.createListStudent(nStudenti, yearMin, yearMax, gradesMin, gradesMax);

            //Stampo età di uno studente random
            Student student = studentsList.get(new Random().nextInt(nStudenti));
            System.out.println("Studente: " + student.getFirstName() + " " + student.getLastName() + ", Età : " + utils.age(student) + ", Grades: " + student.getGrades());

            //Stampo AVGGrades
            System.out.println("Il grades medio è: " + utils.avgGrade(studentsList));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
