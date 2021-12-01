import java.io.*;
import java.util.*;

import ru.kfu.*;
// import ru.kfu.Student;
// import ru.kfu.Teacher;

// Чужие пакеты должны находиться в classpath,
// чтобы java их нашла
// Например, "свои" пакеты находятся в папке
// с исходниками

public class L17 {
    public static void main(String[] args) {
        Student stud1 = new Student("Student1");
        System.out.println("Hello, " +
                           stud1.getName() +
                           "!");
        Teacher prog = new Teacher("Programming");
        System.out.println("Hello, teacher of " +
                           prog.getSubject());
    }
}
