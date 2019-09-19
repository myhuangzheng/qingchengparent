package com.qingcheng.dao;

import com.qingcheng.pojo.goods.Brand;
import tk.mybatis.mapper.common.Mapper;

/**
 * 继承了泛型为Brand的类,就具有了,增删改查的方法
 */
public interface BrandMapper extends Mapper<Brand> {

}
