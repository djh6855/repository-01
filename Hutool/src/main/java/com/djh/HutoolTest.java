package com.djh;

import cn.hutool.core.*;
import cn.hutool.core.convert.Convert;

public class HutoolTest {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3"};
        Integer[] ints = Convert.toIntArray(arr);
        System.out.println(ints);
    }
}
