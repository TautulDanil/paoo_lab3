public class Problema1 {
    static class Complex{
        private double real;
        private double imag;
        public Complex()
            {
                this.real = 0;
                this.imag = 0;
            }
        public Complex(double real,double imag)
            {
                this.real = real;
                this.imag = imag;
            }
        public double getReal()
            {
                return real;
            }
        public double getImag()
            {
                return imag;
            }
        public Complex adunare(Complex c)
            {
                return new Complex(this.real + c.real,this.imag + c.imag);
            }

        public Complex inmultire(Complex c)
            {
                double r = this.real * c.real - this.imag*c.imag;
                double i = this.real * c.imag + this.imag * c.real;
                return new Complex(r,i);
            }
        public Complex putere(int exponent)
            {
                if(exponent < 0)
                {
                    return null;
                }
                Complex rezultat = new Complex(1,0);
                for(int i = 0; i < exponent; i++)
                {
                    rezultat = rezultat.inmultire(this);
                }
                return rezultat;
            }

        public boolean Equal(Object obj)
            {
                if(this == obj)
                    return true;
                if(obj == null || getClass() != obj.getClass())
                    return false;
                Complex c = (Complex) obj;
                return Double.compare(c.real,real) == 0 &&
                Double.compare(c.imag,imag) == 0;
            }

        public String toString()
            {
                return "(" + real + "," + imag + ")";
            }

    }
    public static void main(String[] args) throws Exception 
    {
        Complex c1 = new Complex(3,2);
        Complex c2 = new Complex(1,4);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        System.out.println("c1 + c2 = " + c1.adunare(c2));
        System.out.println("c1 * c2 = " + c1.inmultire(c2));
        System.out.println("c1^3" + c1.putere(3));

        Complex c3 = new Complex(3,2);
        System.out.println("c1 = c3? " + c1.Equal(c3));
        System.out.println("c1 = c2? " + c1.Equal(c2));
    }
}

