package com.nongviet201.cinema.web.sdk.controller.decorator;

import com.nongviet201.cinema.core.entity.bill.Bill;
import com.nongviet201.cinema.core.entity.bill.Translation;
import com.nongviet201.cinema.core.model.enums.bill.BillStatus;
import com.nongviet201.cinema.core.utils.WebFormatter;
import com.nongviet201.cinema.web.sdk.converter.WebBillToResponseConverter;
import com.nongviet201.cinema.web.sdk.response.WebBillResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WebBillDecorator {
    private final WebBillToResponseConverter converter;
    private final WebFormatter dateTimeFormatter;

    public WebBillResponse decorate(
        Translation translation
    ) {
        Bill bill = translation.getBill();
        return converter.convert(
            bill.getId(),
            bill.getTotalPrice(),
            dateTimeFormatter.formatFullDateTime(bill.getCreatedAt()),
            bill.getStatus() == BillStatus.PAID,
            translation.getResponseCodeVNPAY().getMessage()
        );
    }
}
