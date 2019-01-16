package com.hnam.tikihomeassigment;

import java.util.Random;

/**
 * Created by nampham on 1/16/19.
 */
public class Utils {
    public static String formatData(String data){
        String[] t = data.split(" ");
        if (t.length == 1){
            return t[0];
        } else {
            int numSpace = t.length - 1;
            Random rand = new Random();
            int n = rand.nextInt(numSpace);
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < t.length; i++){
                builder.append(t[i]);
                if (i == n){
                    builder.append("\n");
                } else {
                    builder.append(" ");
                }
            }
            return builder.toString();
        }
    }
}
