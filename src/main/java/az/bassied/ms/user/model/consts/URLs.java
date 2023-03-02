package az.bassied.ms.user.model.consts;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class URLs {

    public static final String ROOT = "/v1/ms-user";
    public static final String ROOT_INTERNAL = "/v1/internal/ms-user";

    //User Controller
    public static final String ACTIVATE_USER = ROOT + "/activate";

}
