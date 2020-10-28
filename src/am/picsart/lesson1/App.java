package am.picsart.lesson1;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        byte byteMinValue = -128;
        byte byteMaxValue = 127;
        short shortMinValue = -32_768;
        short shortMaxValue = 32_767;
        int intMinValue = -2_147_483_648;
        int intMaxValue = 2_147_483_647;
        long longMinValue = -9_223_372_036_854_775_808L;
        long longMaxValue = 9_223_372_036_854_775_807L;
        float floatVariable = 42.42f;
        double doubleVariable = 56.56;
        boolean booleanFalse = false;
        boolean booleanTrue = true;
        char charVariable = 'a';
        String stringVariable = "text";

        System.out.println("Range for a variable of type byte  from " + byteMinValue + " to " + byteMaxValue + " and takes 8-bit");
        System.out.println("Range for a variable of type short  from " + shortMinValue + " to " + shortMaxValue + " and takes 16-bit");
        System.out.println("Range for a variable of type int  from " + intMinValue + " to " + intMaxValue + " and takes 32-bit");
        System.out.println("Range for a variable of type long  from " + longMinValue + " to " + longMaxValue + " and takes 64-bit");
        System.out.println("Variable of type boolean can be " + booleanFalse + " or " + booleanTrue);
        System.out.println("Variable of type float takes 32-bit` " + floatVariable);
        System.out.println("Variable of type double takes 64-bit` " + doubleVariable);
        System.out.println("Variable of type double takes 64-bit` " + charVariable);
        System.out.println("String is an object `" + stringVariable);
    }

}
