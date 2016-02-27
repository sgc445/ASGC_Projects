package teacher;

/**
 * Created by sgc on 2/11/16.
 */
public class TeacherMain {
    public static void main(String []args){
        TeacherServices teachserv = new TeacherServices();
        teachserv.setTeacherInfo();
        teachserv.getTeacherInfo();
    }
}
