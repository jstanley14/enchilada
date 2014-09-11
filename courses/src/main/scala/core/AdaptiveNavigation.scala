package core

import akka.actor.Actor

object AdaptiveNavigationActor {

  case object Ad

}

class AdaptiveNavigationActor extends Actor {
  import AdaptiveNavigationActor._

  def receive: Receive = {
    case Ad => "Ad"
  }
}
