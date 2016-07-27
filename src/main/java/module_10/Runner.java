package module_10;

import java.io.*;
import java.util.Scanner;

public class Runner {
    private static String workingDir = System.getProperty("user.dir");

    public static void main(String[] args) throws IOException {
        String filename = "newfile.txt";
        String absolutePath = workingDir + File.separator + filename;
        String content;
        int key;
        Scanner sc = new Scanner(System.in);

        File file = new File(absolutePath);

        if (!file.exists()) {
            file.createNewFile();
        }

        System.out.println("Please enter the text to encrypt and write into the file:");
        content = sc.nextLine();

        System.out.println("Please enter the key length:");
        key = sc.nextInt();

        DataInputStream in = null;

        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(absolutePath)));
            String encrypted = CesarAlgorithm.encrypt(content, key);
            out.writeUTF(encrypted);

            System.out.println("\nThe text is encrypted and written to newfile.txt");

            out.close();

            in = new DataInputStream(new BufferedInputStream(new FileInputStream(absolutePath)));
            String readText = in.readUTF();
            String decrypted = CesarAlgorithm.decrypt(readText, key);

            System.out.println("\nHere is the decrypted text:\n" + decrypted);
        } catch (EOFException e) {
            System.out.println("Reached the end of the file");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Key should be a positive number");
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}