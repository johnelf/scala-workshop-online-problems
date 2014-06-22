package models;

import org.apache.commons.lang.StringUtils;

public class Problem {

    public String id;
    public String content;
    public String input;
    public String output;

    public String getTitle() {
        return StringUtils.abbreviate(content, 50);
    }

}
