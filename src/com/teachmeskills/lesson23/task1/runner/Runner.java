package com.teachmeskills.lesson23.task1.runner;

import com.teachmeskills.lesson23.task1.model.Sonnet;
import com.teachmeskills.lesson23.task1.parser.DomParser;

public class Runner {
    public static void main(String[] args) throws Exception {
        Sonnet sonnet = new Sonnet();
        DomParser.parser(sonnet);

    }
}
