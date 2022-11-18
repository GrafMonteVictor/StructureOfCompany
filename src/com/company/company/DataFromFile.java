package com.company.company;

import java.util.ArrayList;

public class DataFromFile {
    private ArrayList<String> employers = new ArrayList<>();

    public ArrayList<String> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<String> employers) {
        this.employers = employers;
    }

    public void addEmployer(String employer) {
        employers.add(employer);
    }

}
