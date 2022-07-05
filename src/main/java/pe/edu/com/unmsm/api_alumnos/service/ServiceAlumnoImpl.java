package pe.edu.com.unmsm.api_alumnos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.com.unmsm.api_alumnos.model.Alumno;
import pe.edu.com.unmsm.api_alumnos.repository.RepositoryAlumno;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceAlumnoImpl implements ServiceAlumno{
    private final RepositoryAlumno repositoryAlumno;
    @Autowired
    public ServiceAlumnoImpl(RepositoryAlumno repositoryAlumno) {
        this.repositoryAlumno = repositoryAlumno;
    }

    @Override
    public Alumno insertAlumno(Alumno alumno) {
        return repositoryAlumno.save(alumno);
    }

    @Override
    public void deleteAlumno(Long id) {
    repositoryAlumno.deleteById(id);
    }

    @Override
    public List<Alumno> getAllAlumnos() {
        return repositoryAlumno.findAll();
    }

    @Override
    public Alumno updateAlumno(Alumno alumno) {
        return repositoryAlumno.save(alumno);
    }

    @Override
    public Optional<Alumno> getAlumno(Long id) {
        return repositoryAlumno.findById(id);
    }
}
