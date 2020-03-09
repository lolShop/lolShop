package edu.nf.lol.advice;


import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import edu.nf.lol.exception.LolException;
import edu.nf.lol.vo.ResponseVO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.Map;

;

/**
 * @author Crazy
 * @date 2019/11/14
 */
@ControllerAdvice("edu.nf..controller")
public class ControllerAspect {
    @ExceptionHandler(LolException.class)
    @ResponseBody
    public ResponseVO handleDataAccessException(LolException e){
        ResponseVO vo= new ResponseVO();
        vo.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        vo.setMessage(e.getMessage());
        return vo;
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public ResponseVO validException(BindException e){
        ResponseVO vo = new ResponseVO();
        Map<String,String> message = new HashMap<>();
        for (FieldError error : e.getFieldErrors()) {
            message.put(error.getField(), error.getDefaultMessage());
        }
        vo.setCode(1000);
        vo.setMessage(message);
        return vo;
    }
}