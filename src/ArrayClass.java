import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        System.out.println("=== Demonstration of Important Arrays Class Methods ===\n");

        // 1. Original array
        int[] numbers = { 10, 20, 15, 22, 35 };
        System.out.println("Original array: " + numbers);
        System.out.println("Original array: " + Arrays.toString(numbers));

        // 2. sort() – sorts entire array in ascending order
        Arrays.sort(numbers);
        System.out.println("After sort(): " + Arrays.toString(numbers));

        // 3. binarySearch() – search for a key in the whole array (must be sorted)
        int key = 22;
        int index = Arrays.binarySearch(numbers, key);
        System.out.println("Index of " + key + " (full array search): " + index);

        // 4. binarySearch() with range – search only between indices 1 (inclusive) and 3 (exclusive)
        int rangeIndex = Arrays.binarySearch(numbers, 1, 3, key);
        System.out.println("Searching " + key + " in indices [1,3): " + rangeIndex);

        // 5. compare() – lexicographically compares two arrays
        int[] anotherArray = { 10, 15, 22 };
        int comparisonResult = Arrays.compare(numbers, anotherArray);
        System.out.println("compare(numbers, anotherArray): " + comparisonResult);

        // 6. equals() – checks if two arrays are equal (same length and same elements)
        int[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length);
        boolean isEqual = Arrays.equals(numbers, copyOfNumbers);
        System.out.println("equals(numbers, copyOfNumbers): " + isEqual);

        // 7. fill() – assigns a value to every element of the array (or a range)
        int[] toFill = new int[5];
        Arrays.fill(toFill, 7);
        System.out.println("After fill(toFill, 7): " + Arrays.toString(toFill));
        // Fill a range: indices 1 to 3 (exclusive) with 99
        Arrays.fill(toFill, 1, 3, 99);
        System.out.println("After fill(toFill, 1, 3, 99): " + Arrays.toString(toFill));

        // 8. copyOf() – copies first n elements into a new array
        int[] copied = Arrays.copyOf(numbers, 3);
        System.out.println("copyOf(numbers, 3): " + Arrays.toString(copied));

        // 9. copyOfRange() – copies a range of elements
        int[] rangeCopy = Arrays.copyOfRange(numbers, 2, 5);
        System.out.println("copyOfRange(numbers, 2, 5): " + Arrays.toString(rangeCopy));

        // 10. toString() – returns a string representation of the array (used throughout)
        System.out.println("\nAll arrays printed using Arrays.toString() as seen above.");
    }
}