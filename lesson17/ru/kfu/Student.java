package ru.kfu;

public class Student {
    private String name;
    protected String group;
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    protected void setGroup(String group) {
        this.group = group;
    }
    private void setName(String name) {
        this.name = name;
    }
    String getUni() { return "KFU"; }
}
