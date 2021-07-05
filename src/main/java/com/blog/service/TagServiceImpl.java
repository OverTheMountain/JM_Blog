package com.blog.service;

import com.blog.dao.TagRepostiory;
import com.blog.po.Tag;
import com.blog.web.NotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 灬丨倾注你的笑丶
 * @date 2021/6/14 17:45
 */
@Service
public class TagServiceImpl implements TagService{

    @Autowired
    TagRepostiory tagRepostiory;

    @Transactional
    @Override
    public Tag saveTag(Tag tag) {
        return tagRepostiory.save(tag);
    }

    @Transactional
    @Override
    public Tag getTag(Long id) {
        return tagRepostiory.getOne(id);
    }

    @Transactional
    @Override
    public Tag getTagByName(String name) {
        return tagRepostiory.getByName(name);
    }

    @Transactional
    @Override
    public Page<Tag> listTag(Pageable pageable) {
        return tagRepostiory.findAll(pageable);
    }

    @Override
    public List<Tag> listTag() {
        return tagRepostiory.findAll();
    }

    @Override
    public List<Tag> listTagTop(Integer size) {
        Sort sort = Sort.by(Sort.Direction.DESC, "blogs.size");
        Pageable pageable = PageRequest.of(0,size,sort);
        return tagRepostiory.findTop(pageable);
    }

    @Override
    public List<Tag> listTag(String ids) {
        return tagRepostiory.findAllById(converToList(ids));
    }

    private List<Long> converToList(String ids){
        List<Long> list = new ArrayList<>();
        if(!"".equals(ids) && ids != null){
            String[] idarray = ids.split(",");
            for (int i=0;i<idarray.length;i++){
                list.add(new Long(idarray[i]));
            }
        }
        return list;
    }

    @Transactional
    @Override
    public Tag updateTag(Long id, Tag tag) {
        Tag t = tagRepostiory.getOne(id);
        if(t == null){
            throw new NotFoundException("不存在该标签");
        }
        BeanUtils.copyProperties(tag,t);
        return tagRepostiory.save(t);
    }

    @Transactional
    @Override
    public void deleteTag(Long id) {
        tagRepostiory.deleteById(id);
    }
}
