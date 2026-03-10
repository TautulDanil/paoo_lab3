public class Problema3 {
    static class Matrice {
        private int n;
        private double[][] data;
        
        public Matrice(int n) 
        { 
            this.n = n; 
            data = new double[n][n]; 
        }
        public Matrice(Matrice m) 
        { 
            this(m.n); 
            for(int i=0;i<n;i++) 
                for(int j=0;j<n;j++) 
                    data[i][j]=m.data[i][j]; 
        }
        
        public void set(int i,int j,double v) 
        { 
            data[i][j]=v; 
        }
        public double get(int i,int j) 
        { 
            return data[i][j]; 
        }
        
        public Matrice adunare(Matrice m) {
            if(n!=m.n) 
            {
                System.out.print("dimensiuni incompatibile");
                return null;
            }
            Matrice r=new Matrice(n);
            for(int i=0;i<n;i++) 
                for(int j=0;j<n;j++) 
                    r.data[i][j]=data[i][j]+m.data[i][j];
            return r;
        }
        
        public Matrice inmultire(Matrice m) {
            if(n!=m.n)
            {
                System.out.print("dimensiuni incompatibile");
                return null;
            }
            Matrice r=new Matrice(n);
            for(int i=0;i<n;i++) 
                for(int j=0;j<n;j++) 
            {
                double s=0;
                for(int k=0;k<n;k++) 
                    s+=data[i][k]*m.data[k][j];
                r.data[i][j]=s;
            }
            return r;
        }
        
        public Matrice putere(int exp) {
            if(exp<0)
            {
                System.out.print("Exponent negativ");
                return null;
            }
            if(exp==0) 
                { 
                    Matrice I=new Matrice(n);
                    for(int i=0;i<n;i++) 
                        I.data[i][i]=1; 
                    return I; 
                }
            Matrice r=new Matrice(this);
            for(int i=1;i<exp;i++) 
                r=r.inmultire(this);

            return r;
        }
        
public String toString() {
    String s = "";
    for (double[] row : data) {
        for (double val : row)
            s += String.format("%8.2f", val);
        s += "\n";
    }
    return s;
}
    }
    
    public static void main(String[] args) {
        Matrice A=new Matrice(2), B=new Matrice(2);
        A.set(0,0,1); 
        A.set(0,1,2); 
        A.set(1,0,3); 
        A.set(1,1,4);
        B.set(0,0,5); 
        B.set(0,1,6); 
        B.set(1,0,7); 
        B.set(1,1,8);
        
        System.out.println("A:\n"+A);
        System.out.println("B:\n"+B);
        System.out.println("A+B:\n"+A.adunare(B));
        System.out.println("A*B:\n"+A.inmultire(B));
        System.out.println("A^2:\n"+A.putere(2));
        System.out.println("A^3:\n"+A.putere(3));
        System.out.println("A^0:\n"+A.putere(0));
    }
}
