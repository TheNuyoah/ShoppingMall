package com.zhoujianqi.exception;

import com.zhoujianqi.model.vo.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理
 */
@RestControllerAdvice
public class SMExceptionHandler {

    /**
     * 处理Exception异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result error(Exception e){
        e.printStackTrace();
        return Result.build(null , 201,"出现了异常") ;
    }

    /**
     * 处理自定义异常
     * @param exception
     * @return
     */
    @ExceptionHandler(value = SMException.class)
    public Result error(SMException exception) {
        exception.printStackTrace();
        return Result.build(null , exception.getResultCodeEnum()) ;
    }
}