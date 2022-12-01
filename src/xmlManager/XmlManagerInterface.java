package xmlManager;

import Alumno.Alumno;

import java.util.ArrayList;

public interface XmlManagerInterface {
    Alumno getAlumnoById(String id);

    boolean createAlumno(Alumno alumno) throws Exception;

    boolean updateAlumno(Alumno updatedAlumno) throws Exception;

    ArrayList<Alumno> listarAlumnos() throws Exception;

    boolean deleteAlumno(String id) throws Exception;
}
