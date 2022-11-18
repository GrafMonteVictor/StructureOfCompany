package com.company.test;

import com.company.company.DataFromFile;
import com.company.company.FileWithSortList;
import com.company.company.InfoFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataFromFile dataFromFile = new DataFromFile();
        System.out.println("Write the path to file");
        FileWithSortList file = new FileWithSortList();
        file.createNewFile(dataFromFile, sc.nextLine());
        InfoFile info = new InfoFile(dataFromFile);
        info.print();
    }
}
