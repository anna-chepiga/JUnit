package module_9;

public class Runner {
    public static void main(String[] args) {
        EnglishCesar cesar = new EnglishCesar();

        String text = "Map bunch: tulips=2, asters=4, roses=5\n\n" +
                "Sorted map bunch: asters=3, daisies=5, roses=7\n\n" +
                "ArrayList bunch: 5 blue asters, 4 yellow roses, 6 violet tulips, 2 white daisies\n\n" +
                "Rosebush contains 15 red roses\n\n" +
                "ArrayList bunch presented as table:\n" +
                "5\tblue\tasters\n" +
                "4\tyellow\troses\n" +
                "6\tviolet\ttulips\n" +
                "2\twhite\tdaisies\n\n" +
                "Map bunch presented as table:\n" +
                "tulips\t2\n" +
                "asters\t4\n" +
                "roses\t5";

        String encryptedText = cesar.encrypt(text, 5);

        System.out.println("THE ENCRYPTED TEXT IS: \n" + encryptedText);

        System.out.println();

        String decryptedText = cesar.decrypt(encryptedText, 5);

        System.out.println("THE DECRYPTED TEXT IS: \n" + decryptedText);
    }
}