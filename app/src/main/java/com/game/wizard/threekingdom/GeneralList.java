package com.game.wizard.threekingdom;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.game.wizard.threekingdom.General;


/**
 * Created by Wizard on 2017/12/25.
 */

class GeneralList {
    public static General [] gList = new General[100];
    public static int GeneralNum = 0;

    public GeneralList()
    {

    };
    public GeneralList(InputStream isGL) {
        BufferedReader br = null;
        InputStreamReader isGLR;
        try {
            isGLR = new InputStreamReader(isGL, "Utf-8");
            br = new BufferedReader(isGLR);
        } catch(UnsupportedEncodingException e){
            e.printStackTrace();
            return;
        }


        String[] columnName =
                {"ID", "Name", "Type", "Strength", "Defence", "HP", "MP"}; // 列名
        int[] courseIndexs =
                {2, 3, 4}; // 数值的列
        int i, index = 0;
        String line;


        try {
            br.readLine(); // 去掉第一行
            i=0;
            index = 0;
            while ((line = br.readLine()) != null) {
                gList[i] = new General();
                index = 0;
                String[] se = line.split("\t");
                gList[i].setID(1);
                gList[i].setID(Integer.valueOf(se[index].toString()).intValue());
                index++;
                gList[i].setName(se[index]);
                index++;
                gList[i].setType(Integer.valueOf(se[index].toString()).intValue());
                index++;
                gList[i].setHealth(Integer.valueOf(se[index].toString()).intValue());
                index++;
                gList[i].setStrength(Integer.valueOf(se[index].toString()).intValue());
                index++;
                gList[i].setDefence(Integer.valueOf(se[index].toString()).intValue());
                i++;
                }
            GeneralNum = i;
            }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static int findGeneral(int i)    {
        int index = 0;
        for (index = 0; index < GeneralNum; index++){
            if (gList[index].getID() == i){
                return index;
            }
        }
        return -1;
    }
}
