package com.example.springbootpostgresql.model.request;

import lombok.Data;

import java.util.List;

@Data
public class BookLendRequest {

    private List<Long> bookIds;
    private Long memberId;
}
