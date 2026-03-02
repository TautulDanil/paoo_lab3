public class Problema2 {
    static class Stiva
    {
    private int[] vector;
    private int varf;

    public Stiva()
    {
        this.vector = new int[100];
        this.varf = -1;
    }
    public Stiva(int dimensiune)
    {
        this.vector = new int[dimensiune];
        this.varf = -1;
    }
    public void push(int valoare)
    {
        if(varf >= vector.length - 1)
        {
            System.out.print("Eroare! Stiva este plina!");
            return;
        }
        varf++;
        vector[varf] = valoare;
        System.out.println("Adaugat " + valoare);
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Eroare! Stiva este goala!");
            return 0;
        }
        int valoare = vector[varf];
        varf--;
        System.out.println("Scos: " + valoare);
        return valoare;
    }
    public boolean isEmpty()
    {
        return varf == -1;
    }
    public void afisareStiva() {
        if (isEmpty()) {
            System.out.println("Stiva este goală.");
            return;
        }
        System.out.print("Stiva: ");
        for (int i = 0; i <= varf; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }    

    }
    public static void main(String[] args) {
        System.out.println("***** Testare Stiva (dimensiune implicită 100) ****");
        Stiva s1 = new Stiva();
        
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.afisareStiva();
        
        s1.pop();
        s1.afisareStiva();
        
        System.out.println("Stiva este goală? " + s1.isEmpty());
        
        s1.pop();
        s1.pop();
        s1.pop(); 
        System.out.println("Stiva este goală? " + s1.isEmpty());
        
        System.out.println("\n**** Testare Stiva (dimensiune 3) **** ");
        Stiva s2 = new Stiva(3);
        
        s2.push(100);
        s2.push(200);
        s2.push(300);
        s2.push(400); 
        s2.afisareStiva();
        
        s2.pop();
        s2.pop();
        s2.pop();
        s2.pop(); 
    }
}
