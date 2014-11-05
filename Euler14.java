public class Euler14 {
    
    public int collatzChain(long n){
        int chainLen = 0;
        while(n>1){
            if(n%2 == 0){
                n /= 2;
        }
            else{
                n = (n*3)+1;
            }
            
            chainLen++;
        }
        return(chainLen+1);
    }

    public static void main(String[] args){
    
        Euler14 start = new Euler14();
        long x;
        long bigChain = 0;
        long bigStart = 0;
        
        for(long i = 0; i <=999999; i++){
            x = start.collatzChain(i);
            if(x > bigChain){
                bigChain = x;
                bigStart = i;
            }
        }
        System.out.println(bigStart);
    }
}
