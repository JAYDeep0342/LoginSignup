package ips.loginsignup.dto;

import ips.loginsignup.entity.type.RoleType;
import lombok.*;

import java.util.Set;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDto {
  private  String Jwt ;
    private Long userid ;
    private Set<RoleType> roles;}
