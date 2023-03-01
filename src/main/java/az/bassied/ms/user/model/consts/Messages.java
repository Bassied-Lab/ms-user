package az.bassied.ms.user.model.consts;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Messages {
    public static final String USER_EXIST_ERR_CODE = "user.already.exist";
    public static final String USER_EXIST_ERR_MSG = "User with this data already exist";

}
