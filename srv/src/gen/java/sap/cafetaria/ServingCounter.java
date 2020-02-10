package sap.cafetaria;

import com.sap.cds.CdsData;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import sap.cafe.Dish;

@CdsName("sap.cafetaria.ServingCounter")
public interface ServingCounter extends CdsData {
  String SERVINGCOUNTER_ID = "servingcounterID";

  String DESCRIPTION = "Description";

  String DISH = "Dish";

  String SERVING_COUNTERVENDORGROUP_ID = "servingCountervendorgroupID";

  Integer getServingcounterID();

  void setServingcounterID(Integer servingcounterID);

  @CdsName(DESCRIPTION)
  String getDescription();

  @CdsName(DESCRIPTION)
  void setDescription(String description);

  @CdsName(DISH)
  Dish getDish();

  @CdsName(DISH)
  void setDish(Map<String, ?> dish);

  String getServingCountervendorgroupID();

  void setServingCountervendorgroupID(String servingCountervendorgroupID);
}
