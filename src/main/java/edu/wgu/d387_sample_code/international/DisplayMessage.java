package edu.wgu.d387_sample_code.international;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DisplayMessage {
    public static void getWelcomeMessage(Properties properties, String resource) throws IOException {
        InputStream stream = new ClassPathResource(resource).getInputStream();
        properties.load(stream);
        System.out.println(properties.getProperty("welcome"));
    }
}
