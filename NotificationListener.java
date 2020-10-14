import com.install4j.api.launcher.StartupNotification;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotificationListener implements StartupNotification.Listener {
    @Override
    public void startupPerformed(String s) {
        String path = "/Users/akhilteja/Downloads/java_jam_association/JamCatOutput.txt";

        try {
            FileWriter file1Writer = new FileWriter(path + "__JAMOUT1");
            file1Writer.write("Inside listener");
            file1Writer.flush();
            file1Writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuffer sb = new StringBuffer();
        try {
            File myObj = new File(s);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                sb.append(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            sb.append(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                FileWriter fileWriter = new FileWriter(path + "__JAMOUT2");
                fileWriter.write(sb.toString());
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
