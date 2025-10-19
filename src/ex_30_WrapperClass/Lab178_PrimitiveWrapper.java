package ex_30_WrapperClass;

public class Lab178_PrimitiveWrapper {

    public static void main(String[] args) {
        int a = 10; // Primitive Data type

        // This is not an Object, It will not have Attributes and Behaviour

        // char, int,double,float - we will avoid them now.

        // We will use the Wrapper classes,
        // Character, Boolean, Short, Long, Double, Float

        Integer age = 65;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());
    }
}
