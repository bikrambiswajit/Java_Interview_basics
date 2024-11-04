package DSA_interview;

public class squareRootIntegral {

	public static void main(String[] args) {

		int num = 17;
		int start = 1, end = num;

        // Perform binary search to find the square root
        while (start <= end) {
            // Calculate the middle element
            int mid = start + (end - start) / 2;

            // If the square of the middle element is equal to n, return mid
            if (mid * mid == num) {
                System.out.println("Answer " + mid);
            }

            // If the square of the middle element is greater than n,
            // the square root must be in the left half
            else if (mid * mid > num) {
                end = mid - 1;
            }

            // If the square of the middle element is less than n,
            // the square root must be in the right half
            else {
                start = mid + 1;
            }
        }

        // If the square root is not found, return the largest integer less than the square root
        System.out.println("Answer "+end);

	}

}
