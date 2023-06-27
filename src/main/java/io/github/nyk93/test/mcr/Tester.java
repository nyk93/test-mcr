package io.github.nyk93.test.mcr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

/**
 * Maven Central Repository Tester.
 *
 * @author nyk93 (https://github.com/nyk93)
 * @version 1.0
 * @since 2023-06-26
 */
public class Tester {

    /**
     * greeting message.
     */
    private static final String MESSAGE = "Hello, World!";

    /**
     * print greeting message.
     */
    public void greeting() {
        System.out.println(MESSAGE);
    }

    /**
     * print version.
     */
    public void printVersion() throws IOException, XmlPullParserException {
        final String pomFilename = "pom.xml";
        MavenXpp3Reader reader = new MavenXpp3Reader();
        Model model;

        if ((new File("pom.xml")).exists()) {
            model = reader.read(new FileReader(pomFilename));

            System.out.println(model.getVersion());
        } else {
            System.out.println("Unknown version");
        }
    }

}
