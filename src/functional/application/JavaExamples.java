package functional.application;

import java.util.function.Function;

public class JavaExamples {

    public String applySomeFunctionToString(String input, Function<String, String> myFunction) {
        return myFunction.apply(input);
    }


    public static void main(String[] args) {
        String input = "hello world";

        JavaExamples javaExamples = new JavaExamples();
        String applied = javaExamples.applySomeFunctionToString(input, s -> s.substring(0, 1).toUpperCase() + s.substring(1, input.length()));

        System.out.println(applied);
    }
}
