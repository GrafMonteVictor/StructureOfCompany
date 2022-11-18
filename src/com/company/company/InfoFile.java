package com.company.company;

import java.util.ArrayList;

public class InfoFile {
    DataFromFile dataFromFile;

    public InfoFile(DataFromFile dataFromFile) {
        this.dataFromFile = dataFromFile;
    }

    public void print() {
        //выводим список сотрудников из файла
        ArrayList<String> tempListEmpl = dataFromFile.getEmployers();
        System.out.println("The list of employers from new file: ");
        for (String s: tempListEmpl) {
            System.out.println(s);
        }
        //средняя зарплата
        double averageSal = 0;
        for (String s : tempListEmpl) {
            String[] tempAr = s.split("\\|");
            averageSal += Integer.parseInt(tempAr[tempAr.length - 1]);
        }
        System.out.println("The average salary: " + averageSal);
        //выводим количество сотрудников
        System.out.println("Count of humans: " + dataFromFile.getEmployers().size());
    }
}
