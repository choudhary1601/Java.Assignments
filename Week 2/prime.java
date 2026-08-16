public class prime {
    static boolean isprime(int number){
        int c=2;
        if(number==1)
        return false;

        for(int i=2;i<number/2;i++){
            if(number%i==0){
                c++;
            }
        }
        
        if(c>2){
            System.out.println("the number is composite");
        }
        else{
            System.out.println("the number is prime");
        }

        return true;
    } 
}
