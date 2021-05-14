import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {


    @Test
    public void StringTest(){
        String course = "Codeup";
        String course1 = "Codeup";
        String course2 = "codeup";

        assertEquals(course, course1);
        assertNotEquals(course, course2);

    }

    @Test
    public void ArrayListTest(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void ArrayTest(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void CharTest(){
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }
}
