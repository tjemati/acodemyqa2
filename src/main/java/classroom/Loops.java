package classroom;

public class Loops {
    public static void main(String[] args) {

        String[] fruits = {"apple", "kiwi", "banana", "strawbery", "lemon"};

        // fruits[0] = apple
        // fruits[1] = kiwi

        // i < 5
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        int x = 1;
        do {
            System.out.println("Hello World");
            x++;
        } while (x < 5);

        int y = 1;
        while (y < 5) {
            System.out.println("Hello acodemy");
            y++;
        }
        // for, do while, while


        // if isWinter -> System.out This is winter

        boolean isWinter = false;
        // is , has
        if (isWinter) {
            System.out.println("This is winter");
        } else {
            System.out.println("Maybe it is summer?");
        }

        // if , if else, if else if else

        boolean isSummer = false;
        boolean isAutumn = false;

        if (isWinter) {
            System.out.println("Yes, this is winter");
        } else if (isSummer) {
            System.out.println("Yes, this is summer");
        } else if (isAutumn) {
            System.out.println("Yes, this is autumn");
        } else {
            System.out.println("This is not a winter and summer");
        }










    }
}


