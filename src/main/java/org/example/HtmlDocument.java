package org.example;

import java.io.*;

public interface HtmlDocument {
    public void addTagToBody(String htmlCode);

    public void writeHTMLFile() throws FileNotFoundException;
}
