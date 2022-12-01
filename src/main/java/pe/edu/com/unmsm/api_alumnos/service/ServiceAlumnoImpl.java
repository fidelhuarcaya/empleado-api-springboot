package pe.edu.com.unmsm.api_alumnos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.com.unmsm.api_alumnos.model.Trabajador;
import pe.edu.com.unmsm.api_alumnos.repository.RepositoryAlumno;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;


@Service
public class ServiceAlumnoImpl implements ServiceAlumno{
    private final RepositoryAlumno repositoryAlumno;
    @Autowired
    public ServiceAlumnoImpl(RepositoryAlumno repositoryAlumno) {
        this.repositoryAlumno = repositoryAlumno;
    }

    @Override
    public Trabajador insertAlumno(Trabajador trabajador) {
        /*LocalDateTime ldt = LocalDateTime
                .parse(trabajador.getFechaRegistro().atZone(ZoneId.of("America/Lima")).toString());
        System.out.println(ldt);
        LocalDate ld = ldt.toLocalDate();
        System.out.println(ld);
        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.FRANCE);
        Trabajador tra=repositoryAlumno.save(trabajador);
        tra.setFechaRegistro(ldt);*/
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
