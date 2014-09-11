package controllers

import play.api.mvc._

object Student extends Controller {

  def home(userName: String) = Action {
    Ok(views.html.student(userName))
  }

  def gradebook(userName: String) = Action {
    Ok(views.html.student_gradebook(userName))
  }

  def courses(userName: String) = Action {
    Ok(views.html.student_courses(userName))
  }
}