public class App {
    public static void main(String[] args) throws Exception {
        HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();

        downloader.downloadStatusImage(404);
    }
}
