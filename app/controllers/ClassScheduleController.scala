package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
  * Created by Taha Obed on 27.10.2016.
  */
@Singleton
class ClassScheduleController @Inject() extends Controller {
  def timetable = Action {
    val schedule =
      List(
        List("Montag", " Dienstag", " Mittwoch", " Donnerstag", " Freitag"),
        List("Montag", " Dienstag", " Mittwoch", " Donnerstag", " Freitag"),
        List("Montag", " Dienstag", " Mittwoch", " Donnerstag", " Freitag"),
        List("Montag", " Dienstag", " Mittwoch", " Donnerstag", " Freitag"),
        List("Montag", " Dienstag", " Mittwoch", " Donnerstag", " Freitag")
      )
    Ok(views.html.timetable("3.Semester")(schedule))
  }
}
