package com.example;

import lombok.extern.slf4j.Slf4j;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class DuplicateFilesUsingArrayAndForLoop {

    public void getDuplicatesString(){

        File directory = new File("C:\\dev\\duplicateFiles\\testingFiles");
        File[] fileSystem1 = directory.listFiles();

        try {

            for(int i= 0 ; i < fileSystem1.length; i++ ) {
                for(int j  = i+1 ; j < fileSystem1.length; j++ ) {
                    if (fileSystem1[i].length() == fileSystem1[j].length()) {
                        Path path1 = Path.of(fileSystem1[i].getAbsolutePath());
                        Path path2 = Path.of(fileSystem1[j].getAbsolutePath());
                        long position = Files.mismatch(path1, path2);
                        if(position == -1){
                            if(!fileSystem1[i].getAbsolutePath().equals(fileSystem1[j].getAbsolutePath()))

                                log.info("\n Duplicate Files Using For Loop  and Array ");
                                log.info("The grouped duplicate file paths are : " + fileSystem1[i].getAbsolutePath() + " and " + fileSystem1[j].getAbsolutePath() + " \n ");

                        }
                    }
                }
            }
    }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}