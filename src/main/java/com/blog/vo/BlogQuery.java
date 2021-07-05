package com.blog.vo;

/**
 * @author 灬丨倾注你的笑丶
 * @date 2021/6/16 17:48
 */
public class BlogQuery {
    //标题
    private String title;
    //ID
    private Long typeId;

    private boolean recommend;

    public BlogQuery() {
    }

    @Override
    public String toString() {
        return "BlogQuery{" +
                "title='" + title + '\'' +
                ", typeId=" + typeId +
                ", recommend=" + recommend +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }
    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

}
