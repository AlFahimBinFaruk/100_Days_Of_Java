package Operators;

public class BitwiseOpr {

    public static void main(String[] args) {
        System.out.println("*********Running Bitwise operator.***********");
        
        /**
         *To know more
         *Read this =>https://www.w3schools.in/java/operators/bitwise
         *Watch this =>https://www.youtube.com/watch?v=TllHVJGEY5A.  
         */
        
        //Variables Definition and Initialization
        int num1 = 32, num2 = 24, num3 = 0;

        //Bitwise AND
        /*
  1.it will convert both num1 and num2 to binary
  2.in case of & it will multiply(*) the binary data and the result will be in binary
  3.then it will convert that binary result into decimal which will be the final result
  
         */
        System.out.println("num1 & num2 = " + (num1 & num2));

        //Bitwise OR
        /*1.it will convert both num1 and num2 to binary
  2.in case of | it will add(+) the binary data and the additon result will be in binary
  3.then it will convert that binary result into decimal which will be the final result
         */
        System.out.println("num1 | num2 = " + (num1 | num2));

        //Bitwise XOR
        /*1.it will convert both num1 and num2 to binary
  2.in case of ^ it will add(+) the binary data and the additon result will be in binary
  3.then it will convert that binary result into decimal which will be the final result
         */
        System.out.println("num1 ^ num2 = " + (num1 ^ num2));

        //Binary Complement Operator
        System.out.println("~num1 = " + ~num1);

        //Binary Left Shift Operator
        num3 = num1 << 2;
        System.out.println("num1 << 1 = " + num3);

        //Binary Right Shift Operator
        num3 = num1 >> 2;
        System.out.println("num1 >> 1  = " + num3);

        //Shift right zero fill operator
        num3 = num1 >>> 2;
        System.out.println("num1 >>> 1 = " + num3);
    }
}
