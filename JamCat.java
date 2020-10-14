import java.io.*;
import java.util.Scanner; // Import the Scanner class to read text files
import com.install4j.api.launcher.StartupNotification;
//import com.install4j.api.launcher.StartupNotification.registerStartupListener;
import java.io.File;

public class JamCat {
    public static void main(String args[]) throws IOException {
        String path = "/Users/akhilteja/Downloads/java_jam_association/JamCatOutput.txt";
        FileWriter writer = new FileWriter(path);
        writer.write("App started");
        writer.close();


    StartupNotification.registerStartupListener(new NotificationListener());

    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();


    }


}