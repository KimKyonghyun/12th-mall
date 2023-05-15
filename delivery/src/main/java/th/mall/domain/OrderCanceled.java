package th.mall.domain;

import java.util.*;
import lombok.*;
import th.mall.domain.*;
import th.mall.infra.AbstractEvent;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String userId;
    private Long productId;
    private String productName;
    private Integer qty;
}
