import java.util.Scanner;
class calculator
{
    public static void main(String[] args)
    {
        int num1,num2;
        char op;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Your Two Numbers:");
        num1=obj.nextInt();
        num2=obj.nextInt();
        System.out.println("Enter Your Operator(+ - * / %)");
        op=obj.next().charAt(0);
        switch(op)
        {
            case'+':
            System.out.println(num1+num2);
            break;
            case'-':
            System.out.println(num1-num2);
            break;
            case'*':
            System.out.println(num1*num2);
            break;
            case'/':
            System.out.println(num1/num2);
            break;
            case'%':
            System.out.println(num1%num2);
            break;
            default:
                System.out.println("Invalid Operator choosen");
        }
        System.out.println("***THANK YOU***");
    }
}