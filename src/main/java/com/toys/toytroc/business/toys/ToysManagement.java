package com.toys.toytroc.business.toys;

import com.toys.toytroc.business.ToyTrocException;
import com.toys.toytroc.business.toys.model.Photo;
import com.toys.toytroc.business.toys.model.Toy;
import com.toys.toytroc.business.toys.model.ToyCategory;
import com.toys.toytroc.business.toys.model.ToyStatus;
import com.toys.toytroc.infrastructure.ToyEntity;
import com.toys.toytroc.infrastructure.ToyStatusEnum;
import com.toys.toytroc.infrastructure.IToysRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Transactional
public class ToysManagement implements IToysManagement {

    @Autowired
    private IToysRepository toysRepository;

    @Override
    public List<Toy> getAvailableToys() throws ToyTrocException {
        List<ToyEntity> availabeToys = toysRepository.findByStatus(ToyStatusEnum.AVAILABLE);
        List<Toy> toys = null;
        if(!CollectionUtils.isEmpty(availabeToys)) {
            toys = availabeToys.stream().map(toyEntity -> {
                Toy toy = new Toy();
                BeanUtils.copyProperties(toyEntity, toy);
                if(toyEntity.getStatus() != null) {
                    toy.setStatus(ToyStatus.valueOf(toyEntity.getStatus().name()));
                }
                ToyCategory toyCategory = new ToyCategory();
                BeanUtils.copyProperties(toyEntity.getCategory(), toyCategory);
                toy.setCategory(toyCategory);
                if (!CollectionUtils.isEmpty(toyEntity.getPhotoUrls())) {
                    toy.setPhotoUrls(toyEntity.getPhotoUrls().stream().map(photoEntity -> {
                        Photo photo = new Photo();
                        BeanUtils.copyProperties(photoEntity, photo);
                        return photo;
                    }).collect(Collectors.toList()));
                }
                //TODO do the same for tags

                return toy;
            }).collect(Collectors.toList());
        }
        return toys;
    }
}
