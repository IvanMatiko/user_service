package school.faang.user_service.entity.promotion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import school.faang.user_service.entity.event.Event;
import school.faang.user_service.entity.payment.Currency;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "event_promotion")
public class EventPromotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "promotion_tariff")
    @Enumerated(EnumType.STRING)
    private PromotionTariff promotionTariff;

    @Column(name = "cost")
    private double cost;

    @Column(name = "currency")
    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Column(name = "coefficient")
    private double coefficient;

    @OneToOne
    @JoinColumn(name = "event_id", nullable = false)
    @EqualsAndHashCode.Exclude
    private Event event;

    @Column(name = "number_of_views")
    private int numberOfViews;

    @Column(name = "audience_reach")
    private int audienceReach;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;
}
