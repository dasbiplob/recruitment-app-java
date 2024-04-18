package fi.epassi.recruitment.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import fi.epassi.recruitment.book.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel, UUID> {

    Optional<BookModel> findByIsbn(UUID isbn);

    List<BookModel> findByTitle(String title);

    List<BookModel> findByAuthor(String author);

    List<BookModel> findByAuthorAndTitle(String author, String title);
}
