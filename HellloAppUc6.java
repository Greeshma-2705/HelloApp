<<<<<<<< HEAD:HelloAppUc6.java
public class HelloAppUc6 {
========
public class HellloAppUc6 {
>>>>>>>> origin/main:HellloAppUc6.java
    public static void main(String[] args) {

            StringBuilder nameBuilder = new StringBuilder();

            // Append all names with comma and space
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            String result;

            // If names are provided, remove trailing ", "
            if (nameBuilder.length() > 0) {
                result = "Hello, " + nameBuilder.substring(0, nameBuilder.length() - 2) + "!";
            } else {
                result = "Hello, World!";
            }

            System.out.println(result);
    }
}

