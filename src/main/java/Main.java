import controller.ToWord;
import controller.ExeclTo;
import model.Student;


public class Main {



    public static void main(String[] args) throws Exception {

        Student student = new Student();
        ExeclTo execlTo = new ExeclTo();
        ToWord toWord = new ToWord();
        execlTo.execl(student);
        toWord.word(student);

    }
}
