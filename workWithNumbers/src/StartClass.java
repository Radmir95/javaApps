import to090316.*;

public class StartClass {
    public static void main(String[] args) {

        //work1
        System.out.println("**********Work1*********");
        double mas[] = {0,1,0,0,5,0,0,0,0,1,4,0,0,0,9};
        Work1 work1 = new Work1(mas);
        work1.method();
        System.out.println("First index is " + work1.getFirstIndex() + " , max length is " + work1.getMaxLength());

        //work2
        System.out.println("**********Work2**********");
        int vector[] = {1,2,5,8,10,13,37,32,11};
        System.out.println("Vector before:");
        for (int i = 0; i < vector.length; i++)
            System.out.print(vector[i] + " ");
        Work2 work2 = new Work2(vector);
        work2.method();
        System.out.println("\nVector after:");
        for (int i = 0 ; i < work2.getVector().length; i++)
            System.out.print(work2.getVector()[i] + " ");

        //Work3
        System.out.println("\n**********Work3**********");
        int chils[] = {1,3,5};
        int znamen[] = {2,5,6};
        System.out.println("Rational numbers is: ");
        for (int i = 0; i< chils.length; i++)
            System.out.print(chils[i]+"/"+znamen[i] + " + ");

        Work3 work3 = new Work3(chils, znamen);
        System.out.println("Result of p/q + u/v is \n " +work3.method());
    }
}
