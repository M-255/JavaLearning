package com.tff.exercise.section11;
/*
 * @author 马战川
 * @date 2018/9/20 09:47
 * @description
 */

import java.util.*;

/**
 * @author 马战川
 * @version 1.0
 * @className E22WordsInfo
 * @date 2018/9/20 9:47
 * @description 1.list有排序函数，前提是list中的对象里包装了Comparator对象。
 * 2.Java8引入了箭头函数，简化了代码。
 */
public class E22WordsInfo {

    //这里参数使用Iterator是因为可以让此函数可重用性提高，所有实现了Iterator接口的集合都可以使用此函数。
    private static void updateStat(Iterator<WordCounter> it, WordCounter wc) {
        while (it.hasNext()) {
            WordCounter currentWC = it.next();
            if (currentWC.equals(wc)) {
                currentWC.incFrequency();
            }
        }
    }

    public static void main(String[] args) {
        //使用set的原因是set的查找效率高,也可以用其他集合来存储。
        Set<WordCounter> stat = new TreeSet<>();
        for (String word : "One two three four five five Four Three two one zero".split(" ")) {
            WordCounter wc = new WordCounter(word);
            if (stat.contains(wc))
                updateStat(stat.iterator(), wc);
            else
                stat.add(wc);
        }
        List<WordCounter> l = new ArrayList<>(stat);
        l.sort(WordCounter.CASE_INSENSITIVE_ORDER);
        l.forEach(wordCounter -> System.out.println(wordCounter.getWord() + " => " + wordCounter.getFrequency()));
    }
}

class WordCounter {
    public static final Comparator<WordCounter> CASE_INSENSITIVE_ORDER = (o1, o2) -> o1.word.compareToIgnoreCase(o2.word);

    private final String word;
    private int frequency;

    WordCounter(String word) {
        this.word = word;
        frequency = 1;
    }

    void incFrequency() {
        ++frequency;
    }

    String getWord() {
        return word;
    }

    int getFrequency() {
        return frequency;
    }

    public boolean equals(Object o) {
        return o instanceof WordCounter && word.equals(((WordCounter) o).word);
    }

    public int hashCode() {
        return word.hashCode();
    }
}


