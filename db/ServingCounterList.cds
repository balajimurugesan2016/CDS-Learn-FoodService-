namespace sap.cafetaria;
using sap.cafe.Dish from './FoodList';

@cds.autoexpose
define entity ServingCounter
{
key servingcounterID:Integer;
Description:String(200);
servingCountervendorgroupID: LargeString;
Dish:Association to Dish on Dish.ServingCounterNumber = servingcounterID;
}



