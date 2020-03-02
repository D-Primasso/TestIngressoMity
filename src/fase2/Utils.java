package fase2;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

class Utils {

    List<Student> createListStudent(int nStudenti, int yearMin, int yearMax, int gradeMin, int gradeMax){
        List<Student> studentList = new ArrayList<Student>();

        for (int i = 0; i<nStudenti; i++){
            String birthDay = generateRandomDate(yearMin,yearMax);
            String grades = generateRandomGrades(gradeMin,gradeMax);
            studentList.add(new Student("NomeStudente"+i,"CognomeStudente"+i, birthDay, grades));
        }
        return studentList;
    }

    private String generateRandomDate(int start, int end){

        int years = start + new Random().nextInt(end-start);
        boolean bisestile = ( (years%400==0) || (years%4==0 && years%100!=0));
        int month = 1 + new Random().nextInt(12);
        int day = 0;

        switch (month){

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 1 + new Random().nextInt(31);
                break;
            case 4: case 6: case 9: case 11:
                day = 1 + new Random().nextInt(30);
                break;
            case 2:
                if (bisestile){
                    day = 1 + new Random().nextInt(29);
                } else {
                    day = 1 + new Random().nextInt(28);
                }
                break;
        }

        return day+"/"+month+"/"+years;
    }

    private String generateRandomGrades(int start, int end){
        return start + new Random().nextInt(end+1) + "";
    }

    int age(Student student) throws ParseException {

        Locale.setDefault(Locale.ITALY);
        LocalDate today = LocalDate.now();
        LocalDate birthDateC = convertStringToCalendar(student.getBirthDateS());

        return Period.between(birthDateC,today).getYears();
    }

    private LocalDate convertStringToCalendar(String date) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        return LocalDate.parse(date, formatter);
    }

    String avgGrade(List<Student> students){
        int totalGrades = 0;
        for (Student student : students){
            totalGrades += Integer.parseInt(student.getGrades());
        }
        return totalGrades/students.size()+"";
    }
}
