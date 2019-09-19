package com.qingcheng.pojo.goods;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 实现可序列号接口 Serializable ,因为需要在网络上进行传输
 * 使用dubbo分布式框架,实体类在网络上进行传输
 */

//指定数据库中对应的表名称
@Table(name = "tb_brand")
public class Brand implements Serializable {
    //品牌 id
    //标记数据表中的主键
    @Id
    private Integer id;

    //品牌名称 name
    private String name;

    //品牌图片地址 image
    private String image;

    //品牌的首字母 letter
    private String letter;

    //排序
    private Integer seq;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", letter='" + letter + '\'' +
                ", seq=" + seq +
                '}';
    }
}
