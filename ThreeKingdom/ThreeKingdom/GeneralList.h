#pragma once
#include "stdafx.h"
enum GeneralType
{
	���, ����, ����, ıʿ
};
typedef struct{
	LPCSTR Name;
	INT32 ID;
	GeneralType Type;
	INT32 Health;
	INT32 Strength;

}GENLIST;

