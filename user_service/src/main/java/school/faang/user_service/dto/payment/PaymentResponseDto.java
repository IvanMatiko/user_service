package school.faang.user_service.dto.payment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import school.faang.user_service.entity.payment.Currency;
import school.faang.user_service.entity.payment.PaymentStatus;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponseDto {
    private PaymentStatus status;
    private int verificationCode;
    private long paymentNumber;
    private BigDecimal amount;
    private Currency currency;
    private String message;
}
