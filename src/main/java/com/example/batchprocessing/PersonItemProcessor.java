package com.example.batchprocessing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private long sleepMills = 0l;
    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    public PersonItemProcessor(String sleep) {
        this.sleepMills = Long.parseLong(sleep);
    }

    @Override
    public Person process(Person item) throws Exception {
        final String firstName = item.getFirstName().toUpperCase();
        final String lastName = item.getLastName().toUpperCase();
        Thread.sleep(sleepMills);

        final Person transformedPerson = new Person(firstName, lastName);

        log.info(" Converting (" + item + ") into (" + transformedPerson + "_");
        return transformedPerson;
    }
}
