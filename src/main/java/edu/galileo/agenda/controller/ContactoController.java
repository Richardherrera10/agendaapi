package edu.galileo.agenda.controller;

import edu.galileo.agenda.model.Contacto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.galileo.agenda.service.ContactoService;

import java.util.List;
@Controller
@RequestMapping("api/v1/contacto")
public class ContactoController {
    private ContactoService contactoService;
    ContactoController(ContactoService contactoService ){
        this.contactoService = contactoService;
    }
    @GetMapping
    public List<Contacto> getAll() {
        return this.contactoService.list();
    }
    @PostMapping
    public Contacto add(@RequestBody(required = true) Contacto contacto) {
        return this.contactoService.add(contacto);
    }
}
