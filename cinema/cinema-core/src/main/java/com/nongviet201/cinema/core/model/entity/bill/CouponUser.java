package com.nongviet201.cinema.core.model.entity.bill;

import com.nongviet201.cinema.core.model.entity.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "coupon_user")
public class CouponUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime usedAt;

    @OneToOne
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
