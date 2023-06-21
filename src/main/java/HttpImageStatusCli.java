import java.util.Scanner;

public class HttpImageStatusCli {
    public void askStatus(){
        HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter HTTP status code: ");

        try {
            int enteredCode = Integer.parseInt(scanner.nextLine());
            downloader.downloadStatusImage(enteredCode);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
