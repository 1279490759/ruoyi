//package com.ruoyi.web.controller.common;
//
//import org.influxdb.InfluxDB;
//import org.influxdb.dto.Query;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
///**
// * @author :zhangshuangbing
// * @createDate: 2021/4/6
// */
//@Controller
//@RequestMapping("/text")
//public class TextController {
//
//    public static Logger logger = LoggerFactory.getLogger(TextController.class);
//
//    @Qualifier("influxdb")
//    @Autowired
//    private InfluxDB influxDB;
//
//    @ResponseBody
//    @RequestMapping("/influxdb")
//    public Object influxdb() {
//        Query query = new Query("show databases");
//        return influxDB.query(query);
//    }
//}
