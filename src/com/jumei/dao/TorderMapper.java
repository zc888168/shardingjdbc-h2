package com.jumei.dao;

import com.jumei.model.Torder;

public interface TorderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Torder record);

    int insertSelective(Torder record);

    Torder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Torder record);

    int updateByPrimaryKey(Torder record);
}