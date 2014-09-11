package core

import akka.actor.Actor

object ActivityActor {

  case object Act

}

class ActivityActor extends Actor {
  import ActivityActor._

  def receive: Receive = {
    case Act => "Act"
  }
}
