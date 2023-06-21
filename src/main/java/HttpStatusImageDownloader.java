import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HttpStatusImageDownloader {
    public void downloadStatusImage(int code) throws Exception {
        HttpStatusChecker httpStatusChecker = new HttpStatusChecker();

        try(InputStream in = new URL(httpStatusChecker.getStatusImage(code)).openStream()){
            Files.copy(in, Paths.get("C:\\Users\\armyl\\IdeaProjects\\goit_dev_7_hw_gradle\\" + code + ".jpg" ));
        }
    }
}
