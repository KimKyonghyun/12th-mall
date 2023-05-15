package th.mall.domain;

import java.util.*;
import lombok.Data;
import th.mall.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private Long productId;
    private String productName;
    private Integer qty;
}
