package edu.nf.lol.user.entity;

import lombok.Data;

/**
 * @author zhangch
 * @date 2020/3/8
 */
@Data
public class City {

    private String cityCode;
    private String cityParentCode;
    private String cityName;
    private Integer type;
}
