package minh.hongle.elasticsearch.service;

import minh.hongle.elasticsearch.document.Person;
import minh.hongle.elasticsearch.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository)
    {
        this.personRepository = personRepository;
    }

    public Person save(final Person person)
    {
        return personRepository.save(person);
    }

    public Person findById(final String id)
    {
        return personRepository.findById(id).orElseThrow(null);
    }
}
