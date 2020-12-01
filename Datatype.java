public class Datatype {
    public static void main(String[] args) {
        //primitive datatypes
        
            int age = 26; //The int data type allows values between -2,147,483,648 and 2,147,483,647, inclusive.

        /*The double primitive data type can help. double can hold decimals as well as very large and very small numbers. 
        The maximum value is 1.797,693,134,862,315,7 E+308, which is approximately 17 followed by 307 zeros. 
        The minimum value is 4.9 E-324, which is 324 decimal places! */
        // doubles can have decimal places:
            double price = 8.99;
            // doubles can have values bigger than what an int could hold:
            double gdp = 1223770000;

        //booleans are true or false values
            boolean javaIsACompiledLanguage = true;
            boolean javaIsACupOfCoffee = false;

        //char is ONE character in 'single' quotes
            char grade = 'A';
            char firstLetter = 'L';
            char punctuation = '!';

        //you can add variables together
            double addition = price + gdp;
            //can use parentheses to seperate operators
            double multipleOperators = price + (gdp - price);

        //modulo % (shows the remainder when dividing num1 by num2 )
            int cookiesBaked = 10;
            int cookiesLeftover = cookiesBaked % 3; //cookiesLeftover will be 1
            //can be used to find if the number is odd or even!
            7 % 2
            // 1, odd!
            8 % 2
            // 0, even!
            9 % 2
            // 1, odd!

        //String hold sequences of characters in "double" quotes
        String name = "Leah Brenny";

        // Greater than and Less than
            //used in boolean comparisons to return true or false
            double creditsEarned = 176.5;
            double creditsOfSeminar = 8;
            double creditsToGraduate = 180;
            boolean canGraduate = creditsEarned > creditsToGraduate;//will be false

        //Greater/Less than or Equal To
        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;
        double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
        boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;//false
        System.out.println(isChallengeComplete);
        System.out.println(totalRecommendedAmount);

        //Equals == and Not Equals != for numbers
            int songsA = 9;
            int songsB = 9;
            int albumLengthA = 41;
            int albumLengthB = 53;
            boolean sameNumberOfSongs = songsA == songsB; //true
            boolean differentLength = albumLengthA != albumLengthB; //true

        //.equals() to compare objects such as strings
            String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
            String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
            String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
            System.out.println(line1.equals(line2));//false
            System.out.println(line2.equals(line3));//true

        //String Concatenation
            int animals = 12;
            String species = "zebra";
            String zooDescription = "Our zoo has " + animals + " " + species + "s!";
            System.out.println(zooDescription);

        System.out.println(differentLength);
        System.out.println(sameNumberOfSongs);
        System.out.println(canGraduate);
        System.out.println(name);
    }
}
