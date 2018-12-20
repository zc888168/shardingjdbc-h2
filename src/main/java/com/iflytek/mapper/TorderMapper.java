package com.iflytek.mapper;

import com.iflytek.model.Torder;

import java.util.List;

public interface TorderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Torder record);

    int insertSelective(Torder record);

    Torder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Torder record);

    int updateByPrimaryKey(Torder record);

    int insertBatch(List<Torder> list);
}