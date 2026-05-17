package com.ms.intro.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * ResponseDTO.
 *
 * @author Viktor_Shevliagin
 */

@Data
@Accessors(chain = true)
public class VersionDto {
  private Integer version;
}
