package com.game.wizard.threekingdom;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.game.wizard.threekingdom.GeneralList;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView CavaLry1 = (TextView)findViewById(R.id.Cavalry1);
        TextView CavaLry2 = (TextView)findViewById(R.id.Cavalry2);
        TextView CavaLry3 = (TextView)findViewById(R.id.Cavalry3);

        TextView eCavaLry1 = (TextView)findViewById(R.id.eCavalry1);
        TextView eCavaLry2 = (TextView)findViewById(R.id.eCavalry2);
        TextView eCavaLry3 = (TextView)findViewById(R.id.eCavalry3);

        InputStream isGL=getResources().openRawResource(R.raw.general);
        GeneralList GL = new GeneralList(isGL);
        InitialRoles.InitialPlayer();
        InitialRoles.InitialEnemy();

        //String Name1 = GL.GeneralList.get(0).get("Name").toString();
        CavaLry1.setText(Player.gPlayer[0].getName());
        CavaLry2.setText(Player.gPlayer[1].getName());
        CavaLry3.setText(Player.gPlayer[2].getName());

        eCavaLry1.setText(Player.gEnemy[0].getName());
        eCavaLry2.setText(Player.gEnemy[1].getName());
        eCavaLry3.setText(Player.gEnemy[2].getName());

    }


}
