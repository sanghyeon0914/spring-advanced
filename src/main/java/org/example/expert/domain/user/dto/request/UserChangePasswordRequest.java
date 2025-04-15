package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.expert.domain.common.exception.InvalidRequestException;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    /*if (userChangePasswordRequest.getNewPassword().length() < 8 ||
                    !userChangePasswordRequest.getNewPassword().matches(".*\\d.*") ||
                    !userChangePasswordRequest.getNewPassword().matches(".*[A-Z].*")) {
                throw new InvalidRequestException("새 비밀번호는 8자 이상이어야 하고, 숫자와 대문자를 포함해야 합니다.");
            } 위 조건을 dto에 설정
            */

    @NotBlank
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d).{8,}$",
                message = "새 비밀번호는 8자 이상이어야 하고, 숫자와 대문자를 포함해야 합니다.")
    private String oldPassword;

    @NotBlank
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d).{8,}$",
            message = "새 비밀번호는 8자 이상이어야 하고, 숫자와 대문자를 포함해야 합니다.")
    private String newPassword;
}
