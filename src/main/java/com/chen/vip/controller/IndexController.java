package com.chen.vip.controller;

import com.sun.javaws.progress.Progress;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;

/**
 * User: harry.chen
 * Date: 14-1-22
 * Time: 上午10:09
 */
@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    private @ResponseBody String index(@RequestParam String param){
        System.out.println(param);
        return param;
    }

    @RequestMapping(value = "submit",method = RequestMethod.GET)
    private String submit(){
        return "imagesubmit";
    }

    @RequestMapping(value = "submit",method = RequestMethod.POST)
    private @ResponseBody String submit(MultipartHttpServletRequest multipartRequest){
        //  MultipartHttpServletRequest multipartRequest  =  (MultipartHttpServletRequest) request;
        //  获得第1张图片（根据前台的name名称得到上传的文件）
        MultipartFile imgFile1  =  multipartRequest.getFile("imgFile");
        MultipartFile imgFile2  =  multipartRequest.getFile("imgFile2");

        return String.valueOf(imgFile1.getSize());
    }

    @RequestMapping(value = "progress", method = RequestMethod.POST )
    @ResponseBody
    public String initCreateInfo(HttpServletRequest request) {
        ProgressEntity status = (ProgressEntity) request.getSession().getAttribute("upload_ps");
        if(status==null){
            return "{}";
        }
        return status.toString();
    }
}
