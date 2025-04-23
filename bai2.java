bai2.java
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class bai2 {
    public static void main(String[] args) {
        String outputFile = "output.txt";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(outputFile)) {

            System.out.println("Nhập nội dung (gõ 'exit' để kết thúc):");

            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(line + "\n");
            }

            System.out.println("Dữ liệu đã được ghi vào file " + outputFile);

        } catch (IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
}
