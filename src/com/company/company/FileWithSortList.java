package com.company.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;


public class FileWithSortList {

    public void createNewFile(DataFromFile company, String pathFile) {
        Path pathNewFile = creatingEmptyFile(pathFile);
        try {
            //чтение из файла
            ArrayList<String> list = (ArrayList<String>) Files.readAllLines(Path.of(pathFile));
            Collections.sort(list);
            company.setEmployers(list);
            //запись отсортированного списка в новый файл
            for (int i = 0; i < list.size(); i++) {
                String s = list.get(i)+"\n";
                Files.writeString(pathNewFile,s, StandardOpenOption.APPEND);
            }
            System.out.println("New file have saved successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Path creatingEmptyFile(String pathFile) { //создаём пустой файл
        Path pathOldFile = Path.of(pathFile);
        Path pathNewFile = pathOldFile.getParent().resolve("newFile.txt");
        try {
            if(Files.exists(pathNewFile)) {
                Files.delete(pathNewFile);
                Files.createFile(pathNewFile);
            } else {
                Files.createFile(pathNewFile);
            }
        } catch (IOException e) {
            System.out.println("File is have not created!");
            e.printStackTrace();
        }
        return pathNewFile;
    }

}