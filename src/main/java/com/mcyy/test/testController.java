package com.mcyy.test;

import com.mcyy.entity.Salesmessage;
import com.mcyy.entity.User;
import com.mcyy.service.impl.TestSelectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author XiaoMing
 * @create 2020/2/12 12:51
 * 测试用控制器
 */
@Controller
public class testController {

    @Autowired
    TestSelectServiceImpl tssi;

    /**
     * 柱状图页面数据接口
     *
     * @return
     */
    @RequestMapping(value = "/testchart", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public List<Salesmessage> TestChart() {

        System.out.println("===============================柱状图TestBar页===============================");

        List<Salesmessage> salesmessages1 = tssi.SumByDay();

        System.out.println(salesmessages1);

//        System.out.println("********************************环状图*****************************");
//
//        List<Salesmessage> salesmessages = tssi.SelectSalTest();
//
//
//        List<ChartStyle> objects = new ArrayList<>();
//        for (Salesmessage s : salesmessages) {
//            Integer smInventory = s.getSmInventory();
//            Date smData = s.getSmData();
//            System.out.println("haha"+smData);
//            ChartStyle chartStyle = new ChartStyle();
//            chartStyle.setName(smData);
//            chartStyle.setValue(smInventory);
//
//            objects.add(chartStyle);
//        }

        return salesmessages1;
    }

    @RequestMapping(value = "/testchartday", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public List<HashMap<Object, Object>> TestChartDay(HttpServletResponse response, String changetime) {

        System.out.println("*/*/*/*/*/*" + changetime);

        if (changetime.equals("changetime") || changetime == "") {
            changetime = "2019-09-01";
        }

        String today = changetime;
        HashMap<Object, Object> mapmor = new HashMap<>();
        HashMap<Object, Object> mapnoon = new HashMap<>();
        HashMap<Object, Object> mapafter = new HashMap<>();
        List<HashMap<Object, Object>> list = new ArrayList<>();

        Integer salesmessagesMor = tssi.MorningSell(today);
        mapmor.put("name", "上午");
        mapmor.put("value", salesmessagesMor);
        list.add(mapmor);

        Integer salesmessagesNoon = tssi.NoonSell(today);
        mapnoon.put("name", "中午");
        mapnoon.put("value", salesmessagesNoon);
        list.add(mapnoon);

        Integer salesmessagesAfter = tssi.AfternoonSell(today);
        mapafter.put("name", "下午");
        mapafter.put("value", salesmessagesAfter);
        list.add(mapafter);

        System.out.println(list);

        return list;
    }

    /**
     * 测试跳转柱状图页面
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/testcontroller", method = {RequestMethod.POST, RequestMethod.GET})
    public String testcontroller(HttpServletRequest request, HttpServletResponse response) {

        HttpSession session = request.getSession();
        List<User> users = tssi.TestSelectSer();
        session.setAttribute("users", users);

        List<Salesmessage> salesmessages = tssi.SelectSalTest();
        session.setAttribute("salesmessages", salesmessages);

        return "TestPageBar";
    }

    @RequestMapping(value = "/testcontroller2", method = {RequestMethod.POST, RequestMethod.GET})
    public String testcontroller2(HttpServletRequest request, HttpServletResponse response) {

        HttpSession session = request.getSession();
        List<String> time = tssi.SelectSaleTime();
//        Salesmessage data = time.get(3);
        session.setAttribute("seltime", time);

        return "TestPageRose";
    }


    /**
    * 跳转文件上传下载页面
    */
    //获取当此上传文件名
    String fileName = null;
    //存储每一次上传的文件名
    List<Object> allfilename = new ArrayList<>();

    @RequestMapping("/file/FilePage")
    public String FilePage(HttpServletRequest request){

        HttpSession session = request.getSession();
        session.setAttribute("file",allfilename);
        return "FilePage";
    }

    /**
     * 文件上传功能
     * @param file
     * @return
     * @throws IOException
     */
    @RequestMapping(value="/file/upload",method=RequestMethod.POST)
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
        //得到上传文件名
        fileName = file.getOriginalFilename();
        //存储每一次上传的文件名
        allfilename.add(fileName);
        //文件上传地址
        String path = "F:\\file";
        //创建文件流
        File dir = new File(path,fileName);
        //如果父目录不存在，连同父目录一起创建。
        if(!dir.exists()){
            dir.mkdirs();
        }
        //MultipartFile自带的解析方法
        file.transferTo(dir);
        return "ok!";
    }

    /**
     * 文件下载功能
     * @param response
     * @throws IOException
     */
    @RequestMapping(method =RequestMethod.GET ,value = "/file/down")
    public void down(HttpServletResponse response,String downname) throws IOException {
        //文件路径
        String path = "F:\\file\\"+downname;
        //获取输入流
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(path)));
        //转码，免得文件名中文乱码
        path = URLEncoder.encode(path,"UTF-8");
        //设置文件下载头
        response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(downname,"UTF-8"));
        //设置文件ContentType类型，这样设置，会自动判断下载文件类型
        response.setContentType("multipart/form-data");
        // 创建输出流
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
        int len = 0;
        //循环将输入流中的内容读取到缓冲区当中
        while((len = bis.read()) != -1){
            out.write(len);
            out.flush();
        }
        // 关闭输出流
        out.close();
    }

}

