import java.util.Scanner;
public class datatype {
    public static Scanner Keyboard=new Scanner (System.in);
    public static void main(String[] args) {
       /*
       Joohan Kim
       First import and set scanner
       Then I will declare an integer
       Create 3 variables (int,double,string)
       Ask for number, double and string
       Add  integer with number asked into a new integer variable
       Add double number with the second number to make a new double variable
       combine string with the term from the scanner then make new string variable
       print the new integer variable
       print  new double variable
       print new string statement
       All three lines printed= done
       */
        int num1= 4;
        double d1= 4.0;
        String statement = "Greenhill";
        //These are my codes using Scanner for the use to type in their values
        System.out.print("Type your integer ");
        int integer= Keyboard.nextInt();//using int and next.int() to type integer
        System.out.print("Type your double: ");//using double and nextDouble() to type double
        double number= Keyboard.nextDouble();
        Keyboard.nextLine();
        System.out.print("Type new string:");//using  nextLine() to type new string
        String String1= Keyboard.nextLine();
        int variablenew = integer+num1;//new int variable
        double variable= d1+number;//double variable
        String stringnew= statement + String1;//code for the new string statement
        //Println Statements for the user
        System.out.println(variablenew);
        System.out.println(variable);
        System.out.println(stringnew);
    }
}
