package minh.hongle.elasticsearch.controller;

import minh.hongle.elasticsearch.document.Person;
import minh.hongle.elasticsearch.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService)
    {
        this.personService = personService;
    }

    @PostMapping
    public Person save(@RequestBody final Person person)
    {
        return personService.save(person);
    }

    @GetMapping
    public Person findById(@RequestParam(name = "id") final String id)
    {
        return personService.findById(id);
    }
}
