package com.teachmeskills.lesson23.task1.parser;

import com.teachmeskills.lesson23.task1.constants.Constants;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * The SaxMyParser class contains the saxParser method, which parses an XML document using the SAX method
 */
public class SaxMyParser {

    public static void saxParser() {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (Exception e) {
            System.out.println("Not parsing file");
            return;
        }

        File file = new File(Constants.PATCH_FILE_XML);
        try {
            parser.parse(file,handler);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

}
