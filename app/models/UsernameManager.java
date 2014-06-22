package models;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import play.Play;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class UsernameManager {

    private String usernameFilePath = Play.configuration.getProperty("usernames.path");

    public List<String> getAll() throws IOException {
        return IOUtils.readLines(new StringReader(readFileContent()));
    }

    public String readFileContent() throws IOException {
        return FileUtils.readFileToString(new File(usernameFilePath), "UTF-8");
    }

    public void update(String content) throws IOException {
        FileUtils.writeStringToFile(new File(usernameFilePath), content, "UTF-8");
    }

}
