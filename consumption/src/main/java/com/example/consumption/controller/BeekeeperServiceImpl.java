package com.example.consumption.controller;

import org.apache.servicecomb.provider.pojo.RpcReference;

/**
 * Created by xingmin.zhang on 2019/4/26.
 */
public class BeekeeperServiceImpl{

    @RpcReference(microserviceName = "paas-admin-api-edc-zxm", schemaId = "HostContract")
    private static HostContract hostContract;

//    BeekeeperServiceImpl(HostContract hostContract) {
//        this.hostContract = hostContract;
//    }

    public static void main(String[] args) {
        hostContract.getHostContractById("11");
    }
//    @Override
//    public void run() {
//        hostContract.getHostContractById("11");
//    }
}
