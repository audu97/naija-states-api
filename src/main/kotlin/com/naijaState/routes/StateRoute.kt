package com.naijaState.routes

import com.naijaState.data.model.State
import com.naijaState.states
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.stateRouting(){
   route("/state"){

       get{
            call.respond(HttpStatusCode.OK, states)

       }
       get("{stateId?}"){
           val id = call.parameters["stateId"] ?: return@get call.respondText(
               "Missing id",
               status = HttpStatusCode.BadRequest
           )
           val naijState =
               states.find { it.stateId == id } ?: return@get call.respondText(
                   "No state with id $id",
                   status = HttpStatusCode.NotFound
               )
           call.respond(naijState)

       }
   }
}