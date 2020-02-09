package com.basic.tu.jvm;

import com.google.common.collect.Lists;

import java.util.List;

public class Test5 {

    public static void main(String[] args) throws Exception {

        List<Data> datas = Lists.newArrayList();

        for (int i = 0; i < 10000; i++) {
            datas.add(new Data());
        }

        Thread.sleep(1 * 60 * 60 * 1000);

    }

    static class Data{

    }


}
