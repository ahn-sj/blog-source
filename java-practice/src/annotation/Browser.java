package annotation;

import java.lang.annotation.*;

@Repeatable(value = Browsers.class)
//@Retention(RetentionPolicy.RUNTIME)
public @interface Browser {
    String webBrowser();
}
