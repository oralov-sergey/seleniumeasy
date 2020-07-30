import org.junit.Test;

public class Part2 extends SuperClass {
    @Test
    public void test1() {
        getBrowser("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        waitElementAndClick("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]");
    }
}