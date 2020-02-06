package sap.cafe;

import com.sap.cds.CdsData;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;

@CdsName("sap.cafe.Dish")
public interface Dish extends CdsData {
  String DISH_ID = "DishID";

  String DISH_PREF = "DishPref";

  String SERVING_COUNTER_NUMBER = "ServingCounterNumber";

  String DISHTITLE = "Dishtitle";

  @CdsName(DISH_ID)
  Integer getDishID();

  @CdsName(DISH_ID)
  void setDishID(Integer dishID);

  @CdsName(DISH_PREF)
  String getDishPref();

  @CdsName(DISH_PREF)
  void setDishPref(String dishPref);

  @CdsName(SERVING_COUNTER_NUMBER)
  Integer getServingCounterNumber();

  @CdsName(SERVING_COUNTER_NUMBER)
  void setServingCounterNumber(Integer servingCounterNumber);

  @CdsName(DISHTITLE)
  String getDishtitle();

  @CdsName(DISHTITLE)
  void setDishtitle(String dishtitle);
}
