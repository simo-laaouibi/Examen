package ma.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.projet.entities.Article;
@Repository
public interface ArticleRepository extends JpaRepository<Article,Long >  {

}
