package org.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlDocumentWithHeaderAndBody implements HtmlDocument {

    private StringBuffer headerTags;
    private StringBuffer bodyTags;

    public HtmlDocumentWithHeaderAndBody() {
        this.headerTags = new StringBuffer();
        this.bodyTags = new StringBuffer();
    }

    @Override
    public void addTagToBody(String htmlCode) {
        addTag(htmlCode, bodyTags);
    }

    public void addTagToHeader(String htmlCode) {
        addTag(htmlCode, headerTags);
    }

    @Override
    public void writeHTMLFile() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("page.html");
        printWriter.write("<html>\n");
        printWriter.write("<head>\n");
        printWriter.write(headerTags.toString());
        printWriter.write("</head>\n");
        printWriter.write("<body>\n");
        printWriter.write(bodyTags.toString());
        printWriter.write("</body>\n");
        printWriter.write("</html>\n");
        printWriter.close();
        System.out.println("Saved file to page.html");
    }

    private void addTag(String htmlCode, StringBuffer stringBuffer) {
        Pattern pattern = Pattern.compile("<(\\w+)>.*</(\\w+)>", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(htmlCode);
        if (!matcher.matches()) {
            throw new RuntimeException("Tag " + matcher.group(1) + " " + "must be closed by a </" + matcher.group(1) + "> tag but instead found " + matcher.group(2));
        }
        stringBuffer.append(htmlCode);
        stringBuffer.append("\n");
    }
}
