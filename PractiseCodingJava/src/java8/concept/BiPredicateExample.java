package java8.concept;

import java.util.function.BiPredicate;

public class BiPredicateExample {


    static BiPredicate<String,String> biPredicate = new BiPredicate<String, String>() {
        @Override
        public boolean test(String s, String s2) {
            System.out.println("s = " + new StringBuffer(s).reverse());
            System.out.println("s2 = " + s2);
            return (new StringBuffer(s).reverse()).toString()==(s2);
        }
    };

    public static void main(String[] args) {
        System.out.println(biPredicate.test("abc","cba"));

         BiPredicate<String,String> biPredicate1 =  ( s,  s2) ->{
            System.out.println("s = " + new StringBuffer(s).reverse());
            System.out.println("s2 = " + s2);
            //s= String.valueOf(new StringBuffer(s).reverse());
            return (s).equals(s2);
        };
        System.out.println(biPredicate1.test("madam","madam"));
    }
}
