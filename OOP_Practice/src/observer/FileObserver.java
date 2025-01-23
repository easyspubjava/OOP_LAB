package observer;

import java.io.FileWriter;
import java.io.IOException;

public class FileObserver extends Observer{

    @Override
    public void update(String message) {
        try(FileWriter fw = new FileWriter("observer.txt", true)){
            fw.write(message);
            fw.write("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
