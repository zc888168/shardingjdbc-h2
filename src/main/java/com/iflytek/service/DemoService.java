package com.iflytek.service;

import com.google.common.collect.Lists;
import com.iflytek.mapper.TorderMapper;
import com.iflytek.model.Torder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description:
 * Created by chaoz2 on 2018/12/19.
 */
@Service
public class DemoService {
    @Resource
    private TorderMapper mapper;

    public void index() {
        Object obj = mapper.selectByPrimaryKey(1L);
        System.out.println(obj);
    }

    public void batchInsert(Long id) {
        List<Torder> list = Lists.newArrayList();
        Torder tOrder = new Torder();
        tOrder.setOrderId(id);
        tOrder.setUserId(id);
        list.add(tOrder);
        Torder tOrder2 = new Torder();
        tOrder2.setUserId(id + 1);
        tOrder2.setOrderId(id + 1);
        list.add(tOrder2);
        mapper.insertBatch(list);
    }

    public int batchSave(List<Torder> list){
       return mapper.insertBatch(list);
    }

    public Object get(Long id) {
        return mapper.selectByPrimaryKey(id);
    }
}
