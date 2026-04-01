public class HelloAPPUc7 {


        public static void main(String[] args) {

            String result;

            // Check if arguments are provided
            if (args.length > 0) {
                result = "Hello, " + String.join(", ", args) + "!";
            } else {
                result = "Hello, World!";
            }

            System.out.println(result);
        }

}
