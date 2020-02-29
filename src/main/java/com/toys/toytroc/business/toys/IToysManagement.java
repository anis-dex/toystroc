package com.toys.toytroc.business.toys;

import com.toys.toytroc.business.ToyTrocException;
import com.toys.toytroc.business.toys.model.Toy;

import java.util.List;

public interface IToysManagement {


    public List<Toy> getAvailableToys() throws ToyTrocException;


}
