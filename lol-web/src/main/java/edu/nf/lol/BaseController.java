package edu.nf.lol;


import edu.nf.lol.vo.ResponseVO;

/**
 * @author Crazy
 * @date 2019/11/18
 */
public class BaseController<T> {
    protected  <T> ResponseVO<T> success(T data){
        ResponseVO<T> vo=new ResponseVO<T>();
        vo.setCode(200);
        vo.setData(data);
        return  vo;
    }
    protected  ResponseVO fail(Integer code, String message){
        ResponseVO<T> vo=new ResponseVO<T>();
        vo.setCode(code);
        vo.setMessage(message);
        return  vo;
    }
}