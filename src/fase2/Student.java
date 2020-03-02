package fase2;

/**
 * Descrivi nel linguaggio di programmazione che preferisci un oggetto:
 * - `Student` con le seguenti proprietà: `firstname` : string, `lastname` : string, `birthdate` : string, `grades` : string
 * Crea dei metodi d'appoggio sul modello `Student` per calcolare `age` e `avg_grade`
 */
public class Student {

    private String firstName;
    private String lastName;
    private String birthDateS; // formato "d/MM/yyyy"
    private String grades;

    public Student(String firstName, String lastName, String birthDateS, String grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDateS = birthDateS;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDateS() {
        return birthDateS;
    }

    public void setBirthDateS(String birthDateS) {
        this.birthDateS = birthDateS;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }
}
