package com.lgs.droid.model;

import java.util.Date;
import lombok.Data;

@Data
public class Droid {

    private Long id;

    private String manufacturer;

    private String modelId;

    private Date builtAt;

}
