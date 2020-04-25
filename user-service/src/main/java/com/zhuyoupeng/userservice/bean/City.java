package com.zhuyoupeng.userservice.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 12288 kB
 * </p>
 *
 * @author carr
 * @since 2020-04-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class City implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String name;

    private Integer parent_id;


}
