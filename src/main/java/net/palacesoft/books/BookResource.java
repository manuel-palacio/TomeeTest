package net.palacesoft.books;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/books")
public class BookResource {

    @EJB
    private BookService bookService;


    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Book> get() {
        return bookService.get();
    }
}
