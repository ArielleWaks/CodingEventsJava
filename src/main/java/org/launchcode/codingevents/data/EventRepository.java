package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
//    CrudRepository is a base interface we are extending
//    allows us to interact w/Event objects in the database
//    Event: what types of things/objects we are storing
//    Integer: datatype of primary key

//    since this is an interface, no instances can be created
//    need a concrete class that implements EventRepository
//    springboot/java creates classes on the fly and stores it in memory when app is running
}
