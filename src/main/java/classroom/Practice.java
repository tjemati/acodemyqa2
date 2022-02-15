package classroom;

public class Practice {

    public static void main(String[] args) {
       Animal barsik = new Animal();
       // name, years, weight
        System.out.println(barsik);

        barsik.name = "Barsik";
        barsik.weight = 6.5;
        barsik.yearsOld = 2;
        System.out.println(barsik);
        barsik.sleep();

        Animal rex = new Animal("Rex", 30, 100.00);

        // rex isSleep = false;
        System.out.println(rex);
        System.out.println("Name of my animal is: " + rex.name);

        rex.sleep();
        rex.sleep();



    }
}
