package com.djh;

import cn.hutool.core.*;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Console;
import cn.hutool.log.dialect.console.ConsoleLog;

public class HutoolTest {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3"};
        Integer[] ints = Convert.toIntArray(arr);
        Console.log(ints);
        Console.log("---------");
        Console.log("----第二次添加-----");
        Console.log("----第三次添加-----");
        Console.log("----第四次添加-----");
        Console.log("----创建分支div-----");
    }
}
