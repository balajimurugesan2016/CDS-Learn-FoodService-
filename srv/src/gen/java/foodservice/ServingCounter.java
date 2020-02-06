package foodservice;

import com.sap.cds.CdsData;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;

@CdsName("foodService.ServingCounter")
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

  Integer getServingCountervendorgroupID();

  void setServingCountervendorgroupID(Integer servingCountervendorgroupID);
}
