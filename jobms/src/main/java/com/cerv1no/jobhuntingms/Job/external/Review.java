package com.cerv1no.jobhuntingms.Job.external;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Review {

    private Long id;
    private String title;
    private String description;
    private double rating;
}
