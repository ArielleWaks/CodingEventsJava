package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {
//    contains static methods and properties

//    need a place to put events
    private static final Map<Integer, Event> events = new HashMap<>();
    // Map is an interface; code to interfaces when possible
    // integers are goint to be the Ids; retrive event object given Id
    // final keyword adds additional security

//    get all events
    public static Collection<Event> getAll() {
        return events.values();
        //values method on Map interface that returns a Collection
        //Collection is an interface that extends the Iterable interface
        //Iterable interface when implemented gives the behavior of looping over a Collection
    }

//    get single events
    public static Event getById(int id) {
        return events.get(id);
    }

//    add an event to collection
    public static void add(Event event) {
        events.put(event.getId(), event);
        //key is Id, value is event
    }

//    remove an event from collection
    public static void remove(int id) {
        events.remove(id);
    }
}
