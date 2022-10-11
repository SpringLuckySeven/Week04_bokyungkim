package com.sparta.springcore.dto;

import lombok.Getter;

@Getter
public class ProductRequestDto {
    // 관심상품명
    private String title;
    // 관심상품 썸네일 image URL
    private String image;
    // 관심상품 구매링크 URL
    private String link;
    // 관심상품의 최저가
    private int lprice;

    public ProductRequestDto(String title, String image, String link, int lprice) {
        this.title = title;
        this.image = image;
        this.link = link;
        this.lprice = lprice;
    }
}
