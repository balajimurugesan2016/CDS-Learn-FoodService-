import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.ServiceName;

import org.springframework.stereotype.Component;

@Component
@ServiceName(value = "foodService")
public class FoodService implements EventHandler {
    /*private Map<Object, Map<String, Object>> products = new HashMap<>();

    @On(event = CdsService.EVENT_CREATE, entity = "AdminService.Products")
    public void onCreate(CdsCreateEventContext context) {
        context.getCqn().entries().forEach(e -> products.put(e.get("ID"), e));
        context.setResult(context.getCqn().entries());
    }

    @On(event = CdsService.EVENT_READ, entity = "AdminService.Products")
    public void onRead(CdsReadEventContext context) {
        context.setResult(products.values());
    }*/

    
}