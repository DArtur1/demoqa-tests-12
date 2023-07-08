package guru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class SimpleTest {

    @BeforeAll
    static void initDB(){
        System.out.println("### @BeforeAll");
    }
    @BeforeEach
    void openYaPage(){
        System.out.println("### @BeforeEach");
        //Selenide.open("https://ya.ru");
    }

    @AfterEach
    void closeYaPage(){
        System.out.println("### @AfterEach");
        //WebDriverRunner.closeWindow();
    }

    @AfterAll
    static void cleanDB() {
        System.out.println("### @AfterAll");
    }

    @Test
    void assertTest() {
        System.out.println("###             @Test 0");
       // Assertions.assertTrue(2 > 3);
    }

    @Test
    void assertTest1() {
        System.out.println("###             @Test 1");
        // Assertions.assertTrue(2 < 3);
    }
    @Test
    void assertTest2() {
        System.out.println("###             @Test 2");
        // Assertions.assertTrue(2 < 3);
    }

    @Test
    void assertTest3() {
        System.out.println("###             @Test 3");
        // Assertions.assertTrue(2 < 3);
    }
}
