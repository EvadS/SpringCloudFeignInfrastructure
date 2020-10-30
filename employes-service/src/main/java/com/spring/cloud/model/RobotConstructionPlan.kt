package com.spring.cloud.model


data class RobotConstructionPlan(
        val name: String,
        val contentType: String?,
        val plan: ByteArray,
        val description: String?
)