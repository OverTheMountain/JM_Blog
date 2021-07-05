package com.blog.service;

import com.blog.po.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 灬丨倾注你的笑丶
 * @date 2021/6/22 21:25
 */

public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
