import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 1, 4, 7, 8);

        // 1. Given a list of integers, find the second highest number using streams.
        Optional<Integer> result = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        // here distinct gets the distinct values
        // sorted - Comparator.reverseOrder - reverses the ordering
        // skip - skip the first no.
        // findFirst - gets the first no.

        result.ifPresentOrElse(n -> System.out.println(n), () -> System.out.println("not found."));

        // 2. Group a list of Employee objects by department using streams.


        // 3. Convert a list of strings to uppercase and remove duplicates.
        List<String> names = List.of("Bharat", "Bhavya", "Mohan", "Suhitha", "Bharat");
        List<String> convertedNames = names.stream().map(name -> name.toUpperCase()).distinct().collect(Collectors.toList());
        System.out.println(convertedNames);

        // 5. Count the number of words in a sentence using streams.
        String sentence = "Java streams are powerful and concise";
        long wordCount = Arrays.stream(sentence.trim().split("\\s+")).count();
        System.out.println(wordCount);

        // long wordCount
    }
}