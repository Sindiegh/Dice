public class Main {
    public static void main(String[] args) {


        Die die6 = new Die(6,  2,1,1,1,1,2);
        die6.setProbabilities(new int[]{2,1,1,1,1,2});
        // this would print a number between 1 and 6 inclusive
        System.out.println("Perfectly Normal Dice: "+die6.Roll());

         Die dieFac = DieFactory.makeDie();
        System.out.println("Dice Factory: "+dieFac.Roll());
        Die dieFac2 = DieFactory.makeDie2();
        System.out.println("Dice Factory no.2: "+dieFac2.Roll());





    }
}
