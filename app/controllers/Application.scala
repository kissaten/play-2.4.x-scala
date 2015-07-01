package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action { request =>
    // print the request debug information
    println(s"*** content-type: ${request.contentType}")
    println(s"*** headers: ${request.headers}")
    println(s"*** body: ${request.body}")
    println(s"*** query string: ${request.rawQueryString}")

    Ok(views.html.index("Your new application is ready."))
  }

}
