package com.teachmeskills.lesson23.task1.service;

import com.teachmeskills.lesson23.task1.constants.Constants;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 *The Service class contains a fileInputDom method that reads an XML file
 */
public class Service {
    public static Document fileInputDom() throws Exception {
        File file = new File(Constants.PATCH_FILE_XML);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);
    }
}
