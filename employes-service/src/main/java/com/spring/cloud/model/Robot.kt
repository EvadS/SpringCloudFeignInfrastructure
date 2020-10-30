package com.spring.cloud.model

data class Robot(
        val name: String,
        val type: RobotType
)

enum class RobotType {
    HOVER,
    MOWER
}