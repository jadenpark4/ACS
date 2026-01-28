public class Unit4ExercisesTester {
    public static void main(String[] args) {
        int[] a1 = { 5, 6, 45, 99, 13, 5, 6 };
        System.out.println(Unit4Exercises.matchingEndSequences(a1, 1));
        System.out.println(Unit4Exercises.matchingEndSequences(a1, 2));
        System.out.println(Unit4Exercises.matchingEndSequences(a1, 3));

        int[] a2 = { 2, 1, 3, 5 };
        int[] a3 = { 2, 1, 2, 5 };
        int[] a4 = { 2, 4, 2, 5 };

        System.out.println(Unit4Exercises.hasThreeConsecutive(a2));
        System.out.println(Unit4Exercises.hasThreeConsecutive(a3));
        System.out.println(Unit4Exercises.hasThreeConsecutive(a4));

        int[] seq1 = Unit4Exercises.generateNumberSequence(5, 10);
        System.out.println(seq1);

        int[] seq2 = Unit4Exercises.generateNumberSequence(1, 3);
        System.out.println(seq2);

        String[] fb1 = Unit4Exercises.fizzBuzz(1, 6);
        System.out.println(fb1);
        String[] fb2 = Unit4Exercises.fizzBuzz(1, 11);
        System.out.println(fb2);

        int[] a5 = { 1, 0, 1, 0, 0, 3, 11 };
        System.out.println(Unit4Exercises.moveEvenBeforeOdd(a5));

    }
}
