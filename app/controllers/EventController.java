package controllers;

import java.util.List;

import models.Event;
import play.mvc.Controller;

public class EventController extends Controller {

    public static List<Event> events = Event.find.all();
}
