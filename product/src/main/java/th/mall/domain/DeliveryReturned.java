package th.mall.domain;

import java.util.*;
import lombok.*;
import th.mall.domain.*;
import th.mall.infra.AbstractEvent;

@Data
@ToString
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
