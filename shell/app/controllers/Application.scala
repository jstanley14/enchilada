package controllers

import play.api.mvc.{Controller, Action}

object Application extends Controller {

  def main = Action {
    Ok(views.html.main("CAP Login"))
  }
}