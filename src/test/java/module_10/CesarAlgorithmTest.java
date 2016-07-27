package module_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class CesarAlgorithmTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void encrypt() throws Exception {
        String text = "hello";
        int key = -5;

        CesarAlgorithm.encrypt(text, key);
    }

}