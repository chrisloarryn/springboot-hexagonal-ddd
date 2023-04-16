package com.hirannor.hexagonal.adapter.persistence.jpa.customer.mapping;

import com.hirannor.hexagonal.adapter.persistence.jpa.customer.model.GenderModel;
import com.hirannor.hexagonal.domain.customer.Gender;

import java.util.function.Function;

class GenderModelToDomainMapper implements Function<GenderModel, Gender> {

    GenderModelToDomainMapper() {
    }

    @Override
    public Gender apply(final GenderModel model) {
        if (model == null) return null;

        return switch (model) {
            case MALE -> Gender.MALE;
            case FEMALE -> Gender.FEMALE;
        };
    }

}
