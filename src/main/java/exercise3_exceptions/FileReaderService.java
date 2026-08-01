package exercise3_exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Safely reads content from text files.
 */
public class FileReaderService {

    /**
     * Reads and returns the content of a text file.
     *
     * @param filename the path of the file to read
     * @return the content of the file, or an empty string if the file cannot be opened or read
     * @throws InvalidFileFormatException if the file is empty
     * @throws IllegalArgumentException   if the filename is null
     */
    public String readFile(String filename) throws InvalidFileFormatException {
        if (filename == null) {
            throw new IllegalArgumentException("Filename cannot be null.");
        }

        BufferedReader reader = null;
        StringBuilder content = new StringBuilder();

        try {
            reader = new BufferedReader(new FileReader(filename));

            String line;
            boolean firstLine = true;

            while ((line = reader.readLine()) != null) {
                if (!firstLine) {
                    content.append(System.lineSeparator());
                }

                content.append(line);
                firstLine = false;
            }

            String fileContent = content.toString();

            if (fileContent.isBlank()) {
                throw new InvalidFileFormatException("The file is empty: " + filename);
            }

            return fileContent;

        } catch (FileNotFoundException exception) {
            System.out.println("File not found: " + filename);
            return "";

        } catch (IOException exception) {
            System.out.println("The file could not be read: " + exception.getMessage());
            return "";

        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException exception) {
                    System.out.println("The file could not be closed: " + exception.getMessage());
                }
            }
        }
    }
}