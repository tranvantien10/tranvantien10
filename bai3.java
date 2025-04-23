bai3.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bai3 {
    public static void main(String[] args) {
        String inputFile = "input.txt"; // File cần đếm số dòng

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            int lineCount = 0;
            while (br.readLine() != null) { // Đọc từng dòng
                lineCount++; // Tăng biến đếm dòng
            }

            System.out.println("Số dòng trong file: " + lineCount);

        } catch (IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
}
