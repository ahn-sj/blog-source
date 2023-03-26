package annotation;

public class RepeatableTest {
    public static void main(String[] args) {

        WebBrowser webBrowser = new WebBrowser();
        Browsers browsers = webBrowser.getClass().getAnnotation(Browsers.class);

        for (Browser browser : browsers.value()) {
            System.out.println("browser = " + browser);
        }
    }
}

@Browser(webBrowser = "Chrome")
@Browser(webBrowser = "Firefox")
@Browser(webBrowser = "Edge")
class WebBrowser {}


