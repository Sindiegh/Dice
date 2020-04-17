public class Main {
    public static void main(String[] args) {

        System.out.println("Perfectly Normal Dice");
        Die die6 = new Die(6);
        die6.Roll();
        // this would print a number between 1 and 6 inclusive
        System.out.println(die6.getValue());

        Die die20 = new Die(20);
        die20.Roll();
        // this would print a number between 1 and 20 inclusive
        System.out.println(die20.getValue());
        System.out.println("********************************************");
        System.out.println("Weighted Dice");

        Die dieDodgy6 = new Die(6,new int[]{2,1,1,1,1,2});
        System.out.println(dieDodgy6.Roll());

        // we can create a perfectly fair die like this
        Die dieFair6 = new Die(6,new int[]{1,1,1,1,1,1});

        // this is equivalent to
        die6 = new Die(6);
        System.out.println(dieFair6.Roll());


    }
}
