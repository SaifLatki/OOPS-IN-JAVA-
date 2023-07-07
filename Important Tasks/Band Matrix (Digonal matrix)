public class BandMatrix {
    public static void main(String[] args) {
        // Check if two integer command-line arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two integer command-line arguments: n and width");
            return;
        }

        // Parse the command-line arguments
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        // Generate and print the band matrix pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= width)
                    System.out.print("*  ");
                else
                    System.out.print("0  ");
            }
            System.out.println();
        }
    }
}
