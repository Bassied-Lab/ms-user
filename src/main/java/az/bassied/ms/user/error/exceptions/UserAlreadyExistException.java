package az.bassied.ms.user.error.exceptions;

import az.bassied.ms.user.model.consts.Messages;

public class UserAlreadyExistException extends GeneralException {
    public UserAlreadyExistException() {
        super(Messages.USER_EXIST_ERR_CODE, Messages.USER_EXIST_ERR_MSG);
    }
}
