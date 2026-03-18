public class UC4 {
    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Loop through all arguments
            System.out.print("Hello, ");
            
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);

                // Add comma between names (except last one)
                if (i < args.length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println("!");
        }
    }
}