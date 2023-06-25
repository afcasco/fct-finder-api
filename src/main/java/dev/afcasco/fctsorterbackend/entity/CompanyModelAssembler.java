package dev.afcasco.fctsorterbackend.entity;

import dev.afcasco.fctsorterbackend.CompanyController;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class CompanyModelAssembler implements RepresentationModelAssembler<Company, EntityModel<Company>> {
    @Override
    public EntityModel<Company> toModel(Company entity) {
        return EntityModel.of(entity,
                linkTo(methodOn(CompanyController.class).findById(entity.getId())).withSelfRel(),
                linkTo(methodOn(CompanyController.class).findAll()).withRel("companies"));
    }
}