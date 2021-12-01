package ru.kfu;

public class Teacher {
    Subject subject;
    public Teacher(String subject) {
        this.subject = new Subject(subject);
    }
    public String getSubject() {
        return subject.getName();
    }
    public void teach(Student st) {
        System.out.println("Teaching " +
                           st.getName() +
                           " from " +
                           st.getUni());
    }
    public static void main(String[] args) {
        System.out.println("Run main from ru.kfu.Teacher");
    }
}
