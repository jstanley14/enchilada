package controllers

import play.api.mvc._

object Teacher extends Controller {

  def home(userName: String) = Action {
    Ok(views.html.teacher(userName))
  }
}
