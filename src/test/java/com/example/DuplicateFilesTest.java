package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Application.class)
public class DuplicateFilesTest {

    @Test
    public void checkWhetherTheFilesContentIsTheSame() throws IOException {

        Path path1 = Path.of("C:\\dev\\duplicateFiles\\testingFiles\\file2.txt");
        Path path2 = Path.of("C:\\dev\\duplicateFiles\\testingFiles\\file3.txt");
        long position = Files.mismatch(path1, path2);
        assertEquals(position,-1);

    }

    @Test
    public void checkWhetherTheFilesContentIsNotTheSame() throws IOException {

        Path path1 = Path.of("C:\\dev\\duplicateFiles\\testingFiles\\file1.txt");
        Path path2 = Path.of("C:\\dev\\duplicateFiles\\testingFiles\\file2.txt");
        long position = Files.mismatch(path1, path2);
        assertEquals(position, 7);

    }

}
