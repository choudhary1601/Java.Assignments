public class NumberReversal {
    static int reverseNumber(int number){
        if(number<0){
            return 0;
        }
        if(number==0){
            return 0;
        }

        int digit;
        int reversed=0;
        
        do{
            digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }while(number>0);

        return reversed;

        
    }
}
