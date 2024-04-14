package com.teachmeskills.lesson23.task1.parser;

import com.teachmeskills.lesson23.task1.constants.Constants;
import com.teachmeskills.lesson23.task1.service.Service;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.FileWriter;

/**
 * The DomParser class contains the parser method, which parses an XML document using the DOM method
 */
public class DomParser {

    public static void parser() throws Exception {
        Node rootNode = Service.fileInputDom().getFirstChild();
        NodeList nodeSonnet = rootNode.getChildNodes();
        String lastName = null;
        String firstName = null;
        String title = null;
        Node authorNode = null;
        Node linesNode = null;

        for (int i = 0; i < nodeSonnet.getLength(); i++) {
            if (nodeSonnet.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            switch (nodeSonnet.item(i).getNodeName()) {
                case Constants.TEG_AUTHOR: {
                    authorNode = nodeSonnet.item(i);
                }
                break;
                case Constants.TEG_TITLE: {
                    try (FileWriter writer = new FileWriter(Constants.PATCH_FILE_DOM, true)) {
                        title = nodeSonnet.item(i).getTextContent();
                        writer.write(title + "\n");
                    } catch (Exception ex) {
                        System.out.println("File not found");
                    }
                    System.out.println("Title: " + title);
                }
                break;
                case Constants.TEG_LINES: {
                    linesNode = nodeSonnet.item(i);
                }
                break;
            }
        }

        NodeList nodeAuthor = authorNode.getChildNodes();
        for (int i = 0; i < nodeAuthor.getLength(); i++) {
            if (nodeAuthor.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (nodeAuthor.item(i).getNodeName()) {
                case Constants.TEG_LAST_NAME: {
                    try (FileWriter writer = new FileWriter(Constants.PATCH_FILE_DOM, true)) {
                        lastName = nodeAuthor.item(i).getTextContent();
                        writer.write(lastName + "\n");
                    } catch (Exception ex) {
                        System.out.println("File not found");
                    }
                    System.out.println("Last Name: " + lastName);
                }
                break;
                case Constants.TEG_FIRST_NAME: {
                    try (FileWriter writer = new FileWriter(Constants.PATCH_FILE_DOM, true)) {
                        firstName = nodeAuthor.item(i).getTextContent();
                        writer.write(firstName + "\n");
                    } catch (Exception ex) {
                        System.out.println("File not found");
                    }
                    System.out.println("Firs tName: " + firstName);
                }
                break;
            }
        }
        NodeList nodeLines = linesNode.getChildNodes();
        System.out.println("Sonnet: ");
        String line = null;
        for (int i = 0; i < nodeLines.getLength(); i++) {
            if (nodeLines.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (nodeLines.item(i).getNodeName()) {
                case Constants.TEG_LINE: {
                    try (FileWriter writer = new FileWriter(Constants.PATCH_FILE_DOM, true)) {
                        line = nodeLines.item(i).getTextContent();
                        writer.write(line + "\n");
                    } catch (Exception ex) {

                        System.out.println("File not found");
                    }
                    System.out.println(line);
                }
                break;
            }
        }
    }
}

