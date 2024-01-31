package lesson29javainputoutput.filereader.example2;

import lesson29javainputoutput.fileoutputstream.example5.PathData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader(PathData.MY_STUDENTS_CONTACT_FILE.getPath()))) {
            while (scanner.hasNextLine()) {
                String mobileOperatorData = scanner.nextLine();
                String[] array = mobileOperatorData.split(":");
                if(array[1].startsWith("+99455")){
                    System.out.println(mobileOperatorData);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
