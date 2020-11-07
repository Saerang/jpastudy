package com.saerang.jpastudy.repository;

import com.saerang.jpastudy.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderSearch {

    private String memberName; //호원 이름
    private OrderStatus orderStatus; //주문 상태[ORDER, CANCEL]

}
