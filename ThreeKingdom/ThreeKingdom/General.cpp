#include "stdafx.h"
#include "General.h"


GENLIST GeneralList[2] = { "梊堁", 0, る條,200,50, "祭條",1, 祭條,100,5 };
General::General()
{
}


General::~General()
{
}

General::General(INT32 GID)
{
	int i = 0;
	for (i = 0; i < 2; i++)
	{
		if (GID == GeneralList[i].ID)
			break;
	}
	if (i == 2)
		return;
	Name = GeneralList[i].Name;
	ID = GeneralList[i].ID;	
	Place = 0; // To be updated
	Type = GeneralList[i].Type; // Type, る條,祭條,僮條,覺尪
	Level = 0; // Level
	Experience = 0; // Experience
	//INT32 Rank; // Stars
	//INT32 Rank_Exp; // exp of Stars
	HealthPoint = GeneralList[i].Health; // HP
	//INT32 MagicPoint; // MP
	Strength = GeneralList[i].Strength;
	//INT32 Intelligence;
	//INT32 Defence;
	//INT32 Forces; // armies the general is leading, placeholder
	//INT32 BattlePoint; // This is to record the battlepoint of the general.
	Status = 1;
}

LPCSTR General::getName()
{
	return Name;
}

INT32 General::getHP()
{
	return HealthPoint;
}

INT32 General::getStrength()
{
	return Strength;
}

INT32 General::AddExperience(INT32 Exp)
{
	Experience += Exp;
	while(Experience >= Level * 300)
	{
		Level++;
	}
	return INT32();
}

INT32 General::ReduceHP(INT32 Num)
{
	HealthPoint -= Num;
	if (HealthPoint <= 0)
	{
		HealthPoint = 0;
		Status = 0;
	}
	return INT32();
}

INT32 General::ReduceMP(INT32 Num)
{
	MagicPoint -= Num;
	if (MagicPoint <= 0)
	{
		MagicPoint = 0;
		
	}
	return INT32();
}


INT32 General::ReplaceGeneral(INT32 inID)
{
// To Do: replace one general with new one
	return INT32();
}
