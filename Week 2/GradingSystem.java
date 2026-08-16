public class GradingSystem
{
    static String classifymark(int marks)
    {
        
        if(marks>=80&&marks<=100)
        {
            System.out.println("Distinction");
        }
        else if(marks>=70&&marks<=79)
        {
            System.out.println("Merit");
        }
        else if(marks>=50&&marks<=69)
        {
            System.out.println("Pass");
        }
        else if(marks>=0&&marks<=49)
        {
            System.out.println("Fail");
        }
        else{
            System.out.println("invalid marks");
        }
        System.out.println("\n");

        return "";
    }
}