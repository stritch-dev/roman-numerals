package com.monktowntech.converter;

public class Converter {

    static String I = "I";
    static String V = "V";
    static String X = "X";
    static String L = "L";
    static String C = "C";
    static String D = "D";
    static String M = "M";

    static int _I = 1;
    static int _V = 5;
    static int _X = 10;
    static int _L = 50;
    static int _C = 100;
    static int _D = 500;
    static int _M = 1000;

    /**
     * This function uses the '+' operator. For rational see implementation note at https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
     *
     * @param numberToConvert
     * @return
     */
    public static String convert(final int numberToConvert) {
        String romanNumeral = "";
        if (numberToConvert > _V) {
            throw new UnsupportedOperationException("Not implemented for >5");
        } else if (numberToConvert == _V - 1) {
            romanNumeral = I + V;
        } else if (numberToConvert == _V) {
            romanNumeral = V;
        } else {
            for (int i = 0; i < numberToConvert; i++) {
                romanNumeral += I;
            }
        }

        return romanNumeral;
    }
}
