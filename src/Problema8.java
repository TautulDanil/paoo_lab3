import java.util.Arrays;

public class Problema8 {
    static class Student implements Comparable<Student> {
        String n; int v; double g; // nume, varsta, nota
        Student(String n, int v, double g) { this.n=n; this.v=v; this.g=g; }
        public String toString() { return n+" "+v+" "+g; }
        public int compareTo(Student o) {
            int c=n.compareTo(o.n); if(c!=0)return c;
            c=Integer.compare(v,o.v); if(c!=0)return c;
            return Double.compare(g,o.g);
        }
    }
    
    public static void main(String[] args) {
        Student[] s = {
            new Student("Maria",20,9.5), new Student("Andrei",19,8.7),
            new Student("Maria",20,7.8), new Student("Andrei",20,9.2),
            new Student("Ioana",19,9.5), new Student("Maria",19,8.5),
            new Student("Bogdan",21,8.0)
        };
        
        System.out.println("Initial:"); for(Student x:s) System.out.println(x);
        
        // a) Individual
        System.out.println("\nDupa nume:");
        Student[] a=s.clone(); Arrays.sort(a,(x,y)->x.n.compareTo(y.n));
        for(Student x:a) System.out.println(x);
        
        System.out.println("\nDupa varsta:");
        a=s.clone(); Arrays.sort(a,(x,y)->Integer.compare(x.v,y.v));
        for(Student x:a) System.out.println(x);
        
        System.out.println("\nDupa nota:");
        a=s.clone(); Arrays.sort(a,(x,y)->Double.compare(x.g,y.g));
        for(Student x:a) System.out.println(x);
        
        // b) si c) Simultaneu
        System.out.println("\nSimultan (nume->varsta->nota):");
        a=s.clone(); Arrays.sort(a);
        for(Student x:a) System.out.println(x);
    }
}