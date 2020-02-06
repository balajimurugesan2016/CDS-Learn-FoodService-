namespace sap.cafe;

type Preference : String enum { veg;nonveg;}

@cds.autoexpose
define entity Dish {
  key DishID : Integer;
  Dishtitle  : String;
  ServingCounterNumber:Integer;
  DishPref: Preference
}

