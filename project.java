import java.util.Scanner;

public class project {
    public static void main(String args[])
    {
        String input;
        int end,i,j;
        Scanner scan=new Scanner(System.in);
        System.out.print("Input : ");
        input=scan.next();
        System.out.println(input);
        end=input.length()-1;
        for(i=0;i<=end;i++)
        {
            for(j=0;j<=end;j++)
            {
                if(i==j || i+j==end)
                {
                    System.out.print(input.charAt(j));
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
