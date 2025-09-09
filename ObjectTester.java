//James McKean
// 09/09/2025
// CPSC-39-12705

public class ObjectTester {

    public static void main (String[] args) {

        //make a Cat object - instantiation
        Cat cat1 = new Cat();
        System.err.println(cat1);

        //make a Cat object - use non-default constructor
        Cat cat2 = new Cat("Karl", 4, "Russian Blue");
        System.out.println(cat2);

        cat2.setName("Paul");
            System.out.println(cat2);

        //only print cat's name
        System.out.println(cat2.getName());
        
    }  //end main

}  //end class