package ru.kfu;

public class Teacher {
    String subject;
    public Teacher(String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public static void main(String[] args) {
        System.out.println("Run main from ru.kfu.Teacher");
    }
}
