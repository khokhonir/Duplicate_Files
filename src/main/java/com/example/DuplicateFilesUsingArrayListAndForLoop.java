package com.example;

import lombok.extern.slf4j.Slf4j;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class DuplicateFilesUsingArrayListAndForLoop {

    public void getDuplicatesString(){

        File directory = new File("C:\\dev\\duplicateFiles\\testingFiles");
        List<File> fileSystem1 = new ArrayList<>(List.of(directory.listFiles()));

        try {

            for(int i= 0 ; i < fileSystem1.size(); i++ ) {
                for(int j  = i+1 ; j < fileSystem1.size(); j++ ) {
                    if (fileSystem1.get(i).length() == fileSystem1.get(j).length() ) {
                        Path path1 = Path.of(fileSystem1.get(i).getAbsolutePath());
                        Path path2 = Path.of(fileSystem1.get(j).getAbsolutePath());
                        long position = Files.mismatch(path1, path2);
                        if(position == -1){
                            if(!fileSystem1.get(i).getAbsolutePath().equals(fileSystem1.get(j).getAbsolutePath()))

                                log.info("\n Duplicate Files Using For Loop  and Arraylist ");
                                log.info("The grouped duplicate file paths are : " + fileSystem1.get(i).getAbsolutePath() + " and " + fileSystem1.get(j).getAbsolutePath() + " \n ");

                        }
                    }
                }
            }
    }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}