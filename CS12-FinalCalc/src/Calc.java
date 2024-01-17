import java.util.Scanner;
import java.io.*;

// i have 0 idea how this wrks
public class Calc {

    public Calc(){//constructor

            Scanner input= new Scanner(System.in);
            Scanner one= new Scanner(System.in);
            Scanner two= new Scanner(System.in);

            System.out.println("texas instruments ");
            System.out.println("action:(+:add),(-:subtract),(x:multiply),(/:divide)");

            System.out.print("use:");//choose what u want to do
            String ip= input.next();// type input (its a string)
            System.out.println(ip);


            // takes the selected and runs the operation
            if (ip.equals("+")){// if you want to if() a string
                System.out.println("(add)");
                //need to finish the class ngl
            }
            if (ip.equals("-")){
                System.out.println("subtract");

        }
            if (ip.equals("x")){// if you want to if() a string
                System.out.println("multiply");

        }
            if (ip.equals("/")){// if you want to if() a string
                System.out.println("divide");

        }



            input.close();

        }

    }



