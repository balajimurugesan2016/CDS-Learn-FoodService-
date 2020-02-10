package sap.cafetaria;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.Predicate;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;
import sap.cafe.Dish_;

@CdsName("sap.cafetaria.ServingCounter")
public interface ServingCounter_ extends StructuredType<ServingCounter_> {
  String CDS_NAME = "sap.cafetaria.ServingCounter";

  ElementRef<Integer> servingcounterID();

  ElementRef<String> Description();

  Dish_ Dish();

  Dish_ Dish(Function<Dish_, Predicate> filter);

  ElementRef<String> servingCountervendorgroupID();
}
