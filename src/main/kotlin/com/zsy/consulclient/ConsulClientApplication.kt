package com.zsy.consulclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient



@SpringBootApplication
@EnableDiscoveryClient
class ConsulClientApplication

fun main(args: Array<String>) {
    runApplication<ConsulClientApplication>(*args)
}
