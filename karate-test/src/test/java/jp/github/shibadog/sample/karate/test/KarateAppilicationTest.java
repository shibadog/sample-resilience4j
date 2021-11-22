package jp.github.shibadog.sample.karate.test;

import com.intuit.karate.junit5.Karate;

public class KarateAppilicationTest {

    @Karate.Test
    Karate testTest() {
        return Karate.run("test").relativeTo(getClass());
    }
}
