package net.palacesoft.books;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "books")
public class Book implements Serializable {

    @Id
    private long id;

    private String title;

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }
}
