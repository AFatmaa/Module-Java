package exercise4_streams_and_optionals;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Remainders {

    /**
     * Prints the remainders of numbers from 1 to 20 when divided by the divisor.
     *
     * @param divisor the number used as the divisor
     */
    public void printRemainders(int divisor) {
        String result = IntStream.rangeClosed(1, 20)
                .map(number -> number % divisor)
                .mapToObj(remainder -> String.valueOf(remainder))
                .collect(Collectors.joining(","));

        System.out.println(result);

    }

    /**
     * Groups numbers from 1 to 20 by their remainder when divided by the divisor.
     *
     * @param divisor the number used as the divisor
     * @return a map containing each remainder and its matching numbers
     */
    public Map<Integer, List<Integer>> remainderGroups(int divisor) {
        return IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.groupingBy(number -> number % divisor));
    }

    /**
     * Counts how many numbers from 1 to 20 produce each remainder.
     *
     * @param divisor the number used as the divisor
     * @return a map containing each remainder and its count
     */
    public Map<Integer, Long> remainderCounts(int divisor) {
        return IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.groupingBy(number -> number % divisor, Collectors.counting()));
    }

    public static void main(String[] args) {
        Remainders remainders = new Remainders();

        remainders.printRemainders(2);
        remainders.printRemainders(5);

        Map<Integer, List<Integer>> groups = remainders.remainderGroups(5);

        System.out.println(groups);

        Map<Integer, Long> counts = remainders.remainderCounts(5);

        System.out.println(counts);
    }
}