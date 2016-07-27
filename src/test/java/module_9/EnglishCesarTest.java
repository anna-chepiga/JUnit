package module_9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnglishCesarTest {
    private final EnglishCesar cesar = new EnglishCesar();

    @Test
    public void encrypt() throws Exception {
        String actual = cesar.encrypt("Please enter the text to encrypt and write into the file", 5);
        String result = "UqjfxjbjsyjwbymjbyjCybytbjshwDuybfsibBwnyjbnsytbymjbknqj";

        assertEquals(result, actual);
    }

    @Test
    public void decrypt() throws Exception {
        String actual = cesar.decrypt("UqjfxjbjsyjwbymjbyjCybytbjshwDuybfsibBwnyjbnsytbymjbknqj", 5);
        String result = "Please enter the text to encrypt and write into the file";

        assertEquals(result, actual);
    }
}