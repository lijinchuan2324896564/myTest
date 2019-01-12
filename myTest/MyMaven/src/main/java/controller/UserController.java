package controller;

import entity.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    //依赖服务层，自动注入
    @Autowired
    private UserService userService;

    @RequestMapping("/addUser.do")
    public String addUser(UserDTO dto){
        userService.addUser (dto);
        return "/listUser.do";
    }


    @RequestMapping("/delUser.do")
    public String delUser(int id){
        userService.delUser (id);
        return "/listUser.do";
    }


    @RequestMapping("/updateUser.do")
    public String updateUser(UserDTO dto){
        userService.updateUser (dto);
        return "/listUser.do";
    }

    @RequestMapping("/showUserAll.do")
    public String showUserAll(){
        userService.showUserAll ();
        return "/listUser.do";
    }

    @RequestMapping("/listUser.do")
    public ModelAndView listUser(HttpServletRequest request){
        ModelAndView mv = new ModelAndView ();
        String id = request.getParameter ("id");
        if (!StringUtils.isEmpty(id)){
            UserDTO byId = userService.findById (Integer.parseInt (id));
            mv.addObject ("dot",byId);
        }
        mv.setViewName ("/userlist.jsp");
        return mv;
    }

    @RequestMapping("/listUsername.do")
    public ModelAndView listUsername(HttpServletRequest request){
        ModelAndView mv = new ModelAndView ();
        String name = request.getParameter ("name");
        if (!StringUtils.isEmpty(name)){
            UserDTO byname = userService.findById (Integer.parseInt (name));
            mv.addObject ("dot",byname);
        }
        mv.setViewName ("/userlist.jsp");
        return mv;
    }
}
