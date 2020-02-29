package com.toys.toytroc.infrastructure;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TagEntity {

    @Id
    private Long id = null;

    private String name = null;

}
