package com.blog.service;

import com.blog.po.Blog;
import com.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @author 灬丨倾注你的笑丶
 * @date 2021/6/15 23:44
 */
public interface BlogService{
    Blog saveBlog(Blog blog);

    Blog getBlog(Long id);

    Blog getAndConvert(Long id);

    Blog updateBlog(Long id,Blog blog);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(Long tagId,Pageable pageable);

    Page<Blog> listBlog(String query,Pageable pageable);

    List<Blog> listRecommendBlogTop(Integer size);

    Map<String,List<Blog>> archiveBlog();

    Long countBlog();

    void deleteBlog(Long id);
}
