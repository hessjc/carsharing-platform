package controllers;

import models.Event;
import play.Routes;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.fasterxml.jackson.databind.node.ObjectNode;

public class Application extends Controller {

    public static Result index() {
        return ok(views.html.start.render());
    }

    public static Result addEvent(String title, String user, String car,
            String description, String date) {
        Event event = new Event(title, user, car, description, date);
        event.save();
        ObjectNode result = Json.newObject();
        result.put("status", "OK");
        return ok(result);
    }

    public static Result javascriptRoutes() {
        response().setContentType("text/javascript");
        return ok(Routes.javascriptRouter("myJsRoutes",
                routes.javascript.Application.addEvent()));
    }
}
