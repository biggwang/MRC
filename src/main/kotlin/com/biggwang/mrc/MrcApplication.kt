package com.biggwang.mrc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MrcApplication

fun main(args: Array<String>) {
	runApplication<MrcApplication>(*args)
}
