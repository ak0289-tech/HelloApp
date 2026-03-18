public class UC5 {
    public static void main(String[] args) {

        // If no arguments provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.print("Hello, ");

            int count = 0;

            // Enhanced for loop (for-each)
            for (String name : args) {
                System.out.print(name);
                count++;

                // Add comma if not last element
                if (count < args.length) {
                    System.out.print(", ");
                }
            }

            System.out.println("!");
        }
    }
}