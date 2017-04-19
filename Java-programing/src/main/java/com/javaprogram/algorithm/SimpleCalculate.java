package com.javaprogram.algorithm;

import java.util.Scanner;

/**
 * 实现简单的中文计算器
 * 如：输入二十加五 输出：二十五
 * 简单的加减法
 * @author 廖双龙
 */
public class SimpleCalculate {

    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.print(input);
    }

    /**
     * 中文分词，将中文转化成数字再计算
     * @param input
     * @return
     */
    public String calcuate(String input) {
        String output = "";
        input = input.replaceAll("加","+");
        input = input.replaceAll("减","-");
        input = input.replaceAll("乘","*");
        input = input.replaceAll("除","/");
        return  output;
    }

    public String transStringToNum(String input){
        String output = "";

        return  output;
    }

    public String transNumToString(String input){
        String output = "";

        return  output;
    }

}
