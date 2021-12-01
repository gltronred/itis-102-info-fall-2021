package ru.kfu;

public class GroupHead extends Student {
    public GroupHead(String name) { super(name); }
    public void changeGroup(String group) {
        // Не компилируется: нельзя получить доступ к private!
        // this.setName(this.name + " " + group);
        this.setGroup(group);
    }
}
