package com.sparta.cj.start;

import com.sparta.cj.factory.SortFactoryManager;
import com.sparta.cj.logging.CustomLoggerConfiguration;

import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger("SortManagerLogger");
    public static void main(String[] args) {
        CustomLoggerConfiguration.configureLogger(logger);
        SortFactoryManager.userInterface();
    }
}
