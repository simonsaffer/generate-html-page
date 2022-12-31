package org.example;

import java.io.FileNotFoundException;

public class HtmlPageGeneratorApp
{
    public static void main( String[] args ) throws FileNotFoundException {
        HtmlDocumentWithHeaderAndBody htmlDocument = new HtmlDocumentWithHeaderAndBody();

        for(int i = 0; i < 10; i++) {
            htmlDocument.addTagToBody("<p>I will not waste chalk</p>");
        }

        htmlDocument.writeHTMLFile();
    }
}
