
CREATE TABLE sap_cafe_Dish (
  DishID INTEGER NOT NULL,
  Dishtitle NVARCHAR(5000),
  ServingCounterNumber INTEGER,
  DishPref NVARCHAR(5000),
  PRIMARY KEY(DishID)
);

CREATE TABLE sap_cafetaria_ServingCounter (
  servingcounterID INTEGER NOT NULL,
  Description NVARCHAR(200),
  servingCountervendorgroupID INTEGER,
  PRIMARY KEY(servingcounterID)
);

CREATE VIEW foodService_ServingCounter AS SELECT
  ServingCounter_0.servingcounterID,
  ServingCounter_0.Description,
  ServingCounter_0.servingCountervendorgroupID
FROM sap_cafetaria_ServingCounter AS ServingCounter_0;

CREATE VIEW foodService_dish AS SELECT
  Dish_0.DishID,
  Dish_0.Dishtitle,
  Dish_0.ServingCounterNumber,
  Dish_0.DishPref
FROM sap_cafe_Dish AS Dish_0;

