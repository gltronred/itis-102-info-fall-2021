import java.io.*;
import java.util.*;

import ru.kfu.*;
// import ru.kfu.Student;
// import ru.kfu.Teacher;
import com.other.Other;

// Чужие пакеты должны находиться в classpath,
// чтобы java их нашла
// Например, "свои" пакеты находятся в папке
// с исходниками

public class L17 {
    public static void main(String[] args) {
        System.out.println(Other.getSomething());
        Student stud1 = new Student("Student1");
        // Не скомпилируется: приватный метод
        // stud1.setName("dfasdf");
        System.out.println("Hello, " +
                           stud1.getName() +
                           "!");
        Teacher prog = new Teacher("Programming");
        System.out.println("Hello, teacher of " +
                           prog.getSubject());
        GroupHead head = new GroupHead("head");
        head.changeGroup("102");
        System.out.println(head.getName());
        prog.teach(head);
        // Не скомпилируется: нельзя получить доступ
        // извне пакета
        // System.out.println(head.getUni());
        //
        // Аналогично с классами:
        // Subject subj = new Subject("test");
    }
}
