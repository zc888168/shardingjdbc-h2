package com.example.demo.service;

import com.example.demo.AbstractTestBase;
import com.google.common.collect.Lists;
import com.iflytek.model.Torder;
import com.iflytek.service.DemoService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description:
 * Created by chaoz2 on 2018/12/20.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DemoServiceTest extends AbstractTestBase {

    @Resource
    private DemoService demoService;

    @Test
    public void testIndex(){
        demoService.index();
    }
    @Test
    public void testBatch(){
        demoService.batchInsert(40000L);
        Object obj1 = demoService.get(40000L);
        Object obj2 = demoService.get(40001L);
        System.out.println(obj1.toString() + " " + obj2.toString());
    }

    @Test
    public void batchSave(){
        List<Torder> list = Lists.newArrayList();
        Torder tOrder = new Torder();
        tOrder.setOrderId(70000L);
        tOrder.setUserId(70000L);
        list.add(tOrder);
        Torder tOrder2 = new Torder();
        tOrder2.setUserId(70001L);
        tOrder2.setOrderId(70000L);
        list.add(tOrder2);
        demoService.batchSave(list);
    }
}
