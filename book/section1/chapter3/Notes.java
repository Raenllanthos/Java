package book.section1.chapter3;

import java.text.NumberFormat;

public class Notes
{
    public static void main(String[] args)
    {
        /*-----------------------------------------------------------------------------------|
        | TYPE   |   BYTES   |    USE                                                        |
        | -----------------------------------------------------------------------------------|
        | byte      1           Integers +/- 127                                             |
        | short     2           Integers +/- 32767                                           |
        | int       4           Integers +/- 2,147,483,647                                   |
        | long      8           Integers +/- 9,223,372,036,854,775,807                       |
        |                       (long x = 2000L)       lowercase L is bad!!!                 |
        | float     4           Single-precision, floating-point numbers from +/- 3.4e+38    |
        |                        with up to 7 significant digits                             |
        |                        (float x = 2000.00F)                                        |
        | double    8           Double-precision, floating-point numbers from +/- 1.7e+308   |
        |                        with up to 16 significant digits                            |
        | char      2           A single Unicode character that is stored in two bytes       |
        | boolean   1           A true or valse value                                        |
        |-----------------------------------------------------------------------------------*/

        /* Java Constants are declared by (and preferred like)
                    -->     final type NAME_OF_CONSTANT
        visually long numbers like 1000000 can be declared as
                            int million = 1_000_000 for readitbility */

        /*  Casting from less precise to more precise data types
        byte -> short -> int -> long -> float -> double -> char -> boolean

        double grade = 93;              convert int to double
        int grade = (int) 93.75;        convert double to int (grade = 93)
        
        char letterChar = 65;           convert int to char (letterChar = "A")
        char letterChar2 = (char) 65;   this works also
        int letterInt = "A";            convert char to int (letter Int = 65)
        int letterInt = (int) "A";      this works also
        */
    
        /*-----------------------------------------------------------------------------------|
        |                   *** 3 static methods of NumberFormat ***                         |
        |------------------------------------------------------------------------------------|
        |    getCurrencyInstance()              Has the default currency format ($99,999.99) |
        |    getPercentInstance()               Has the default percent format (99%)         |
        |    getNumberInstance()                Has the default number format (99,999.99)    |
        |------------------------------------------------------------------------------------|
        |                   *** 3 methods of a NumberFormat object ***                       |
        |------------------------------------------------------------------------------------|
        |    format(anyNumberType)               Returns a String object that has the        |
        |                                        format specified by the NumberFormat object |
        |    setMinimumFractionDigits(int)       Sets the minimum number of decimal places   |
        |    setMaximumFractionDigits(int)       sets the maximum number of decimal places   |
        |-----------------------------------------------------------------------------------*/
        
        // The Currency format
        double price = 11.575;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceString = currency.format(price);
        System.out.println("Price Double: " + price);
        System.out.println("Price String: " + priceString + "\n");

        // The percent format
        double majority = .505;
        NumberFormat percent = NumberFormat.getPercentInstance();
        String majoirtyString = percent.format(majority);
        System.out.println("Majority Double: " + majority);
        System.out.println("Majority String: " + majoirtyString + "\n");

        // The number format (one decimal place)
        double miles = 15341.253;
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(1);
        String milesString = number.format(miles);
        System.out.println("Miles Double: " + miles);
        System.out.println("Miles String: " + milesString);

        // Two NumberFormat methods that are coded in one statement
        // String majorityString = NumberFormat.getPercentInstance().format(majority)

        /*--------------------------------------------------------------| 
        |                       java.lang.Math                          |
        |---------------------------------------------------------------|
        |       Some common static methods of the Java Math Class       |
        |    they are used like Math.round(number), Math.power(n,p),    |
        |                    Math.sqrt(n), and so on                    |
        |---------------------------------------------------------------|
        | round(floatOrDouble)          Returns the long value to a     |
        |                            double value or the closet int to  |
        |                            a float value.                     |
        | pow(number, power)        Cullen's Definition - takes the     |
        |                            number and times itself by what    |
        |                            power is there. Like if pow(5,3)   |
        |                            then 5 * 5 * 5.                    |
        | sqrt(number)              Cullen's Definition - Finds the     |
        |                            square root of the number          |
        | max(a,b)                  C's D - Finds the greater between   |
        |                            'a' and 'b'                        |
        | min(a,b)                  C's D - Same as above but           |
        |                                    lesser number              |
        | random()                  Returns a double value greater      |
        |                        than or equal to 0.0 and less than 1.0 |
        |--------------------------------------------------------------*/

        // --------------------------------------------------------------------------

        /*-----------------------------------------------------------------------------|
        |                   Constructors for Integers and Doubles                      |
        | --------------------        ------------------     ------------------        |
        |       Integer(Int)                                   Double(double)          |
        |------------------------------------------------------------------------------|
        |                   Two Static Methods of the Integer Class                    |
        | ---------------------      ----------------------       -----------------    |
        | parseInt(stringName)          Attempts to convert the String objct that's    |
        |                                supplied as an argument to an int type. If    |
        |                                successful, it returns the int value. If      |
        |                                unsuccessful, it throws an exception.         |
        | toString(intName)             Converts int to a String.                      |
        |------------------------------------------------------------------------------|
        |                   Two Static Methods of the Double Class                     |
        | ------------     ---------------      --------------      --------------     |
        | parseDouble(stringName)           Converts String to Double if possible.     |
        | toString(doubleName)              Converts Double to String                  |
        |-----------------------------------------------------------------------------*/
        /*-----------------------------------------------------------------------------|
        |                                 Examples                                     |
        | Integer quantityIntegerObject = new Integer(quantity);                       |
        | Double priceDoubleObject = new Double(price);                                |
        |                                                                              |
        | STring conterString = Integer.toString(counter);                             |
        | STring priceSTring Double.toSTring(price);                                   |
        |                                                                              |
        | int quantity = Integer.parseInt(quantityString);                             |
        | double price = Dpible.parseDouble(priceSTring);                              |
        |-----------------------------------------------------------------------------*/

        // ----------------------------------------------------------------------------
        // When converting Strings to numbers, use Big Decimals instead

        /*-----------------------------------------------------------------------------|
        |                    Big Decimals --> java.math.BigDecimal                     |
        |------------------------------------------------------------------------------|
        | BigDecimal(int)                       Create BigDecimal from an int          |
        | BigDecimal(double)                    Create BigDecimal from a double        |
        | BigDecimal(long)                      Create BigDecimal from a long          |
        | BigDecimal(String)                    Create BigDecimal from a String        |
        |------------------------------------------------------------------------------|
        | add(value)          Returns the value of BigDecimal after it has been added  |
        | compareTo(value)                   Compares two BigDecimals, and returns     |
        |                                    -1 if less, 0 if equal, or 1 if greater   |
        | divide(value, sacle, rounding-mode)         Divides two BigDecimals with     |
        |                                            set scale and rounding mode       |
        | multiply(value)                    multiplies 2 BigDecimals                  |
        | setScale(scale, rounding-mode)     Sets a scale and a rounding mode          |
        | subtract(value)                   Subtracts 2 BigDecimals                    |
        | toString()                        BigDecimal to a String                     |
        |------------------------------------------------------------------------------|
        |       The Rounding Mode --- RoundingeMode.HALF_UP/HALF_EVEN                  |
        | HALF_UP                               rounds toward nearest neighbor,        |
        |                                        if equidistant, rounds up             |
        | HALF_EVEN                             rounds toward nearest neighbor,        |
        |                                        if equidistant, rounds to neighbor    |
        |------------------------------------------------------------------------------|
        |             salesTax = salesTax.setScale(2, RoundingMode.HALF_UP)            |
        |-----------------------------------------------------------------------------*/
    }
}