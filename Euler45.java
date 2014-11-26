public class Euler45{
    
    private double pentagonal(double h){
        double p = (Math.sqrt(1+24*h)+1)/6;
        return p;
    }
    
    public static void main(String[] args){
        Euler45 next = new Euler45();
    
        double h;
        double p;
        
        for(long n = 144; n<10000000; n++){
            h = n*(2*n-1);
            p = next.pentagonal(h);
             
            if((int)p == p){
                System.out.println((int)h);
                break;
            }
        }
    }    
}