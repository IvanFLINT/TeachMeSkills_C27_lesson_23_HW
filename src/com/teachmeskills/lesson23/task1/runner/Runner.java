package com.teachmeskills.lesson23.task1.runner;

import com.teachmeskills.lesson23.task1.parser.DomParser;
import com.teachmeskills.lesson23.task1.parser.SaxMyParser;

import java.util.Scanner;

/**
 *The Runner class is executing. In the main method,
 *  the user is asked from the console which method to parse,
 *  the XML document and the corresponding methods are called.
 */
public class Runner {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a parsing method: 1 - DOM , 2 - SAX");
        try {
            int method = scanner.nextInt();
            switch (method) {
                case 1: {
                    DomParser.parser();
                }
                break;
                case 2: {
                    SaxMyParser.saxParser();
                }
                break;
                default: {
                    System.out.println("Incorrect data");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }finally {
            scanner.close();
        }
    }
}
