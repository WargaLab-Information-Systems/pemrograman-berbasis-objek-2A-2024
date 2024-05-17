    public class OperasiPembagian extends OperasiBilangan {
        protected void setA(double a){
            this.a = a;
        }
        protected void setB(double b){
            this.b = b;
        }
        protected void setC(double c){
            this.c = c;        
        }
        protected void setD(){
            this.d = a / b / c;
        }
        protected double getA(){
            return a;
        }
        protected double getB(){
            return b;
        }
        protected double getC(){
            return c;
        }
        protected double getD(){
            return d;
        }
        protected void Tampil(){
            System.out.println(a + " : " + b + " : " + c + "\t= " + d + "\n");
        }
}
