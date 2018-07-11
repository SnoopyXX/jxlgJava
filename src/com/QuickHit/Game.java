package com.QuickHit;

import java.util.Random;

public class Game {
    
    Player player;
    /*
        输出字符串
        按照级别不同产生不同的字符串
     */
    public String printStr(){
        int strLength = new Level().getStrLength();
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

    /*
        判断玩家输入，并输出结果
        @param input 玩家输入
        @param out 输出
     */
    public void printResult(String input,String out){

        boolean flag = false;
        //判断输入和输出是否相同
        if(input.equals(out)){
            flag = true;
        }else{
            flag = false;
        }

        //如果相同
        if(flag){
            long currentTime = System.currentTimeMillis();
            //如果超时
            if((currentTime - player.getStartTime())/1000
                    >new Level().getTimeLimit()){//
                System.out.println("超时，退出");
                System.exit(1);
            }else{
                //如果没超时
                //1 当前积分
                player.setCurScore(new Level().getPerScore());//
                //2 已用时间
                player.setEclpsedTime((int)((currentTime - player.getStartTime())/1000));
                System.out.println(player.getLevelNo() + ","+
                                    player.getCurScore() + ","+
                                    player.getEclpsedTime()
                );
                //判断用户是否到了最后一关
                if(player.getLevelNo() == 6){
                    int score = new Level().getPerScore()
                            * new Level().getStrTimes();

                    if(player.getCurScore() == score){
                        System.out.println("成功");
                        System.exit(0); //正常退出程序
                    }
                }
            }
        }else{
            System.out.println("输出错误");
            System.exit(1);//非正常退出
        }

    }
}
