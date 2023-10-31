package Homework2_Part2;

public class Wrappers {
    public static void main(String[] args) {
        Byte byteWrapper = 30; //автоупаковка
        Short shortWrapper = 1000;
        Integer intWrapper = new Integer(200000);
        Long longWrapper = new Long(331311L);
        Float floatWrapper = new Float(323.4f);
        Double doubleWrapper = new Double(234.24);
        Character charWrapper = new Character('f');
        Boolean booleanWrapper = new Boolean(true);

        System.out.println("byteWrapper - " + byteWrapper);
        System.out.println("shortWrapper - " + shortWrapper);
        System.out.println("intWrapper - " + intWrapper);
        System.out.println("longWrapper - " + longWrapper);
        System.out.println("floatWrapper - " + floatWrapper);
        System.out.println("doubleWrapper - " + doubleWrapper);
        System.out.println("charWrapper - " + charWrapper);
        System.out.println("booleanWrapper - " + booleanWrapper);
    }
}