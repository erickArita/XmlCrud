import Alumno.Alumno;
import xmlManager.XmlManager;

public class Main {
    public static void main(String[] args) throws Exception {


        XmlManager manager = new XmlManager();

        Alumno alumno = new Alumno("Erick", "20", "9889988", "0421200200847", "erick.emao@gmail.com", "M");

        manager.createAlumno(alumno);

        manager.listarAlumnos().forEach((a) -> System.out.println(a.toString()));

        Alumno gettedAlumno = manager.getAlumnoById("fc525448-7e3a-4743-9c77-d750250f964a");



//        manager.updateAlumno(gettedAlumno);
//
//
//        manager.deleteAlumno(alumno.getId());

    }
}