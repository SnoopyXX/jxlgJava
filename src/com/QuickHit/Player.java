package com.QuickHit;

import java.util.Scanner;

public class Player {
    private int levelNo;
    private int curScore;
    private long startTime;
    private int eclpsedTime;

    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getCurScore() {
        return curScore;
    }

    public void setCurScore(int curScore) {
        this.curScore = curScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getEclpsedTime() {
        return eclpsedTime;
    }

    public void setEclpsedTime(int eclpsedTime) {
        this.eclpsedTime = eclpsedTime;
    }

    /*
        玩家玩游戏
     */
    public void player(){
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            this.levelNo += 1;//晋级
            this.startTime = System.currentTimeMillis();
            this.curScore = 0;//积分清0

            //循环比较字符串的输入、输出
            for (int j = 0; j < new Level().getStrTimes(); j++) {
                String outStr = game.printStr();//系统输出
                String inputStr = input.next();//用户输入
                game.printResult(inputStr,outStr);//结果
            }
        }
    }
}
/*
    mysql 数据库
    mysql jdbc 驱动jar包
    mysql jdbc
    mysql图形化管理工具 navicat for mysql,workbench,SQLyog
 */