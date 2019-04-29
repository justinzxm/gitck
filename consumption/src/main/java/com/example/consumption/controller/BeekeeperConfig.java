//package com.example.consumption.controller;
//
//import org.apache.servicecomb.provider.pojo.RpcReference;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by xingmin.zhang on 2019/4/26.
// */
//@Configuration
//class BeekeeperConfig {
//
//    @RpcReference(microserviceName = "paas-admin-api-edc-zxm", schemaId = "HostContract")
//    private HostContract hostContract;
//
//    @Bean
//    BeekeeperService beekeeperService() {
//        return new BeekeeperServiceImpl(hostContract);
//    }
//}
