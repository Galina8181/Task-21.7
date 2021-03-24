package Calculator;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        int value2 = scanner.nextInt();

        int result = 0;

        if (operation == '+'){
            result = value1 + value2;
        }
         else if(operation == '-'){
           result = value1 - value2;
        }
         else if (operation =='*'){
             result = value1 * value2;

         }else if (operation == '/'){
             result = value1 / value2;
        }

        System.out.println(result);


    }

}