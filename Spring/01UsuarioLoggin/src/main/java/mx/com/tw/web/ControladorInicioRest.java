package mx.com.tw.web;

import java.util.List;
import mx.com.tw.dao.PersonaDao;
import mx.com.tw.domain.Persona;
import mx.com.tw.servicio.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ControladorInicioRest {

    private final PersonaDao repository;

    ControladorInicioRest(PersonaDao repository) {
        this.repository = repository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/employees")
    List<Persona> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @Autowired
    private SendMailService sendmailServ;

    @PostMapping("/employees")
    Persona newEmployee(@RequestBody Persona newEmployee) {
        sendmailServ.SendMailService(newEmployee);
        return repository.save(newEmployee);
    }

    // Single item
    @GetMapping("/employees/{id}x")
    Persona one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/employees/{id}")
    Persona replaceEmployee(@RequestBody Persona newEmployee, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setUser(newEmployee.getUser());
                    employee.setPassword(newEmployee.getPassword());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setIdPersona(id);
                    return repository.save(newEmployee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
