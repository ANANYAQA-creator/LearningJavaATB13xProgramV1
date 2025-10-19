package ex_30_WrapperClass;

public class Lab181_WrapperConversion2 {
    public static void main(String[] args) {

        String number = "10";
        //String-->Wrapper

        Integer a = Integer.parseInt(number);
        Integer b = Integer.valueOf(number);

        //String to Primitive
        int aa = Integer.parseInt(number);

        // Wrapper to String (toString method)
        System.out.println(a.toString());

        // Primitive to String
        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString()); // "10"
    }
}
