package com.client.remoteinterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-client-provider")
public interface RemoteInterface {
    /**
     * 获取公司信息
     *
     * @param companyName
     * @return
     */
    @RequestMapping(value = "/getCompanyInfoByProvider", method = RequestMethod.GET)
    String getCompanyInfoByProvider(@RequestParam("companyName") String companyName);
}