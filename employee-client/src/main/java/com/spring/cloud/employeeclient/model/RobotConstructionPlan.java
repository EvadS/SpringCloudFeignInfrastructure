package com.spring.cloud.employeeclient.model;

import javassist.bytecode.ByteArray;
import lombok.Data;

@Data
public class RobotConstructionPlan {
    String name;
    String contentType;
    ByteArray plan;
    String description;
}
