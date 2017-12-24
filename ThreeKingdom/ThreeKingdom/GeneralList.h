#pragma once
#include "stdafx.h"
enum GeneralType
{
	る條, 祭條, 僮條, 覺尪
};
typedef struct{
	LPCSTR Name;
	INT32 ID;
	GeneralType Type;
	INT32 Health;
	INT32 Strength;

}GENLIST;

