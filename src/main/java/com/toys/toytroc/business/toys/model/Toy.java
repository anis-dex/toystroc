package com.toys.toytroc.business.toys.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Toy {

    private String id ;
    private ToyCategory category ;
    private String name ;
    private List<Photo> photoUrls = new ArrayList<Photo>();
    private List<Tag> tags ;
    private ToyStatus status ;


}
