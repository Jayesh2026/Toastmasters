package com.app.toastmasters.dto.responseDTO;

import com.app.toastmasters.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GemOfMonthDTO {

    private int gemId;
    private LocalDate month;
    private int userId;
    private String userName;
    private int dayCount;
}
