import java.util.Scanner;

public class NumberAndSquareArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] inputArray = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        // Create a new array with the number and its square
        int[][] resultArray = createNumberAndSquareArray(inputArray);

        // Output the result array
        System.out.println("Result Array (Number, Square):");
        for (int i = 0; i < size; i++) {
            System.out.println("[" + resultArray[i][0] + ", " + resultArray[i][1] + "]");
        }
    }

    // Function to create a new array with the number and its square
    private static int[][] createNumberAndSquareArray(int[] array) {
        int size = array.length;
        int[][] resultArray = new int[size][2];

        for (int i = 0; i < size; i++) {
            resultArray[i][0] = array[i];               // Number
            resultArray[i][1] = array[i] * array[i];    // Square of the Number
        }

        return resultArray;
    }
}
OUTPUT:
C:\Users\VAISHNAVI.R\OneDrive\Documents>javac NumberAndSquareArray.java

C:\Users\VAISHNAVI.R\OneDrive\Documents>java NumberAndSquareArray
Enter the size of the array: 6
Enter the elements of the array:
123
140
170
230
260
310
Result Array (Number, Square):
[123, 15129]
[140, 19600]
[170, 28900]
[230, 52900]
[260, 67600]
[310, 96100]
