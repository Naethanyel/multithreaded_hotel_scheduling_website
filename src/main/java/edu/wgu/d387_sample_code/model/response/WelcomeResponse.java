package edu.wgu.d387_sample_code.model.response;


import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;



public class WelcomeResponse {

    private static ArrayList<String> welcome = new ArrayList<String>();

    public WelcomeResponse() {
        super();
    }

    public WelcomeResponse(String welcome) {
        super();
        this.welcome.add(welcome);
    }
    public static void getWelcomeMessage(Properties properties, String resource) throws IOException {
        InputStream stream = new ClassPathResource(resource).getInputStream();
        properties.load(stream);
        welcome.add(properties.getProperty("welcome"));
    }


    public ArrayList<String> getWelcome() {
        return welcome;
    }
}
