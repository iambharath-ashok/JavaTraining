package javatraining.day2;

public class JavaOperatorsExample {

    public static void main(String[] args) {

        //1. Arithmetic Operators
        arithmeticOperators();

        //2. Relational Operators
        relationalOperators();

        //3. Logical Operators
        logicalOperators();

        //4. Bitwise Operators
        bitwiseOperators();

        //5. Ternary Operator
        ternaryOperator();

        //6. instanceof Operator
        instanceOfOperator();
    }

    private static void ternaryOperator() {
        int num = 10;
        if(num%2 == 0)  {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        String result = (num % 2 == 0) ? "Even" : "Odd"; // Ternary conditional operator
        System.out.println("Number is " + result);       // Number is Even (if num is even)
        // Number is Odd (if num is odd)
    }

    private static void bitwiseOperators() {
        int num1 = 5;  // Binary: 0000 0101
        int num2 = 3;  // Binary: 0000 0011
//        ------------------------------------
//                                0000 0110

        int bitwiseAnd = num1 & num2;   // Bitwise AND (0000 0001, which is 1 in decimal)
        int bitwiseOr = num1 | num2;    // Bitwise OR (0000 0111, which is 7 in decimal)
        int bitwiseXor = num1 ^ num2;   // Bitwise XOR (0000 0110, which is 6 in decimal)
        int bitwiseNot = ~num1;         // Bitwise NOT (1111 1010, which is -6 in decimal)
        System.out.println("Bitwise AND: " + (num1 & num2));              // Bitwise AND: 1
        System.out.println("Bitwise OR: " + (num1 | num2));               // Bitwise OR: 7
        System.out.println("Bitwise XOR: " + (num1 ^ num2));              // Bitwise XOR: 6
        System.out.println("Bitwise NOT: " + ~num1);                      // Bitwise NOT: -6
    }

    private static void logicalOperators() {
        boolean isTrue = true;
        boolean isFalse = false;

        boolean logicalAnd = isTrue && isFalse;  // Logical AND (false)
        boolean logicalOr = isTrue || isFalse;   // Logical OR (true)
        boolean logicalNot = !isTrue;   // Logical NOT (false)
        System.out.println("Logical AND: " + (isTrue && isFalse));         // Logical AND: false
        System.out.println("Logical OR: " + (isTrue || isFalse));          // Logical OR: true
        System.out.println("Logical NOT: " + !isTrue);                     // Logical NOT: false
    }

    private static void relationalOperators() {
        int num1 = 10;
        int num2 = 20;

        boolean isEqual = num1 == num2;  // Equal to (false)
        boolean isNotEqual = num1 != num2;  // Not equal to (true)
        boolean isGreater = num1 > num2;   // Greater than (false)
        boolean isLess = num1 < num2;      // Less than (true)
        boolean isGreaterOrEqual = num1 >= num2;  // Greater than or equal to (false)
        boolean isLessOrEqual = num1 <= num2;     // Less than or equal to (true)

        System.out.println("Is Equal: " + (num1 == num2));                 // Is Equal: false
        System.out.println("Is Not Equal: " + (num1 != num2));             // Is Not Equal: true
        System.out.println("Is Greater: " + (num1 > num2));                // Is Greater: false
        System.out.println("Is Less: " + (num1 < num2));                   // Is Less: true
        System.out.println("Is Greater or Equal: " + (num1 >= num2));      // Is Greater or Equal: false
        System.out.println("Is Less or Equal: " + (num1 <= num2));         // Is Less or Equal: true
    }

    private static void arithmeticOperators() {
        int a = 10;
        int b = 5;

        int sum = a + b;       // Addition (sum = 15)
        int difference = a - b;  // Subtraction (difference = 5)
        int product = a * b;    // Multiplication (product = 50)
        int quotient = a / b;   // Division (quotient = 2)
        int remainder = a % b;  // Modulus (remainder = 0)

        System.out.println("Sum: " + (a + b));             // Sum: 15
        System.out.println("Difference: " + (a - b));      // Difference: 5
        System.out.println("Product: " + (a * b));         // Product: 50
        System.out.println("Quotient: " + (a / b));        // Quotient: 2
        System.out.println("Remainder: " + (a % b));       // Remainder: 0
    }

    private static void instanceOfOperator() {
        Person person = new Student();
        if (person instanceof Student) {
            System.out.println("Person is a Student");
        } else {
            System.out.println("Person is not a Student");
        }
    }

    static class Person {
    }

    static class Student extends Person {
    }
}
