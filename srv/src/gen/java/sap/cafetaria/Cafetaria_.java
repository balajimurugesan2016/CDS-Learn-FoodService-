package sap.cafetaria;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("sap.cafetaria")
public interface Cafetaria_ {
  String CDS_NAME = "sap.cafetaria";

  Class<ServingCounter_> SERVING_COUNTER = ServingCounter_.class;
}
