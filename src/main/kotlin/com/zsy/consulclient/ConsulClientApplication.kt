package com.zsy.consulclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConsulClientApplication

fun main(args: Array<String>) {
    runApplication<ConsulClientApplication>(*args)
}
