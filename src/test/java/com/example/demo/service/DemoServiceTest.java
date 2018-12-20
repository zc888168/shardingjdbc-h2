package com.example.demo.service;

import com.example.demo.AbstractTestBase;
import com.iflytek.service.DemoService;
import com.sun.media.sound.SoftTuning;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.annotation.Resource;

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
}
