package exercise3_exceptions;

public class Main {

    public static void main(String[] args) {
        FileReaderService fileReaderService = new FileReaderService();

        readAndPrint(fileReaderService, "files/example.txt");

        readAndPrint(fileReaderService, "files/empty.txt");

        readAndPrint(fileReaderService, "files/missing.txt");

        readAndPrint(fileReaderService, null);
    }

    private static void readAndPrint(FileReaderService fileReaderService, String filename) {
        System.out.println("\nAttempting to read: " + filename);

        try {
            String content = fileReaderService.readFile(filename);

            if (!content.isEmpty()) {
                System.out.println("File content:");
                System.out.println(content);
            }

        } catch (InvalidFileFormatException exception) {
            System.out.println("Invalid file format: " + exception.getMessage());

        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid argument: " + exception.getMessage());
        }
    }
}