package com.QuickHit;

import java.util.Random;

public class Game {
    
    
    /*
        输出字符串
        按照级别不同产生不同的字符串
     */
    public String printStr(){
        int strLength = 6;
        StringBuffer stringBuffer = new StringBuffer();
        /*
            产生字符串的长度
            1  2个
            2  3个
            3   4个
            ...
         */
        for (int i = 0; i < strLength; i++) {
            int random = new Random().nextInt(strLength);
            switch (random) {
                case 0:
                    stringBuffer.append(">");
                    break;
                case 1:
                    stringBuffer.append("<");
                    break;
                case 2:
                    stringBuffer.append("*");
                    break;
                case 3:
                    stringBuffer.append("&");
                    break;
                case 4:
                    stringBuffer.append("%");
                    break;
                case 5:
                    stringBuffer.append("#");
                    break;
                }
            }
        return stringBuffer.toString();
    }

    public void printResult(){

    }
}
