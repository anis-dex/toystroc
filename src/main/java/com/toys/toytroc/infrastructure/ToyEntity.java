package com.toys.toytroc.infrastructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="TOYS")
public class ToyEntity {

    @Id
    @Generated("uuid")
    private String id ;

    @ManyToOne(fetch = FetchType.LAZY)
    private ToyCategoryEntity category ;

    private String name ;

    @OneToMany(fetch = FetchType.LAZY)
    private List<PhotoEntity> photoUrls = new ArrayList<PhotoEntity>();

    @OneToMany(fetch = FetchType.LAZY)
    private List<TagEntity> tags ;

    @Enumerated(EnumType.STRING)
    private ToyStatusEnum status ;

}
