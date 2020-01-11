package com.imagine.dragons.Exception;

import com.imagine.dragons.util.APIResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

/**
 * @description: 统一异常类
 * @Param:
 * @return:
 * @author: dkb
 * @time: 2020/1/9 9:53
 */
public class BusinessException extends  RuntimeException {
    //获取日志信息
    private Logger logger= LoggerFactory.getLogger(BusinessException.class);
    protected String errorCode;
    protected String [] errorMessageArguments;
    protected APIResponse apiResponse;
    protected BusinessException() {
        this("");
    }
    public BusinessException(String message) {
        super(message);
        this.errorCode = "fail";
        this.errorMessageArguments = new String[0];
    }
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = "fail";
        this.errorMessageArguments = new String[0];
    }
    public static BusinessException withErrorCode(String errorCode) {
        BusinessException businessException = new BusinessException();
        businessException.errorCode = errorCode;
        return businessException;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public String[] getErrorMessageArguments() {
        return this.errorMessageArguments = errorMessageArguments;
    }

    public BusinessException withErrorMessageArguments(String... errorMessageArguments) {
        if(errorMessageArguments != null) {
            this.errorMessageArguments = errorMessageArguments;
        }

        return this;
    }

    public APIResponse response() {
        if (this.apiResponse != null) {
            return this.apiResponse;
        } else {
            this.apiResponse = APIResponse.widthCode(this.getErrorCode());
            if (this.getErrorMessageArguments() != null && this.getErrorMessageArguments().length > 0) {
                try {
                    this.apiResponse.setMsg(MessageFormat.format(this.apiResponse.getMsg(),this.getErrorMessageArguments()));
                } catch (Exception var2) {
                    logger.error(var2.getMessage());
                }
            }
            return this.apiResponse;
        }
    }
}
