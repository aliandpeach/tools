package com.tool.doge.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/02 11:15:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Host implements Serializable
{
    private int id;

    @NotNull(message = "不能为空")
    private String name;
}
