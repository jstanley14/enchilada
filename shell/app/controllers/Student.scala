package controllers

import play.api.libs.ws
import play.api.libs.ws.WS
import play.api.mvc._
import scala.concurrent.Future
import play.api.Play.current

object Student extends Controller {

  def home(userName: String) = Action {
    Ok(views.html.student(userName))
  }

  def gradebook(userName: String) = Action {
    // Need to ask StudentService for grades for this user.
    val grades: Future[ws.WSResponse] = WS.url("path/to/grades/webservice").get()
    // Once that works, pass to rendering gradebook page.
    Ok(views.html.student_gradebook(userName))

//    Something like this:
//    Async {
//      WS.url("path/to/grades/webservice").get().map { grades =>
//        OK(views.html.student_gradebook(userName, grades))
//      }
//    }
    // And adjust route to accept 2nd param, and page to display
  }

  def courses(userName: String) = Action {
    // Need to ask StudentServices for courses for this user.
    val courses: Future[ws.WSResponse] = WS.url("path/to/courses/webservice").get()
    // Once that works, pass to rendering courses page.
    Ok(views.html.student_courses(userName))

//    Async {
//      WS.url("path/to/courses/webservice").get().map { courses =>
//        OK(views.html.student_courses(userName, courses))
//      }
//    }
  }
}