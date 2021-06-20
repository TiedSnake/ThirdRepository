
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator
{

    
    public static void main(String[] args)
    {
        String s1 = getInput("Enter a numeric value :");
        String s2 = getInput("Enter a numeric value :");

        double result = addTwoValues(s1, s2);

        System.out.println("The answer is : " + result);

        double resultOfMultiple = addMultipleValue(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("the answer of addition for multiple values is : " + resultOfMultiple);
        
        double resultOfMultiple2 = SubtractMultipleValue(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("the answer of subtraction for multiple values is : " + resultOfMultiple2);
        
        double resultOfMultiple3 = MultiplyMultipleValue(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("the answer of mutliplication for multiple values is : " + resultOfMultiple3);
        
        double resultOfMultiple4 = DivideMultipleValue(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("the answer of Division for multiple values is : " + resultOfMultiple4);
    }

    //vararg
    private static double addMultipleValue(double... values)
    {
        double result1 = 0d;
        for (double element : values)
        {
            result1 += element;
        }
        return result1;
    }
    private static double SubtractMultipleValue(double... values)
    {
        double result2 = 0d;
        for (double element : values)
        {
            result2 -= element;
        }
        return result2;
    }
    
    private static double MultiplyMultipleValue(double... values)
    {
        double result3 = 1d;
        for (double element : values)
        {
            result3 *= element;
        }
        return result3;
    }
    
    private static double DivideMultipleValue(double... values)
    {
        double result4 = 1d;
        for (double element : values)
        {
            result4 /= element;
        }
        return result4;
    }
    
    private static double addTwoValues(String s1, String s2)
    {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
    }

    
    private static String getInput(String prompt)
    {
        BufferedReader stdin
                = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(prompt);
        System.out.flush();

        try
        {
            return stdin.readLine();
        } catch (Exception e)
        {
            return "Error : " + e.getMessage();
        }
    }
}
