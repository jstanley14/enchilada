package core

import akka.actor.Actor

object PlaylistNavigationActor {
  case object Ugh
}

class PlaylistNavigationActor extends Actor {
  import PlaylistNavigationActor._

  def receive: Receive = {
    case Ugh => "Ugh"
  }

}
