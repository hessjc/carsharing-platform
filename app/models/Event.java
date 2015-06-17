package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
@Table(name = "events")
public class Event extends Model {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    @Constraints.Min(10)
    public Long id;

    @Constraints.Required
    public String title;

    @Constraints.Required
    public String user;

    @Constraints.Required
    public String car;

    @Constraints.Required
    public String date;

    public String description;

    public Event(String title, String user, String car, String description, String date) {
        this.title = title;
        this.user = user;
        this.car = car;
        this.description = description;
        this.date = date;
    }

    public static Finder<Long, Event> find = new Finder<Long, Event>(
            Long.class, Event.class);
}
