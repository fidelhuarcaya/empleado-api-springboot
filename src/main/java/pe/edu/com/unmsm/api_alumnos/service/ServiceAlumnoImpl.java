package pe.edu.com.unmsm.api_alumnos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.com.unmsm.api_alumnos.model.Trabajador;
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
    public Trabajador insertAlumno(Trabajador trabajador) {
        return repositoryAlumno.save(trabajador);
    }

    @Override
    public void deleteAlumno(Long id) {
    repositoryAlumno.deleteById(id);
    }

    @Override
    public List<Trabajador> getAllAlumnos() {
        return repositoryAlumno.findAll();
    }

    @Override
    public Trabajador updateAlumno(Trabajador trabajador) {
        return repositoryAlumno.save(trabajador);
    }

    @Override
    public Optional<Trabajador> getAlumno(Long id) {
        return repositoryAlumno.findById(id);
    }
}
