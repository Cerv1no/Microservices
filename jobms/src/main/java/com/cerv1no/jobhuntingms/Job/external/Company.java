package com.cerv1no.jobhuntingms.Job.external;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Company {

    private Long id;
    private String name;
    private String description;

}