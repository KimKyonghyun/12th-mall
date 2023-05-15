package th.mall.domain;

import java.util.*;
import lombok.Data;
import th.mall.infra.AbstractEvent;

@Data
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String userId;
    private Long orderId;
    private String productName;
    private Long productId;
    private Integer qty;
    private String status;
    private String courier;
}
