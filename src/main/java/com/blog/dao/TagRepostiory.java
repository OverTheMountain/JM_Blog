package com.blog.dao;

import com.blog.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author 灬丨倾注你的笑丶
 * @date 2021/6/14 17:47
 */
public interface TagRepostiory extends JpaRepository<Tag,Long> {
    Tag getByName(String name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
