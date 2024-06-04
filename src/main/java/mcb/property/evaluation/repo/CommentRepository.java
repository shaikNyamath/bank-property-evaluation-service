package mcb.property.evaluation.repo;

import mcb.property.evaluation.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {}
