package net.palacesoft.books;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Stateless
public class BookService {

    @PersistenceContext(unitName = "books-unit")
    private EntityManager entityManager;

    public Book find(Long id) {
        return entityManager.find(Book.class, id);
    }

    public void add(Book movie) {
        entityManager.persist(movie);
    }

    public void delete(Book movie) {
        entityManager.remove(movie);
    }

    public void delete(long id) {
        Book movie = entityManager.find(Book.class, id);
        delete(movie);
    }

    public List<Book> get() {
        CriteriaQuery<Book> cq = entityManager.getCriteriaBuilder().createQuery(Book.class);
        cq.select(cq.from(Book.class));
        return entityManager.createQuery(cq).getResultList();
    }
}
