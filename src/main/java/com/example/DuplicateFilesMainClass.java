package com.example;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
public class DuplicateFilesMainClass {

    static DuplicateFilesUsingArrayAndForLoop duplicateFilesUsingArrayAndForLoop = new DuplicateFilesUsingArrayAndForLoop();
    static DuplicateFilesUsingArrayListAndForLoop duplicateFilesUsingArrayListAndForLoop = new DuplicateFilesUsingArrayListAndForLoop();
    static DuplicateFilesUsingLinkedListAndForLoop duplicateFilesUsingLinkedListAndForLoop = new DuplicateFilesUsingLinkedListAndForLoop();

    public synchronized static void main(String[] args) {

        try {

            long startTime1 = System.nanoTime();
            duplicateFilesUsingArrayAndForLoop.getDuplicatesString();
            long  endTime1 = System.nanoTime();
            long totalTime1 = TimeUnit.NANOSECONDS.toMillis(endTime1 - startTime1);
            log.info("Loop : {} , Data Structure : {} , Processing time in milli seconds : {}", "For", "Array", totalTime1);


            long startTime2 = System.nanoTime();
            duplicateFilesUsingArrayListAndForLoop.getDuplicatesString();
            long  endTime2 = System.nanoTime();
            long totalTime2 = TimeUnit.NANOSECONDS.toMillis(endTime2 - startTime2);
            log.info("Loop : {} , Data Structure : {} , Processing time in milli seconds : {}", "For", "ArrayList", totalTime2);


            long startTime3 = System.nanoTime();
            duplicateFilesUsingLinkedListAndForLoop.getDuplicatesString();
            long  endTime3 = System.nanoTime();
            long totalTime3 = TimeUnit.NANOSECONDS.toMillis(endTime3 - startTime3);
            log.info("Loop : {} , Data Structure : {} , Processing time in milli seconds : {}", "For", "LinkedList", totalTime3);

        } catch (Exception e) {

            log.error("The error is: ", e.getMessage());
        }
    }
}