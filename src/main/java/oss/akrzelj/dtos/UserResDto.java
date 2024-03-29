package oss.akrzelj.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResDto {

    private String id;

    private String username;

    private String email;

    private String firstName;

    private String lastName;

    private Date dateOfBirth;

    private String bio;

    private boolean superuser;

    private Date createdAt;

    private Date lastLogin;
}
