import java.util.ArrayList;
/**
 * Klasse for å holde liste av studenter.
 *
 * @author Kristina
 * @version 1.0
 */
public class StudentSystem
{
    // felt
    private ArrayList<Student> studenter;

    /**
     * Constructor.
     */
    public StudentSystem()
    {
        studenter = new ArrayList<Student>();
    }

    /**
     * Liste alle studentene.
     */
    public void listAlleStudenter()
    {
        for(Student student : studenter)
            student.listStudent();
    }
}
