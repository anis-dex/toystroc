package com.toys.toytroc.infrastructure;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ToyCategoryEntity {

    @Id
    @Generated("uuid")
    private String id = null;

    private String name = null;


}
