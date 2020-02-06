package sap.cafe;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;

@CdsName("sap.cafe.Dish")
public interface Dish_ extends StructuredType<Dish_> {
  String CDS_NAME = "sap.cafe.Dish";

  ElementRef<Integer> DishID();

  ElementRef<String> DishPref();

  ElementRef<Integer> ServingCounterNumber();

  ElementRef<String> Dishtitle();
}
