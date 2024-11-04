package fr.mbds.testtypes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.FlushModeType;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersistanceTestService {


    @PersistenceContext
    private EntityManager entityManager;

    @Autowired BookRepository bookRepository;
    @Autowired AuthorRepository authorRepository;

    public void test() {
        entityManager.setFlushMode(FlushModeType.COMMIT);
        Author author = Author.builder().name("Author 1").build();
        authorRepository.save(author);
//        entityManager.persist(author);
            // iterate 1M times
            long timer = System.currentTimeMillis();
            for (int i = 0; i < 1_000_000; i++) {
                Book book = Book.builder().name("Book " + i).author(author).description("Description "+i).isbn("aze2a1z51c81aze").pages(i*57).language("fr").publisher("Publisher "+i).build();
//                entityManager.persist(book);
//                bookRepository.saveAndFlush(book);
                bookRepository.save(book);
                if (i % 10000 == 0) {
                    System.out.println("["+i+"] Time: " + (System.currentTimeMillis() - timer));
                    timer = System.currentTimeMillis();
                }
//                if (i % 50 == 0)
//                {
//                    entityManager.flush();
//                    entityManager.clear();
//                }
            }
    }

}
