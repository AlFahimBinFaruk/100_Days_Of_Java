package Operators;

public class AssignmentOpr {

    public static void main(String[] args) {
        System.out.println("Running Assignment operators");

        /*
         *Read this =>https://www.w3schools.com/java/java_operators.asp.
         */
        int num1;
//      01.=
        num1 = 33;
        System.out.println("Example of = =>" + num1);

//      02.+=
        num1 += 33;
        System.out.println("Example of += =>" + num1);

//      03.-=
        num1 -= 3;
        System.out.println("Example of -= =>" + num1);

//      04.*=
        num1 *= 5;
        System.out.println("Example of *= =>" + num1);

//      05./=
        num1 /= 3;
        System.out.println("Example of /= =>" + num1);

//      06.%=
        num1 %= 33;
        System.out.println("Example of %= =>" + num1);

        /**
         * ****
         * 07.And operator &= Example x &= 3 means x = x & 3. it will turn both
         * num3 and num4 into binary , then it will multiply then binay becoz it
         * is & then it will convert the binary into decimal which will be the
         * result. ****
         */
        int num3 = 66;
        int num4 = 55;
        num3 &= num4;//num3=num3 & num4
        System.out.println("Value of & is =>" + num3);

    }
}
