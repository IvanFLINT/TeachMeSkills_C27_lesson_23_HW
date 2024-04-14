package com.teachmeskills.lesson23.task1.service;

import com.teachmeskills.lesson23.task1.constants.Constants;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Service {
    public static Document fileInput() throws Exception {
        File file = new File(Constants.PATCH_FILE_XML);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);
    }
}
