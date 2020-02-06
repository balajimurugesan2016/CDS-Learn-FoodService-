package foodservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("foodService")
public interface FoodService_ {
  String CDS_NAME = "foodService";

  Class<Dish_> DISH = Dish_.class;

  Class<ServingCounter_> SERVING_COUNTER = ServingCounter_.class;
}
