package pe.edu.com.unmsm.api_alumnos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.com.unmsm.api_alumnos.model.Trabajador;
import pe.edu.com.unmsm.api_alumnos.service.ServiceAlumnoImpl;


@RestController
@RequestMapping("/api/v1/alumnos")
public class ControllerAlumno {

    private final ServiceAlumnoImpl serviceAlumno;

    @Autowired
    public ControllerAlumno(ServiceAlumnoImpl serviceAlumno) {
        this.serviceAlumno = serviceAlumno;
    }

    @RequestMapping
    public ResponseEntity<Object> getProduct() {
        return new ResponseEntity<>(serviceAlumno.getAllAlumnos(), HttpStatus.OK);
    }
    @PostMapping
    private Trabajador addAlumno(@RequestBody Trabajador trabajador){
        serviceAlumno.insertAlumno(trabajador);
        return serviceAlumno.insertAlumno(trabajador);
    }
    @PutMapping
    public ResponseEntity<Object> updateAlumno(@RequestBody Trabajador trabajador) {
        System.out.println(trabajador.toString());
        if (serviceAlumno.getAlumno(trabajador.getId()).isPresent())
        serviceAlumno.updateAlumno(trabajador);
        else return new ResponseEntity<>("Not exist id of alumno", HttpStatus.NOT_MODIFIED);
        return new ResponseEntity<>("Alumno is updated successsfully", HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    private ResponseEntity<Object> deleteAlumno(@PathVariable("id") Long id){
        serviceAlumno.deleteAlumno(id);
        return new ResponseEntity<>("Alumno is deleted successsfully", HttpStatus.OK);
    }
    @GetMapping("/{id}")
    private ResponseEntity<Object> getAlumno(@PathVariable("id") Long id){
        return new ResponseEntity<>(serviceAlumno.getAlumno(id), HttpStatus.OK);
    }
}
