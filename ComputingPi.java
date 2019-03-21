package computingpi;

public class ComputingPi {

    public static void main(String[] args) {

        System.out.println("Compute the PI number!\n");
        
        int devider = 3;
        int counter = 1;
        double result = 1;

        System.out.print("The result of 1\t");
        for (int i = 0; i < 1000; i++) {

            if (counter % 2 == 0) {

                result += 1.0 / devider;
                System.out.printf("+(1/%d)",devider);

            } else {

                result -= 1.0 / devider;
                System.out.printf("-(1/%d)",devider);

            }
            devider += 2;
            counter++;

        }

        System.out.println("\n\n is equal to --->\t"+4 * result+"\n\n\n\n");
        
    
    }

}
