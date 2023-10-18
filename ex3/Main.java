package ex3;

public class Main {
    public static void main(String[] args) {
        // Crearea unui student
        Student student = new Student("John", "Doe", "1234567890");

        // Adăugarea unor discipline și note
        student.adaugareDisciplina("Matematica", "Prof. A", 9);
        student.adaugareDisciplina("Fizica", "Prof. B", 8);
        student.adaugareDisciplina("Chimie", "Prof. C", 7);

        // Afișarea informațiilor despre student și media sa
        System.out.println("Informații despre student:");
        System.out.println(student);

        // Afișarea mediei
        System.out.println("Media studentului: " + student.calculMedie());
    }
}

