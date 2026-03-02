public class Problema3 {
    static class Matrix {
        private int n;
        private double[][] data;
        
        public Matrix(int n) { this.n = n; data = new double[n][n]; }
        public Matrix(Matrix m) { this(m.n); for(int i=0;i<n;i++) for(int j=0;j<n;j++) data[i][j]=m.data[i][j]; }
        
        public void set(int i,int j,double v) { if(i>=0&&i<n&&j>=0&&j<n) data[i][j]=v; }
        public double get(int i,int j) { return (i>=0&&i<n&&j>=0&&j<n)?data[i][j]:0; }
        
        public Matrix adunare(Matrix m) {
            if(n!=m.n) return null;
            Matrix r=new Matrix(n);
            for(int i=0;i<n;i++) for(int j=0;j<n;j++) r.data[i][j]=data[i][j]+m.data[i][j];
            return r;
        }
        
        public Matrix inmultire(Matrix m) {
            if(n!=m.n) return null;
            Matrix r=new Matrix(n);
            for(int i=0;i<n;i++) for(int j=0;j<n;j++) {
                double s=0;
                for(int k=0;k<n;k++) s+=data[i][k]*m.data[k][j];
                r.data[i][j]=s;
            }
            return r;
        }
        
        public Matrix putere(int e) {
            if(e<0) return null;
            if(e==0) { Matrix I=new Matrix(n); for(int i=0;i<n;i++) I.data[i][i]=1; return I; }
            Matrix r=new Matrix(this);
            for(int i=1;i<e;i++) r=r.inmultire(this);
            return r;
        }
        
        public String toString() {
            String s="";
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    s+=String.format("%8.2f", data[i][j]);
                }
                s+="\n";
            }
            return s;
        }
    }
    
    public static void main(String[] args) {
        Matrix A=new Matrix(2), B=new Matrix(2);
        A.set(0,0,1); A.set(0,1,2); A.set(1,0,3); A.set(1,1,4);
        B.set(0,0,5); B.set(0,1,6); B.set(1,0,7); B.set(1,1,8);
        
        System.out.println("A:");
        System.out.println(A);
        System.out.println("B:");
        System.out.println(B);
        System.out.println("A+B:");
        System.out.println(A.adunare(B));
        System.out.println("A*B:");
        System.out.println(A.inmultire(B));
        System.out.println("A^2:");
        System.out.println(A.putere(2));
        System.out.println("A^3:");
        System.out.println(A.putere(3));
        System.out.println("A^0:");
        System.out.println(A.putere(0));
    }
}