package com.worldline.fpl.recruitment.json;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * Abstract transaction json representation
 * 
 * @author A525125
 *
 */
@Data
public abstract class AbstractTransaction implements Serializable {

	private static final long serialVersionUID = 7866293071140304316L;

	@NotNull
	@ApiModelProperty(value = "Number", required = true)
	private String number;

	@NotNull
	@ApiModelProperty(value = "Balance", required = true)
	private BigDecimal balance;

}
