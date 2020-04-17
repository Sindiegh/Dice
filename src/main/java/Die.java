
public class Die {

    private int sides=1;
    private int value;
    int [] probabilities;
    private int integer;

    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }



    public Die(int sides, int... probabilities){
        this.sides = sides;
        this.probabilities = probabilities;
    }

    public void setProbabilities(int [] probabilities) {

        this.probabilities = probabilities;
        Die theDice = new Die(sides);
        theDice.Roll();

    }

    public int Roll()
    {
        if ((probabilities.length == sides)){
            int sum = 0;
            for (int value :probabilities ) {
                sum+=value;

                if (value < 0){
                    System.out.println("negative probabilities not allowed");
                }

                if ((value < 1)){
                    System.out.println("probability sum must be greater than 0");
                }
                if ((value== integer)){
                    System.out.println("only integer values allowed");
                }
            }

            double[] percentages = new double[probabilities.length];
            for (int i = 0; i < probabilities.length; i++) {
                double chances = (double) probabilities[i] / sum;
                if (i > 0){
                    percentages[i] = chances + percentages[i-1];
                }
                else{
                    percentages[i] = chances;
                }
                System.out.println(percentages[i]);
            }

            double random = Math.random();
            for (int i = 0; i < percentages.length ; i++) {
                if (random < percentages[i]){
                    value = i +1;
                    break;
                }
            }
        } else{
            value = (int) (Math.random() * sides) +1;
        }
        return value;
    }

}

