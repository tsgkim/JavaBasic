package com.basic.tu.algorithm.model;


import lombok.Data;

import java.util.List;

/**
 * @company: MEGVII
 * @author: tushiguang
 * @create: 2021/7/23 17:16
 **/
@Data
public class InnerClass {
    private String a;
    private List<B> bs;

    @Data
    public static class B {
        private String b;
    }
}
