package chapter14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class MethodReference {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MethodReference.class.getName());

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(426);
        list.add(3);
        list.add(28);
        list.add(6);

        //1- CALLING STATIC METHOD
        System.out.println("[CALLING STATIC METHOD]");
        Consumer<List<Integer>> staticMethod = Collections::sort;
        staticMethod.accept(list);
        System.out.println(list);

        //2- CALLING INSTANCE METHODS ON A PARTICULAR OBJECT
        System.out.println("[CALLING INSTANCE METHODS ON A PARTICULAR OBJECT]");
        String s = "abc";
        Predicate<String> stringPredicate = s::startsWith;
        if(stringPredicate.test("a")){
            System.out.println("¥");
        }else {
            System.out.println("╚");
        }
        // Example 2
        Random random = new Random();
        Supplier<Integer> integerSupplier = random::nextInt;
        System.out.println("Random Number: "+ integerSupplier.get());

        //3- CALLING INSTANCE METHODS ON A PARAMETER
        System.out.println("[CALLING INSTANCE METHODS ON A PARAMETER]");
        // This time, we are going to call an instance method that doesn't
        //take any parameters. The trick is that we will do so without
        //knowing the instance in advance.
        Predicate<String> methodRef = String::isEmpty;
        Predicate<String> lambda = (x)->x.isEmpty();
        methodRef.test("");
        if (methodRef.test("")){
            System.out.println("is æ");
        }else{
            System.out.println("not ▓");
        }
        // Example 2
        BiPredicate<String,String> biPredicateMethodRef = String::startsWith;
        System.out.println("With two parameter using method reference "+biPredicateMethodRef.test("abc","a"));
        BiPredicate<String,String> biPredicateLambda = (s1, s2) -> s1.startsWith(s2);
        System.out.println("With two parameter using lambda "+biPredicateMethodRef.test("abc","a"));

        //4- CALLING CONSTRUCTORS
        System.out.println("[CALLING CONSTRUCTORS]");
        Supplier<List<String>> callingConstructorMethodReference = ArrayList::new;
        Supplier<List<String>> callingConstructorLambda = ()-> new ArrayList<>();


    }


}
