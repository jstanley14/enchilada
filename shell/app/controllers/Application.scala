package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def main = Action {
    Ok(views.html.main("CAP Login"))
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