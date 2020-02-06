package sap.cafe;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("sap.cafe")
public interface Cafe_ {
  String CDS_NAME = "sap.cafe";

  Class<Dish_> DISH = Dish_.class;
}
