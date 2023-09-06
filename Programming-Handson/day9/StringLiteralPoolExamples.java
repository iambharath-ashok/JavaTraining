package javatraining.day9;

public class StringLiteralPoolExamples {

    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "Hello1";
//        str1 = "Hello World";

        Object o1 = new Object();
        Object o2 = new Object();

//        System.out.println("Str1: "+ str1.hashCode());
//        System.out.println("Str2: "+ str2.hashCode());
//        System.out.println(str1 == str2);

//        String str1 = new String("bharath");
//        String str2 = "bharath";
//        str1 = str1.intern();
//
//        System.out.println(str1 == str2);

//        String str1 = "Hello";
//        String str2 = "World";
//        String str3 = "HelloWorld";
//        String str4 = str1 + str2;
//
//        str4 = str1.concat(str2).intern();
//
//        //str4 =  new String("HelloWorld");
//
//        System.out.println("String1: "+ str1 + " String2: "+str2);
//       System.out.println(str3 == str4);

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1 == str2);

        str2 = "Hello";


    }
}
