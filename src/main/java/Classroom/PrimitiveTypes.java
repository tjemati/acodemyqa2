package Classroom;

public class PrimitiveTypes {
    public static void main(String[] args) {
//        Floating point Example
        float floateExample = 999999.8F;
        System.out.println(floateExample);
        System.out.println(999999.8F);

        double doubleExample = 2000000.988D;
        System.out.println(doubleExample);
        System.out.println(2000000.988D);

//        Integral exampe

//        Byte

        byte HandCount = 2;
        System.out.println(HandCount);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

//        Short

        short distanceBetweenKievAndRiga = 1011;
        System.out.println(distanceBetweenKievAndRiga);

//      Integer

        int populationOfLatvia = 1900000;
        System.out.println(populationOfLatvia);

//        Long

        long currentWorldPopulation = 790000000L;
        System.out.println(currentWorldPopulation);

//        Char

        char ch = 'b';
        System.out.println(ch);

        int[] arrayOfPeapleAges = {21, 22, 23, 24};

//        String Variables

        String myName = "Artjom";
        System.out.println(myName);

        String mySurname = "Krasovskis";

        String myNameAndSurname = myName + mySurname;
        System.out.println(myNameAndSurname);

        String myNameAndSurname1 = myName + " " + mySurname;
        System.out.println(myNameAndSurname1);
//        %s = string
//        %d = int


        System.out.printf("My name is %s. My surname is %s.", myName, mySurname);

        int a = 30;
        int b = 5;
        System.out.println(a / b);
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);

        Float doubleDivision = 100 / 13F;
        System.out.println(doubleDivision);


    }
}