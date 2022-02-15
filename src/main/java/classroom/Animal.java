package classroom;

public class Animal {

    public String name;
    public int yearsOld;
    public double weight;
    public boolean isSleep;

    public Animal(String name, int yearsOld, double weight) {
        this.name = name;
        this.yearsOld = yearsOld;
        this.weight = weight;
    }

    public Animal() {
    }

    //if , else if, else if, else if, else
    public void sleep() {
        if(isSleep) {
            System.out.println("I'm already sleeping!");
        } else {
            System.out.println("I go sleep! Bye-bye!");
            isSleep = true;
        }
    }

    public void wakeUp() {
        if(isSleep) {
            System.out.println("Wake up");
            isSleep = false;
        } else {
            System.out.println("You cannot wake me up, because I am awake already");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", yearsOld=" + yearsOld +
                ", weight=" + weight +
                ", isSleep=" + isSleep +
                '}';
    }
}
