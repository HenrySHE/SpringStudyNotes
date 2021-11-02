package com.henryshe.study.notes.contorller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: SpringStudyNotes
 * @description:
 * @author: shehy2
 * @create: 2021-10-14 16:44
 **/

public class TestSplit {
    public static void test(String text){
        text = text.replaceAll("？","\\?");

        int lastIndex = text.lastIndexOf("?");
        System.out.println(text.substring(lastIndex+1));

        Pattern p = Pattern.compile("[^\\?\\.\\!]+\\?");
        Matcher m = p.matcher(text);

        List<String> questions = new ArrayList<String>();

        while (m.find()) {
            questions.add(m.group());
        }

        String text2 = text;
        for (String question : questions) {
            System.out.println("===="+ question + "====");
            text2 = text2.replace(question,"");
        }
        System.out.println("替换后结果："+ text2);
        System.out.println(text);
    }

    public static void test2(String clause) {
        if (clause.isEmpty()){
            System.out.println("空，不分析");
        }
        clause = clause.replaceAll("？","\\?");
        String lastChar = clause.substring(clause.length() - 1);
        if (lastChar.equals("吗") || lastChar.equals("么") || lastChar.equals("?")) {
            System.out.println("包含，去除");
        }else if (clause.contains("?")){
            int lastIndex = clause.lastIndexOf("?");
            clause = clause.substring(lastIndex+1);
            System.out.println(clause);
        }

    }

    public static void main(String[] args) {
        List<String> textList = new LinkedList<>();
        textList.add("异响吗？我的沃尔沃用车两个月问题报告");
        textList.add("车两个月问题报告那么");
        textList.add("按时发达？发送到发？阿斯蒂芬么是");
        for(String text: textList){
            test2(text);
        }


    }
}


