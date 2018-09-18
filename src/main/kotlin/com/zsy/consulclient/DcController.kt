package com.zsy.consulclient

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.beans.factory.annotation.Autowired



/**
 ** @author Jayloong
 ** @date 2018/9/18
 ** 功能说明：
 */
@RestController
class DcController {
    @Autowired
    var discoveryClient: DiscoveryClient? = null

    @GetMapping("/dc")
    fun dc(): String {
        val services = "Services: " + discoveryClient!!.services
        println(services)
        return services
    }
}