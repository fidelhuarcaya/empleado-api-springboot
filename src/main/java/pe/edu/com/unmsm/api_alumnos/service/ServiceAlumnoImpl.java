package pe.edu.com.unmsm.api_alumnos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.stereotype.Service;
import pe.edu.com.unmsm.api_alumnos.model.Trabajador;
import pe.edu.com.unmsm.api_alumnos.repository.RepositoryAlumno;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;


@Service
public class ServiceAlumnoImpl implements ServiceAlumno{
    private final RepositoryAlumno repositoryAlumno;
    @Autowired
    public ServiceAlumnoImpl(RepositoryAlumno repositoryAlumno) {
        this.repositoryAlumno = repositoryAlumno;
    }

    @Override
    public Trabajador insertAlumno(Trabajador trabajador) {

        Trabajador tra=repositoryAlumno.save(trabajador);
        ZoneId limaTime = ZoneId.of("America/Lima");
        LocalDateTime ldt = LocalDateTime.now(limaTime);
        tra.setFechaRegistro(ldt);
        return tra;
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

        Optional<Trabajador> t=repositoryAlumno.findById(id);
        if (t.isPresent())
        {
            ZoneId limaTime = ZoneId.of("America/Lima");
            LocalDateTime ldt = LocalDateTime.now(limaTime);

            DateTimeFormatter formatter
                    = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss[.SSSSSS]", Locale.ENGLISH);
            String aDate = "Jul 16, 2013 12:08:59 AM";
            String formattedDate = LocalDateTime.parse(t.get().getFechaRegistro().toString(), formatter)
                    .atOffset(ZoneOffset.UTC)
                    .atZoneSameInstant(limaTime)
                    .format(formatter);
            LocalDateTime aLDT = LocalDateTime.parse(formattedDate);
            t.get().setFechaRegistro(aLDT);

        }
        return t;
    }
}
