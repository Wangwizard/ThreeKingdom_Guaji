#pragma once


class General
{
public:
	General();
	~General();
	General(INT32 GID);
	LPCSTR getName();
	INT32 getHP();
	INT32 getStrength();
	INT32 AddExperience(INT32 Exp);
	INT32 ReduceHP(INT32 Num);
	INT32 ReduceMP(INT32 Num);
	INT32 ReplaceGeneral(INT32 inID);

private:
	LPCSTR Name; // Name of the general
	INT32 ID;	// Key value of the general in database
	INT32 Place; // This is to identify where is this general located in the army
	GeneralType Type; // Type, る條,祭條,僮條,覺尪
	INT32 Level; // Level
	INT32 Experience; // Experience
	INT32 Rank; // Stars
	INT32 Rank_Exp; // exp of Stars
	INT32 HealthPoint; // HP
	INT32 MagicPoint; // MP
	INT32 Strength; 
	INT32 Intelligence;
	INT32 Defence;
	INT32 Forces; // armies the general is leading, placeholder
	INT32 BattlePoint; // This is to record the battlepoint of the general.
	INT32 Status; // This is for the Status of the general: Alive, Dead, poisoned etc.
};

