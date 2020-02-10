using sap.cafe as Di from '../db/FoodList';
using sap.cafetaria  as Serving from '../db/ServingCounterList';


service foodService {
  
      @createonly @updateonly  entity dish as projection on Di.Dish;
    entity ServingCounter as projection on Serving.ServingCounter;
}