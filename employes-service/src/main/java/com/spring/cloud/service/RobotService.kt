package com.spring.cloud.service



import com.spring.cloud.model.Robot
import com.spring.cloud.model.RobotConstructionPlan
import org.springframework.stereotype.Service

@Service
class RobotService {
    private val robots: MutableMap<String, Robot> = mutableMapOf()
    private val robotConstructionPlans: MutableMap<String, RobotConstructionPlan> = mutableMapOf()

    fun addRobot(robot: Robot) {
        if (!robots.containsKey(robot.name)) {
            robots[robot.name] = robot
        } else {
            throw IllegalStateException("Robot name already exists")
        }
    }

    fun getRobot(name: String) : Robot? = robots[name]

    fun getRobots() : Collection<Robot> = robots.values

    fun addConstructionPlan(robotName: String, constructionPlan: RobotConstructionPlan) {
        robotConstructionPlans[robotName] = constructionPlan
    }

    fun getConstructionPlan(robotName: String) = robotConstructionPlans[robotName]
}
