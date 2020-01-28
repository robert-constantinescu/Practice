package Exercises;

public class a002_ValidPhoneNumber {

    public static void main(String[] args) {
        String number = "(abc) 456-7890";
        String number2 = "(1111)555 2345";
        String number3 = "(098) 123 4567";

        System.out.println(validPhoneNumber(number));
        System.out.println(validPhoneNumber(number2));
        System.out.println(validPhoneNumber(number3));

        System.out.println("optimal");

        System.out.println(validPhoneNumberOptimal(number));
        System.out.println(validPhoneNumberOptimal(number2));
        System.out.println(validPhoneNumberOptimal(number3));

    }

    public static boolean validPhoneNumberOptimal(String phoneNumber) {
        boolean isValid = phoneNumber.matches("(\\(\\d{3}\\)) \\d{3}-\\d{4}");
        return isValid;
    }


    public static boolean validPhoneNumber(String phoneNumber) {
        // TODO: Return whether phoneNumber is in the proper form
        boolean validFormat;
        boolean onlyDigits = false;
        boolean correctLength = phoneNumber.length() == 14;

        char[] charachters = phoneNumber.toCharArray();
        boolean first = charachters[0] == '(';
        boolean second = charachters[4] == ')';
        boolean third = Character.isSpaceChar(charachters[5]);
        boolean fourth = charachters[9] == '-';

        validFormat = first && second && third && fourth;
        if(validFormat) {
            int countDigits = 0;
            for (char c : charachters) {
                if (Character.isDigit(c)) {
                    countDigits++;
                }
            }
            onlyDigits = countDigits == 10;
        }
        return validFormat && onlyDigits && correctLength;
    }

}
