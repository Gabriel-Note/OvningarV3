public class Main {
    public static void main(String[] args) {
        Exercise1_1 exercise1_1 = new Exercise1_1();
        Exercise1_2 exercise1_2 = new Exercise1_2();
        Exercise1_3 exercise1_3 = new Exercise1_3("Gabriel", 31);
        Exercise2_1 exercise2_1 = new Exercise2_1();
        Exercise2_2 exercise2_2 = new Exercise2_2();
        Exercise3_1 exercise3_1 = new Exercise3_1();

        // Exercise 1_1
        /*
        programStarting();
        exercise1_1.printWelcome();
        programStopping();
         */

        // Exercise 1_2
        /*
        exercise1_2.printName("Gabriel");
        exercise1_2.printAge(31);
        exercise1_2.printGreeting("Gabriel", 31);
         */

        // Exercise 1_3
        /*
        System.out.println(exercise1_3.getName());
        System.out.println(exercise1_3.getAge());
        System.out.println(exercise1_3.getFullPresentation());
         */

        // Exercise 2_1
        /*
        System.out.println(exercise2_1.add(3,5));
        System.out.println(exercise2_1.subtract(3,5));
        System.out.println(exercise2_1.multiply(3,5));
        System.out.println(exercise2_1.divide(3,5));
         */

        //Exercise 2_2
        /*
        System.out.println(exercise2_2.calculateCircleArea(2));
        System.out.println(exercise2_2.calculateRectangleArea(2,3));
        System.out.println(exercise2_2.calculateTriangleArea(2,3));
         */

        //Exercise3_1

        System.out.println(exercise3_1.reverseString("Hejsan"));

    }
        static void programStarting(){
            System.out.println("Programmet startar");
        }
        static void programStopping(){
            System.out.println("Programmet avslutas");
        }
}