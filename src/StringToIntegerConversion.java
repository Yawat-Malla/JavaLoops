public class StringToIntegerConversion {
    public static void main(String[] args) {
        String numericString = "12345";  // Numeric string to convert
        int numericInteger1 = Integer.parseInt(numericString);  // Using parseInt
        Integer numericInteger2 = Integer.valueOf(numericString);  // Using valueOf

        // Print the converted integers
        System.out.println(numericString);
        System.out.println("Parsed integer using parseInt: " + numericInteger1*2);
        System.out.println("Parsed integer using valueOf: " + numericInteger2);
    }
}
