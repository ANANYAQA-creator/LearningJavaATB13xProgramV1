package ex_30_WrapperClass;

public class Lab180_Wrapper_Conversion {
    public static void main(String[] args) {

        int a = 10;

        Integer b=a;// This Boxing -> automatically JVM will store the value
        // Primitive to wrapper -> AutoBoxing

        System.out.println(b.intValue());
        System.out.println(Integer.MIN_VALUE);


        Integer a2= 43;
        int v=a2; // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(v);
    }
    }
