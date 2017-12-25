package com.game.wizard.threekingdom;

/**
 * Created by Wizard on 2017/12/25.
 */

public class InitialRoles {
    public static void InitialPlayer(){
        int i = 0, k = 0;
        int InitPlaySeries[] = {10,11,12};
        for (i=0;i<3;i++){
            Player.gPlayer[i] = new General();
            k = GeneralList.findGeneral(InitPlaySeries[i]);
            if(k>=0){
                Player.gPlayer[i].copyGeneral(GeneralList.gList[k]);
            }
        }
    }
    public static void InitialEnemy(){
        int i = 0, k = 0;
        int InitEnemySeries[] = {83,84,85};
        for (i=0;i<3;i++){
            Player.gEnemy[i] = new General();
            k = GeneralList.findGeneral(InitEnemySeries[i]);
            if(k>=0){
                Player.gEnemy[i].copyGeneral(GeneralList.gList[k]);
            }
        }
    }
}
