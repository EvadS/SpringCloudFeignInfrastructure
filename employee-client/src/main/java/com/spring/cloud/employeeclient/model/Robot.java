package com.spring.cloud.employeeclient.model;

import lombok.Data;

@Data
public class Robot {
    String name;
    RobotType type;
}


enum  RobotType {
    HOVER,
    MOWER
}