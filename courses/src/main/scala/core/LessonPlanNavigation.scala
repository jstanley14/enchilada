package core

import akka.actor.Actor

object LessonPlanNavigationActor {

  case object LP

}

class LessonPlanNavigationActor extends Actor {
  import LessonPlanNavigationActor._

  def receive: Receive = {
    case LP => "LP"
  }
}
