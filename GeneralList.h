#pragma once
#include "stdafx.h"
enum GeneralType
{
	���, ����, ����, ıʿ
};
typedef struct{
	INT32 ID;
	WCHAR Name[4] = L"";
	GeneralType Type;
	INT32 Strength;
	INT32 Defence;
	INT32 Health;
	INT32 Level;
	INT32 Exp;

}GENLIST;

