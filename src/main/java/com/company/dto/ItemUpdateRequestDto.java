package com.company.dto;

import com.company.validation.RangeValidation;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by richersoon on 7/12/16.
 */
public class ItemUpdateRequestDto {

    private String id;

    @NotEmpty
    private String name;

    @RangeValidation(isOptional = true, minInclusive = 1,
            maxInclusive = Integer.MAX_VALUE, message = "Priority must be positive")
    private Integer priority;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

}
