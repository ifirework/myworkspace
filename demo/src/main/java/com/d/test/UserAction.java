package com.d.test;

import com.alibaba.fastjson.JSON;
import com.d.pojo.BaseUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/7/4.
 */
@Controller
public class UserAction {
    static String SUCCESS = "success" ;
    static Logger logger = null ;
    static {
        logger =Logger.getLogger(UserAction.class.getName()) ;
    }


    @ResponseBody
    @RequestMapping("/user/getInfo")
    public String getInfo(@RequestParam("name") String name){
        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();
        String t = time.toString();
        System.out.println("welcome!!!"+name+"~~"+t);
        return "index" ;
    }
    @ResponseBody
    @RequestMapping(value="/user/{sex}_{name}.html",produces = "text/html;charset=UTF-8")
    public String toString(@PathVariable(value = "sex")Integer sex, @PathVariable(value = "name") String name) {
        logger.info("进入方法~~~~~~~~~~~"+sex+"&&"+name);
        BaseUser user = new BaseUser(name, 1, "三八路", 1);
        String userstr = JSON.toJSONString(user);

        return  userstr;

    }

    @RequestMapping(value = "/user/index")
    public ModelAndView redirectTest(@RequestParam(value = "name",required = true)String name,HttpServletRequest request){
        ModelAndView model = new ModelAndView();
        model.setViewName("success");
        logger.info("账户:"+name);
        model.addObject("testdata","一直取不到值,为何突然取到值") ;
        // return  "redirect:http://www.baidu.com" ;
      //  request.setAttribute("testdata","取不到值");
      //  Object str = request.getAttribute("testdata");
      //  System.out.println(str.toString());

        return  model ;
    }
    @RequestMapping("/user/getuser")
    public ModelAndView getUserStr(ModelAndView model) {

        BaseUser baseUser = new BaseUser("苟胜", 12, "清风岭", 2);
        model.addObject("user",baseUser) ;
        model.setViewName(SUCCESS);
        return  model;
    }

    @ResponseBody
    @RequestMapping(value = "/user/login",produces = "text/html;charset=UTF-8")
    public String doLogin(BaseUser user, HttpServletRequest request){
        logger.info("登录"+user.getUserName());
        HttpSession session = request.getSession();
        session.setAttribute("user",user);

        return "登录成功!";
    }
    @ResponseBody
    @RequestMapping(value = "/user/getUserDetail",produces = "text/html;charset=UTF-8")
    public String getUserDetail(String name,HttpServletRequest request){
        logger.info("获取信息用户:"+name);
        HttpSession session = request.getSession();
        BaseUser user = (BaseUser) session.getAttribute("user");
        String str = JSON.toJSONString(user);
        return  str ;
    }

    @RequestMapping("/user/getMap")
    public String getMap(HashMap map) {
        map.put("username","gousheng") ;
        map.put("sex","男") ;

        return  SUCCESS ;
    }
    @RequestMapping(value = "/user/getModelAndView", method = RequestMethod.GET)
    public String getModelAndView(ModelAndView model){
        BaseUser baseUser = new BaseUser("GOUSEHNG", 1, "HAHA", 2);
        model.addObject("user",baseUser) ;

        return  SUCCESS ;
    }

    public void toprintln(){
        System.out.println("代理类执行了吗");
    }


    public static void main(String[] args) {
        System.out.println("test");
    }
}
