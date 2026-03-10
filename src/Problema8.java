import java.util.Arrays;

public class Problema8 {
    static class Student implements Comparable<Student> {
        String nume; int varsta; double nota;

        Student(String nume, int varsta, double nota) {
            this.nume = nume;
            this.varsta = varsta;
            this.nota = nota;
        }

        public String toString() {
            return nume + " " + varsta + " " + nota;
        }

        public int compareTo(Student o) {
            int c = nume.compareTo(o.nume);
            if (c != 0) 
                return c;
            c = Integer.compare(varsta, o.varsta);
            if (c != 0) 
                return c;
            return Double.compare(nota, o.nota);
        }
    }

    static void afisare(Student[] s) {
        for (Student x : s) 
            System.out.println(x);
    }

    public static void main(String[] args) {
        Student[] s = {
            new Student("Maria",  20, 9.5),
            new Student("Andrei", 19, 8.7),
            new Student("Maria",  20, 7.8),
            new Student("Andrei", 20, 9.2),
            new Student("Ioana",  19, 9.5),
            new Student("Maria",  19, 8.5),
            new Student("Bogdan", 21, 8.0)
        };

        System.out.println("Initial:");
        afisare(s);

        Student[] a = s.clone();
        System.out.println("\nDupa nume:");
        Arrays.sort(a, (x, y) -> x.nume.compareTo(y.nume));
        afisare(a);

        a = s.clone();
        System.out.println("\nDupa varsta:");
        Arrays.sort(a, (x, y) -> Integer.compare(x.varsta, y.varsta));
        afisare(a);

        a = s.clone();
        System.out.println("\nDupa nota:");
        Arrays.sort(a, (x, y) -> Double.compare(x.nota, y.nota));
        afisare(a);

        a = s.clone();
        System.out.println("\nSimultan (nume->varsta->nota):");
        Arrays.sort(a);
        afisare(a);
    }
}
