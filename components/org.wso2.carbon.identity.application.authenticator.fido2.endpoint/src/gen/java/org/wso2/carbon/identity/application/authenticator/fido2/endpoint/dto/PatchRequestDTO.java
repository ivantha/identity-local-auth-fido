package org.wso2.carbon.identity.application.authenticator.fido2.endpoint.dto;

import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.application.authenticator.fido2.endpoint.dto.PatchDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class PatchRequestDTO extends ArrayList<PatchDTO> {
  

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchRequestDTO {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
