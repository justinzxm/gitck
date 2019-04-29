package com.example.consumption.controller;

import java.util.List;

/**
 * Created by xingmin.zhang on 2019/4/26.
 */
public interface HostContract {

    List<HostContractDto> getHostContractById(String id);
}
