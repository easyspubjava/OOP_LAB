package observer.before;

import java.io.FileWriter;
import java.io.IOException;

public class FileObserver extends Observer {

    @Override
    public void update(String message) {
        try {
            FileWriter fileWriter = new FileWriter("observer.txt", true);
            fileWriter.write(message);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
