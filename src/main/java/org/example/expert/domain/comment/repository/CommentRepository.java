package org.example.expert.domain.comment.repository;

import org.example.expert.domain.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByTodoId(Long todoId);
}
