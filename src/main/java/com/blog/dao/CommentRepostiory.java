package com.blog.dao;

import com.blog.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 灬丨倾注你的笑丶
 * @date 2021/6/22 21:28
 */
public interface CommentRepostiory extends JpaRepository<Comment,Long> {
    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);
}
