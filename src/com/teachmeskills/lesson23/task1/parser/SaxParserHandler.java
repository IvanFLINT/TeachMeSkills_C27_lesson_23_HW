package com.teachmeskills.lesson23.task1.parser;

import com.teachmeskills.lesson23.task1.constants.Constants;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.FileWriter;

/**
 * The SaxParserHandler class inherits from the DefaultHandler class.
 * It contains tag name fields. And the parsing methods have been reassigned.
 */
public class SaxParserHandler extends DefaultHandler {

    private String tagName;
    private String lastName;
    private String firstName;
    private String title;
    private String line;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        tagName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        tagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        String information = new String(ch, start, length);
        information = information.replace("\n", "").trim();

        if (!information.isEmpty()) {
            if (tagName.equals(Constants.TEG_LAST_NAME)) {
                try (FileWriter writer = new FileWriter(Constants.PATCH_FILE_SAX, true)) {
                    lastName = information;
                    writer.write(lastName + "\n");
                } catch (Exception ex) {
                    System.out.println("File not found");
                }
                System.out.println(lastName);
            }
            if (tagName.equals(Constants.TEG_FIRST_NAME)) {
                try (FileWriter writer = new FileWriter(Constants.PATCH_FILE_SAX, true)) {
                    firstName = information;
                    writer.write(firstName + "\n");
                } catch (Exception ex) {
                    System.out.println("File not found");
                }
                System.out.println(firstName);
            }
            if (tagName.equals(Constants.TEG_TITLE)) {
                try (FileWriter writer = new FileWriter(Constants.PATCH_FILE_SAX, true)) {
                    title = information;
                    writer.write(title + "\n");
                } catch (Exception ex) {
                    System.out.println("File not found");
                }
                System.out.println(title);
            }if (tagName.equals(Constants.TEG_LINE)) {

                try (FileWriter writer = new FileWriter(Constants.PATCH_FILE_SAX, true)) {
                    line = information;
                    writer.write(line + "\n");
                } catch (Exception ex) {
                    System.out.println("File not found");
                }
                System.out.println(line);
            }
        }

    }
}
