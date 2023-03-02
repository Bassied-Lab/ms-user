package az.bassied.ms.user.model.consts;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Messages {
    public static final String USER_EXIST = "user.already.exist";
    public static final String USER_EXIST_MSG = "User with this data already exist";
    public static final String USER_NOT_FOUND = "user.not.found";
    public static final String USER_NOT_FOUND_MSG = "Provided user not found";
}
