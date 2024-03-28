package com.example.demo.book.db.entity;

import com.example.demo.entity.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookEntity extends Entity {

    private String name;
    private String category;
    private String amount;
}
