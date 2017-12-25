package com.game.wizard.threekingdom;

/**
 * Created by Wizard on 2017/12/25.
 */


public class General {
    enum GeneralType
    {
        骑兵, 步兵, 弓兵, 谋士
    };
    private int ID;
    private String Name;
    private int Type;
    private int Strength;
    private int Defence;
    private int Health;
    private int Level;
    private int Exp;
    public General()
    {
        ID = 0;
        Name = "无名氏";
        Type = 0;
        Strength = 100;
        Defence = 100;
        Health = 100;
    }
    public void copyGeneral(General sourG)
    {
        this.ID = sourG.ID;
        this.Name = sourG.Name;
        this.Type = sourG.Type;
        this.Strength = sourG.Strength;
        this.Defence = sourG.Defence;
        this.Health = sourG.Health;
    }
    public String getName()
    {
        return Name;
    };
    public void setName(String Name)
    {
        this.Name = Name;
    };
    public int getID()
    {
        return ID;
    };
    public void setID(int ID)
    {
        this.ID = ID;
    }
    public int getType()
    {
        return Type;
    };
    public void setType(int Type)
    {
        this.Type = Type;
    }
    public int getStrength()
    {
        return Strength;
    };
    public void setStrength(int Strength)
    {
        this.Strength = Strength;
    }
    public int getDefence()
    {
        return Defence;
    };
    public void setDefence(int Defence)
    {
        this.Defence = Defence;
    }
    public int getHealth()
    {
        return Health;
    };
    public void setHealth(int Health)
    {
        this.Health = Health;
    }
}
