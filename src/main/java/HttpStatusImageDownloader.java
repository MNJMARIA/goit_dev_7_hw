import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HttpStatusImageDownloader {
    public void downloadStatusImage(int code) throws Exception {
        HttpStatusChecker httpStatusChecker = new HttpStatusChecker();
        String imagePath = "C:\\Users\\armyl\\IdeaProjects\\goit_dev_7_hw_gradle\\" + code + ".jpg";

        try(InputStream in = new URL(httpStatusChecker.getStatusImage(code)).openStream()){
            Files.copy(in, Paths.get(imagePath));
            System.out.println("Image downloaded! Name of image is " + code + ".jpg");
        }catch (Exception e) {
            throw new Exception("Failed to download image for HTTP status " + code);
        }
    }
}
