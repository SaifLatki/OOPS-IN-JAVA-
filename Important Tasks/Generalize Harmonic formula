public class GeneralizedHarmonic {
    public static void main(String[] args) {
        // Check if two integer command-line arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two integer command-line arguments: n and r");
            return;
        }

        // Parse the command-line arguments
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        // Compute the nth generalized harmonic number of order r
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            result += 1.0 / Math.pow(i, r);
        }

        // Print the result
        System.out.println("H(" + n + ", " + r + ") = " + result);
    }
}
