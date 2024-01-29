package com.example.sampleproject;

import org.hibernate.engine.internal.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Expected array/list = [name1, name2, name4, name3, name3, name5]
//Expected output: 5EMAN-4EMAN-3EMAN-2EMAN-1EMAN
public class TechVerito {

    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("name1","name2","name4","name3","name3","name5");
        Comparator<String> stringComparator = Comparator.reverseOrder();
        list = list.stream().map(e->reverseString(e.toUpperCase())).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list);
        String rev ="";
        for(int i=0;i<list.size();i++){
            if(i==list.size()-1){
                rev+=list.get(i);
            }else{
                rev+=list.get(i)+"-";
            }

        }
        System.out.println(rev);
    }
}
