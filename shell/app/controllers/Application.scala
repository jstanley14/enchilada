package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Welcome to CAP - please sign in."))
  }

  def milCS(userName: String) = Action {
    Ok(views.html.mil_cs(userName))
  }

  def orgAdmin(userName: String) = Action {
    Ok(views.html.org_admin(userName))
  }

  def teacher(userName: String) = Action {
    Ok(views.html.teacher(userName))
  }

  def student(userName: String) = Action {
    Ok(views.html.student(userName))
  }

}