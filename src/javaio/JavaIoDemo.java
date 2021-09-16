import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaIoDemo {
    public static void readFromConsole() throws IOException {
        // reading through Scanner which is popular in programming contest.
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        String myInt = scanner.next();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);

        // reading through bufferreader which is efficient because it buffers characters.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        Integer a = Integer.parseInt(bufferedReader.readLine());
        System.out.println("myString is: " + s);
        System.out.println("myInt is: " + a);

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        JavaIoDemo.readFromConsole();
    }
}
